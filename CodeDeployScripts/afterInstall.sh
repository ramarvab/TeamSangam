#echo 'Creating python 3.4 virtual environment'
#cd /opt/apache-tomcat-8.0.37/webapps/ROOT/services
#sudo /usr/local/bin/virtualenv -p /usr/bin/python3.4 weatherApp
#source /opt/apache-tomcat-8.0.37/webapps/ROOT/services/weatherApp/bin/activate

#echo 'Installing required python modules..'
#sudo /opt/apache-tomcat-8.0.37/webapps/ROOT/services/weatherApp/bin/pip3.4 install -r /home/ec2-user/requirements.txt

#echo 'Starting Tomcat Server'
#sh /opt/apache-tomcat-8.0.37/bin/startup.sh
#echo 'Starting login service..'
#sudo service mysqld start
#/opt/apache-tomcat-8.0.37/webapps/ROOT/services/weatherApp/bin/python3.4 login.py 
#echo 'Started login service, starting homepage service..'
#nohup /opt/apache-tomcat-8.0.37/webapps/ROOT/services/weatherApp/bin/python3.4 homepage.py 1> homepage.out 2> homepageErr.out &
#echo 'Started homepage service..'
#nohup /opt/apache-tomcat-8.0.37/webapps/ROOT/services/weatherApp/bin/python3.4 login.py 1> login.out 2> loginErr.out &
#cd /home/ec2-user/

echo "Building MongoDB docker image"
cd /home/ec2-user/DB_Dockers/registry_MongodDB
docker build -t imongo . || true

echo "Building mysqlDB docker image"
cd /home/ec2-user/DB_Dockers/userMySQLDB/
docker build -t iusermysqldb . || true

echo "Building login docker image"
cd /home/ec2-user/SGA_REST_login
docker build -t isgalogin . || true

echo "Building Homepage docker image"
cd /home/ec2-user/SGA_REST_Homepage
docker build -t isgahome . || true

echo "Build maven package for WeatherForecastClient"
cd /home/ec2-user/SGA_REST_WeatherForecastClient
echo "Copying the webpages into Gateway"
sudo cp -r /home/ec2-user/SGA_REST_login/* .
sudo cp /home/ec2-user/SGA_REST_Homepage/index.html .
sudo cp /home/ec2-user/SGA_REST_Homepage/scripts/* .
sudo cp /home/ec2-user/SGA_REST_Homepage/stylesheets/* .

mvn package
echo "Building gateway docker image"
docker build -t isgagateway . || true

echo "Build maven package for WeatherForecastClient"
cd /home/ec2-user/SGA_REST_DataIngest
mvn package
echo "Building dataingest docker image"
docker build -t isgadataingest . || true

echo "Build maven package for StormDetection"
cd /home/ec2-user/SGA_Rest_StormDetection
mvn package
echo "Building stormdetection docker image"
docker build -t isgastormdetection . || true

echo "Building maven package for StormClustering"
cd /home/ec2-user/SGA_Rest_StormClustering
mvn package
echo "Building stormclustering docker image"
docker build -t isgastormclustering . || true

echo "Building maven package for Forecast"
cd /home/ec2-user/SGA_REST_Forecast
mvn package

echo "Building maven package for ForecastDecision"
cd /home/ec2-user/SGA_REST_ForecastDecision
mvn package
mv ./target/SGA_REST_ForecastDecision.war /home/ec2-user/SGA_REST_ForecastDecision/SGA_REST_ForecastDecision.war

echo "Building docker image for Forecast Decision & Run Forecast"
cd /home/ec2-user/SGA_REST_Forecast
docker build -t isgaforecast . || true


echo "Building maven package for Registry"
cd /home/ec2-user/SGA_REST_Registry
mvn package

echo "Building docker image for Registry"
docker build -t isgaregistry . || true

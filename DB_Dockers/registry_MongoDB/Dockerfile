From ubuntu:latest

MAINTAINER ramarvab@gmail.com

RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 7F0CEB10 && echo 'deb http://downloads-distro.mongodb.org/repo/ubuntu-upstart dist 10gen' | tee /etc/apt/sources.list.d/mongodb.list
RUN apt-get update; apt-get install -y mongodb-10gen

VOLUME ["/data/mongodb"]

EXPOSE 27017

ENTRYPOINT ["/usr/bin/mongod"]
CMD ["--port", "27017", "--dbpath", "/data/mongodb", "--smallfiles"]

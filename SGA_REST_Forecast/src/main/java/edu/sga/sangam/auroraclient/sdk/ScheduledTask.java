/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.sga.sangam.auroraclient.sdk;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * A task that has been scheduled.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-21")
public class ScheduledTask implements org.apache.thrift.TBase<ScheduledTask, ScheduledTask._Fields>, java.io.Serializable, Cloneable, Comparable<ScheduledTask> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ScheduledTask");

  private static final org.apache.thrift.protocol.TField ASSIGNED_TASK_FIELD_DESC = new org.apache.thrift.protocol.TField("assignedTask", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FAILURE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("failureCount", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TASK_EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("taskEvents", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField ANCESTOR_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("ancestorId", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ScheduledTaskStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ScheduledTaskTupleSchemeFactory());
  }

  /**
   * The task that was scheduled.
   */
  public AssignedTask assignedTask; // required
  /**
   * The current status of this task.
   * 
   * @see ScheduleStatus
   */
  public ScheduleStatus status; // required
  /**
   * The number of failures that this task has accumulated over the multi-generational history of
   * this task.
   */
  public int failureCount; // required
  /**
   * State change history for this task.
   */
  public List<TaskEvent> taskEvents; // required
  /**
   * The task ID of the previous generation of this task.  When a task is automatically rescheduled,
   * a copy of the task is created and ancestor ID of the previous task's task ID.
   */
  public String ancestorId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The task that was scheduled.
     */
    ASSIGNED_TASK((short)1, "assignedTask"),
    /**
     * The current status of this task.
     * 
     * @see ScheduleStatus
     */
    STATUS((short)2, "status"),
    /**
     * The number of failures that this task has accumulated over the multi-generational history of
     * this task.
     */
    FAILURE_COUNT((short)3, "failureCount"),
    /**
     * State change history for this task.
     */
    TASK_EVENTS((short)4, "taskEvents"),
    /**
     * The task ID of the previous generation of this task.  When a task is automatically rescheduled,
     * a copy of the task is created and ancestor ID of the previous task's task ID.
     */
    ANCESTOR_ID((short)5, "ancestorId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ASSIGNED_TASK
          return ASSIGNED_TASK;
        case 2: // STATUS
          return STATUS;
        case 3: // FAILURE_COUNT
          return FAILURE_COUNT;
        case 4: // TASK_EVENTS
          return TASK_EVENTS;
        case 5: // ANCESTOR_ID
          return ANCESTOR_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __FAILURECOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ASSIGNED_TASK, new org.apache.thrift.meta_data.FieldMetaData("assignedTask", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AssignedTask.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ScheduleStatus.class)));
    tmpMap.put(_Fields.FAILURE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("failureCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TASK_EVENTS, new org.apache.thrift.meta_data.FieldMetaData("taskEvents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskEvent.class))));
    tmpMap.put(_Fields.ANCESTOR_ID, new org.apache.thrift.meta_data.FieldMetaData("ancestorId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ScheduledTask.class, metaDataMap);
  }

  public ScheduledTask() {
  }

  public ScheduledTask(
    AssignedTask assignedTask,
    ScheduleStatus status,
    int failureCount,
    List<TaskEvent> taskEvents,
    String ancestorId)
  {
    this();
    this.assignedTask = assignedTask;
    this.status = status;
    this.failureCount = failureCount;
    setFailureCountIsSet(true);
    this.taskEvents = taskEvents;
    this.ancestorId = ancestorId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScheduledTask(ScheduledTask other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAssignedTask()) {
      this.assignedTask = new AssignedTask(other.assignedTask);
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    this.failureCount = other.failureCount;
    if (other.isSetTaskEvents()) {
      List<TaskEvent> __this__taskEvents = new ArrayList<TaskEvent>(other.taskEvents.size());
      for (TaskEvent other_element : other.taskEvents) {
        __this__taskEvents.add(new TaskEvent(other_element));
      }
      this.taskEvents = __this__taskEvents;
    }
    if (other.isSetAncestorId()) {
      this.ancestorId = other.ancestorId;
    }
  }

  public ScheduledTask deepCopy() {
    return new ScheduledTask(this);
  }

  @Override
  public void clear() {
    this.assignedTask = null;
    this.status = null;
    setFailureCountIsSet(false);
    this.failureCount = 0;
    this.taskEvents = null;
    this.ancestorId = null;
  }

  /**
   * The task that was scheduled.
   */
  public AssignedTask getAssignedTask() {
    return this.assignedTask;
  }

  /**
   * The task that was scheduled.
   */
  public ScheduledTask setAssignedTask(AssignedTask assignedTask) {
    this.assignedTask = assignedTask;
    return this;
  }

  public void unsetAssignedTask() {
    this.assignedTask = null;
  }

  /** Returns true if field assignedTask is set (has been assigned a value) and false otherwise */
  public boolean isSetAssignedTask() {
    return this.assignedTask != null;
  }

  public void setAssignedTaskIsSet(boolean value) {
    if (!value) {
      this.assignedTask = null;
    }
  }

  /**
   * The current status of this task.
   * 
   * @see ScheduleStatus
   */
  public ScheduleStatus getStatus() {
    return this.status;
  }

  /**
   * The current status of this task.
   * 
   * @see ScheduleStatus
   */
  public ScheduledTask setStatus(ScheduleStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  /**
   * The number of failures that this task has accumulated over the multi-generational history of
   * this task.
   */
  public int getFailureCount() {
    return this.failureCount;
  }

  /**
   * The number of failures that this task has accumulated over the multi-generational history of
   * this task.
   */
  public ScheduledTask setFailureCount(int failureCount) {
    this.failureCount = failureCount;
    setFailureCountIsSet(true);
    return this;
  }

  public void unsetFailureCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FAILURECOUNT_ISSET_ID);
  }

  /** Returns true if field failureCount is set (has been assigned a value) and false otherwise */
  public boolean isSetFailureCount() {
    return EncodingUtils.testBit(__isset_bitfield, __FAILURECOUNT_ISSET_ID);
  }

  public void setFailureCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FAILURECOUNT_ISSET_ID, value);
  }

  public int getTaskEventsSize() {
    return (this.taskEvents == null) ? 0 : this.taskEvents.size();
  }

  public java.util.Iterator<TaskEvent> getTaskEventsIterator() {
    return (this.taskEvents == null) ? null : this.taskEvents.iterator();
  }

  public void addToTaskEvents(TaskEvent elem) {
    if (this.taskEvents == null) {
      this.taskEvents = new ArrayList<TaskEvent>();
    }
    this.taskEvents.add(elem);
  }

  /**
   * State change history for this task.
   */
  public List<TaskEvent> getTaskEvents() {
    return this.taskEvents;
  }

  /**
   * State change history for this task.
   */
  public ScheduledTask setTaskEvents(List<TaskEvent> taskEvents) {
    this.taskEvents = taskEvents;
    return this;
  }

  public void unsetTaskEvents() {
    this.taskEvents = null;
  }

  /** Returns true if field taskEvents is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskEvents() {
    return this.taskEvents != null;
  }

  public void setTaskEventsIsSet(boolean value) {
    if (!value) {
      this.taskEvents = null;
    }
  }

  /**
   * The task ID of the previous generation of this task.  When a task is automatically rescheduled,
   * a copy of the task is created and ancestor ID of the previous task's task ID.
   */
  public String getAncestorId() {
    return this.ancestorId;
  }

  /**
   * The task ID of the previous generation of this task.  When a task is automatically rescheduled,
   * a copy of the task is created and ancestor ID of the previous task's task ID.
   */
  public ScheduledTask setAncestorId(String ancestorId) {
    this.ancestorId = ancestorId;
    return this;
  }

  public void unsetAncestorId() {
    this.ancestorId = null;
  }

  /** Returns true if field ancestorId is set (has been assigned a value) and false otherwise */
  public boolean isSetAncestorId() {
    return this.ancestorId != null;
  }

  public void setAncestorIdIsSet(boolean value) {
    if (!value) {
      this.ancestorId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ASSIGNED_TASK:
      if (value == null) {
        unsetAssignedTask();
      } else {
        setAssignedTask((AssignedTask)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((ScheduleStatus)value);
      }
      break;

    case FAILURE_COUNT:
      if (value == null) {
        unsetFailureCount();
      } else {
        setFailureCount((Integer)value);
      }
      break;

    case TASK_EVENTS:
      if (value == null) {
        unsetTaskEvents();
      } else {
        setTaskEvents((List<TaskEvent>)value);
      }
      break;

    case ANCESTOR_ID:
      if (value == null) {
        unsetAncestorId();
      } else {
        setAncestorId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ASSIGNED_TASK:
      return getAssignedTask();

    case STATUS:
      return getStatus();

    case FAILURE_COUNT:
      return getFailureCount();

    case TASK_EVENTS:
      return getTaskEvents();

    case ANCESTOR_ID:
      return getAncestorId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ASSIGNED_TASK:
      return isSetAssignedTask();
    case STATUS:
      return isSetStatus();
    case FAILURE_COUNT:
      return isSetFailureCount();
    case TASK_EVENTS:
      return isSetTaskEvents();
    case ANCESTOR_ID:
      return isSetAncestorId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScheduledTask)
      return this.equals((ScheduledTask)that);
    return false;
  }

  public boolean equals(ScheduledTask that) {
    if (that == null)
      return false;

    boolean this_present_assignedTask = true && this.isSetAssignedTask();
    boolean that_present_assignedTask = true && that.isSetAssignedTask();
    if (this_present_assignedTask || that_present_assignedTask) {
      if (!(this_present_assignedTask && that_present_assignedTask))
        return false;
      if (!this.assignedTask.equals(that.assignedTask))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_failureCount = true;
    boolean that_present_failureCount = true;
    if (this_present_failureCount || that_present_failureCount) {
      if (!(this_present_failureCount && that_present_failureCount))
        return false;
      if (this.failureCount != that.failureCount)
        return false;
    }

    boolean this_present_taskEvents = true && this.isSetTaskEvents();
    boolean that_present_taskEvents = true && that.isSetTaskEvents();
    if (this_present_taskEvents || that_present_taskEvents) {
      if (!(this_present_taskEvents && that_present_taskEvents))
        return false;
      if (!this.taskEvents.equals(that.taskEvents))
        return false;
    }

    boolean this_present_ancestorId = true && this.isSetAncestorId();
    boolean that_present_ancestorId = true && that.isSetAncestorId();
    if (this_present_ancestorId || that_present_ancestorId) {
      if (!(this_present_ancestorId && that_present_ancestorId))
        return false;
      if (!this.ancestorId.equals(that.ancestorId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_assignedTask = true && (isSetAssignedTask());
    list.add(present_assignedTask);
    if (present_assignedTask)
      list.add(assignedTask);

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_failureCount = true;
    list.add(present_failureCount);
    if (present_failureCount)
      list.add(failureCount);

    boolean present_taskEvents = true && (isSetTaskEvents());
    list.add(present_taskEvents);
    if (present_taskEvents)
      list.add(taskEvents);

    boolean present_ancestorId = true && (isSetAncestorId());
    list.add(present_ancestorId);
    if (present_ancestorId)
      list.add(ancestorId);

    return list.hashCode();
  }

  @Override
  public int compareTo(ScheduledTask other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAssignedTask()).compareTo(other.isSetAssignedTask());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAssignedTask()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.assignedTask, other.assignedTask);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFailureCount()).compareTo(other.isSetFailureCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFailureCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.failureCount, other.failureCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTaskEvents()).compareTo(other.isSetTaskEvents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskEvents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskEvents, other.taskEvents);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAncestorId()).compareTo(other.isSetAncestorId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAncestorId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ancestorId, other.ancestorId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ScheduledTask(");
    boolean first = true;

    sb.append("assignedTask:");
    if (this.assignedTask == null) {
      sb.append("null");
    } else {
      sb.append(this.assignedTask);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("failureCount:");
    sb.append(this.failureCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskEvents:");
    if (this.taskEvents == null) {
      sb.append("null");
    } else {
      sb.append(this.taskEvents);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ancestorId:");
    if (this.ancestorId == null) {
      sb.append("null");
    } else {
      sb.append(this.ancestorId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (assignedTask != null) {
      assignedTask.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ScheduledTaskStandardSchemeFactory implements SchemeFactory {
    public ScheduledTaskStandardScheme getScheme() {
      return new ScheduledTaskStandardScheme();
    }
  }

  private static class ScheduledTaskStandardScheme extends StandardScheme<ScheduledTask> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ScheduledTask struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ASSIGNED_TASK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.assignedTask = new AssignedTask();
              struct.assignedTask.read(iprot);
              struct.setAssignedTaskIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = edu.sga.sangam.auroraclient.sdk.ScheduleStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FAILURE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.failureCount = iprot.readI32();
              struct.setFailureCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TASK_EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list118 = iprot.readListBegin();
                struct.taskEvents = new ArrayList<TaskEvent>(_list118.size);
                TaskEvent _elem119;
                for (int _i120 = 0; _i120 < _list118.size; ++_i120)
                {
                  _elem119 = new TaskEvent();
                  _elem119.read(iprot);
                  struct.taskEvents.add(_elem119);
                }
                iprot.readListEnd();
              }
              struct.setTaskEventsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ANCESTOR_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ancestorId = iprot.readString();
              struct.setAncestorIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ScheduledTask struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.assignedTask != null) {
        oprot.writeFieldBegin(ASSIGNED_TASK_FIELD_DESC);
        struct.assignedTask.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FAILURE_COUNT_FIELD_DESC);
      oprot.writeI32(struct.failureCount);
      oprot.writeFieldEnd();
      if (struct.taskEvents != null) {
        oprot.writeFieldBegin(TASK_EVENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.taskEvents.size()));
          for (TaskEvent _iter121 : struct.taskEvents)
          {
            _iter121.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.ancestorId != null) {
        oprot.writeFieldBegin(ANCESTOR_ID_FIELD_DESC);
        oprot.writeString(struct.ancestorId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ScheduledTaskTupleSchemeFactory implements SchemeFactory {
    public ScheduledTaskTupleScheme getScheme() {
      return new ScheduledTaskTupleScheme();
    }
  }

  private static class ScheduledTaskTupleScheme extends TupleScheme<ScheduledTask> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ScheduledTask struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAssignedTask()) {
        optionals.set(0);
      }
      if (struct.isSetStatus()) {
        optionals.set(1);
      }
      if (struct.isSetFailureCount()) {
        optionals.set(2);
      }
      if (struct.isSetTaskEvents()) {
        optionals.set(3);
      }
      if (struct.isSetAncestorId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAssignedTask()) {
        struct.assignedTask.write(oprot);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetFailureCount()) {
        oprot.writeI32(struct.failureCount);
      }
      if (struct.isSetTaskEvents()) {
        {
          oprot.writeI32(struct.taskEvents.size());
          for (TaskEvent _iter122 : struct.taskEvents)
          {
            _iter122.write(oprot);
          }
        }
      }
      if (struct.isSetAncestorId()) {
        oprot.writeString(struct.ancestorId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ScheduledTask struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.assignedTask = new AssignedTask();
        struct.assignedTask.read(iprot);
        struct.setAssignedTaskIsSet(true);
      }
      if (incoming.get(1)) {
        struct.status = edu.sga.sangam.auroraclient.sdk.ScheduleStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(2)) {
        struct.failureCount = iprot.readI32();
        struct.setFailureCountIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list123 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.taskEvents = new ArrayList<TaskEvent>(_list123.size);
          TaskEvent _elem124;
          for (int _i125 = 0; _i125 < _list123.size; ++_i125)
          {
            _elem124 = new TaskEvent();
            _elem124.read(iprot);
            struct.taskEvents.add(_elem124);
          }
        }
        struct.setTaskEventsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.ancestorId = iprot.readString();
        struct.setAncestorIdIsSet(true);
      }
    }
  }

}


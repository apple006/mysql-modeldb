/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package modeldb;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-08-01")
public class RandomSplitEventResponse implements org.apache.thrift.TBase<RandomSplitEventResponse, RandomSplitEventResponse._Fields>, java.io.Serializable, Cloneable, Comparable<RandomSplitEventResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RandomSplitEventResponse");

  private static final org.apache.thrift.protocol.TField OLD_DATA_FRAME_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("oldDataFrameId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SPLIT_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("splitIds", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SPLIT_EVENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("splitEventId", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RandomSplitEventResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RandomSplitEventResponseTupleSchemeFactory());
  }

  public int oldDataFrameId; // required
  public List<Integer> splitIds; // required
  public int splitEventId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OLD_DATA_FRAME_ID((short)1, "oldDataFrameId"),
    SPLIT_IDS((short)2, "splitIds"),
    SPLIT_EVENT_ID((short)3, "splitEventId");

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
        case 1: // OLD_DATA_FRAME_ID
          return OLD_DATA_FRAME_ID;
        case 2: // SPLIT_IDS
          return SPLIT_IDS;
        case 3: // SPLIT_EVENT_ID
          return SPLIT_EVENT_ID;
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
  private static final int __OLDDATAFRAMEID_ISSET_ID = 0;
  private static final int __SPLITEVENTID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OLD_DATA_FRAME_ID, new org.apache.thrift.meta_data.FieldMetaData("oldDataFrameId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SPLIT_IDS, new org.apache.thrift.meta_data.FieldMetaData("splitIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.SPLIT_EVENT_ID, new org.apache.thrift.meta_data.FieldMetaData("splitEventId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RandomSplitEventResponse.class, metaDataMap);
  }

  public RandomSplitEventResponse() {
  }

  public RandomSplitEventResponse(
    int oldDataFrameId,
    List<Integer> splitIds,
    int splitEventId)
  {
    this();
    this.oldDataFrameId = oldDataFrameId;
    setOldDataFrameIdIsSet(true);
    this.splitIds = splitIds;
    this.splitEventId = splitEventId;
    setSplitEventIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RandomSplitEventResponse(RandomSplitEventResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.oldDataFrameId = other.oldDataFrameId;
    if (other.isSetSplitIds()) {
      List<Integer> __this__splitIds = new ArrayList<Integer>(other.splitIds);
      this.splitIds = __this__splitIds;
    }
    this.splitEventId = other.splitEventId;
  }

  public RandomSplitEventResponse deepCopy() {
    return new RandomSplitEventResponse(this);
  }

  @Override
  public void clear() {
    setOldDataFrameIdIsSet(false);
    this.oldDataFrameId = 0;
    this.splitIds = null;
    setSplitEventIdIsSet(false);
    this.splitEventId = 0;
  }

  public int getOldDataFrameId() {
    return this.oldDataFrameId;
  }

  public RandomSplitEventResponse setOldDataFrameId(int oldDataFrameId) {
    this.oldDataFrameId = oldDataFrameId;
    setOldDataFrameIdIsSet(true);
    return this;
  }

  public void unsetOldDataFrameId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OLDDATAFRAMEID_ISSET_ID);
  }

  /** Returns true if field oldDataFrameId is set (has been assigned a value) and false otherwise */
  public boolean isSetOldDataFrameId() {
    return EncodingUtils.testBit(__isset_bitfield, __OLDDATAFRAMEID_ISSET_ID);
  }

  public void setOldDataFrameIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OLDDATAFRAMEID_ISSET_ID, value);
  }

  public int getSplitIdsSize() {
    return (this.splitIds == null) ? 0 : this.splitIds.size();
  }

  public java.util.Iterator<Integer> getSplitIdsIterator() {
    return (this.splitIds == null) ? null : this.splitIds.iterator();
  }

  public void addToSplitIds(int elem) {
    if (this.splitIds == null) {
      this.splitIds = new ArrayList<Integer>();
    }
    this.splitIds.add(elem);
  }

  public List<Integer> getSplitIds() {
    return this.splitIds;
  }

  public RandomSplitEventResponse setSplitIds(List<Integer> splitIds) {
    this.splitIds = splitIds;
    return this;
  }

  public void unsetSplitIds() {
    this.splitIds = null;
  }

  /** Returns true if field splitIds is set (has been assigned a value) and false otherwise */
  public boolean isSetSplitIds() {
    return this.splitIds != null;
  }

  public void setSplitIdsIsSet(boolean value) {
    if (!value) {
      this.splitIds = null;
    }
  }

  public int getSplitEventId() {
    return this.splitEventId;
  }

  public RandomSplitEventResponse setSplitEventId(int splitEventId) {
    this.splitEventId = splitEventId;
    setSplitEventIdIsSet(true);
    return this;
  }

  public void unsetSplitEventId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SPLITEVENTID_ISSET_ID);
  }

  /** Returns true if field splitEventId is set (has been assigned a value) and false otherwise */
  public boolean isSetSplitEventId() {
    return EncodingUtils.testBit(__isset_bitfield, __SPLITEVENTID_ISSET_ID);
  }

  public void setSplitEventIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SPLITEVENTID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OLD_DATA_FRAME_ID:
      if (value == null) {
        unsetOldDataFrameId();
      } else {
        setOldDataFrameId((Integer)value);
      }
      break;

    case SPLIT_IDS:
      if (value == null) {
        unsetSplitIds();
      } else {
        setSplitIds((List<Integer>)value);
      }
      break;

    case SPLIT_EVENT_ID:
      if (value == null) {
        unsetSplitEventId();
      } else {
        setSplitEventId((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OLD_DATA_FRAME_ID:
      return getOldDataFrameId();

    case SPLIT_IDS:
      return getSplitIds();

    case SPLIT_EVENT_ID:
      return getSplitEventId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OLD_DATA_FRAME_ID:
      return isSetOldDataFrameId();
    case SPLIT_IDS:
      return isSetSplitIds();
    case SPLIT_EVENT_ID:
      return isSetSplitEventId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RandomSplitEventResponse)
      return this.equals((RandomSplitEventResponse)that);
    return false;
  }

  public boolean equals(RandomSplitEventResponse that) {
    if (that == null)
      return false;

    boolean this_present_oldDataFrameId = true;
    boolean that_present_oldDataFrameId = true;
    if (this_present_oldDataFrameId || that_present_oldDataFrameId) {
      if (!(this_present_oldDataFrameId && that_present_oldDataFrameId))
        return false;
      if (this.oldDataFrameId != that.oldDataFrameId)
        return false;
    }

    boolean this_present_splitIds = true && this.isSetSplitIds();
    boolean that_present_splitIds = true && that.isSetSplitIds();
    if (this_present_splitIds || that_present_splitIds) {
      if (!(this_present_splitIds && that_present_splitIds))
        return false;
      if (!this.splitIds.equals(that.splitIds))
        return false;
    }

    boolean this_present_splitEventId = true;
    boolean that_present_splitEventId = true;
    if (this_present_splitEventId || that_present_splitEventId) {
      if (!(this_present_splitEventId && that_present_splitEventId))
        return false;
      if (this.splitEventId != that.splitEventId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_oldDataFrameId = true;
    list.add(present_oldDataFrameId);
    if (present_oldDataFrameId)
      list.add(oldDataFrameId);

    boolean present_splitIds = true && (isSetSplitIds());
    list.add(present_splitIds);
    if (present_splitIds)
      list.add(splitIds);

    boolean present_splitEventId = true;
    list.add(present_splitEventId);
    if (present_splitEventId)
      list.add(splitEventId);

    return list.hashCode();
  }

  @Override
  public int compareTo(RandomSplitEventResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOldDataFrameId()).compareTo(other.isSetOldDataFrameId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldDataFrameId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldDataFrameId, other.oldDataFrameId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSplitIds()).compareTo(other.isSetSplitIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSplitIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.splitIds, other.splitIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSplitEventId()).compareTo(other.isSetSplitEventId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSplitEventId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.splitEventId, other.splitEventId);
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
    StringBuilder sb = new StringBuilder("RandomSplitEventResponse(");
    boolean first = true;

    sb.append("oldDataFrameId:");
    sb.append(this.oldDataFrameId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("splitIds:");
    if (this.splitIds == null) {
      sb.append("null");
    } else {
      sb.append(this.splitIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("splitEventId:");
    sb.append(this.splitEventId);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class RandomSplitEventResponseStandardSchemeFactory implements SchemeFactory {
    public RandomSplitEventResponseStandardScheme getScheme() {
      return new RandomSplitEventResponseStandardScheme();
    }
  }

  private static class RandomSplitEventResponseStandardScheme extends StandardScheme<RandomSplitEventResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RandomSplitEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OLD_DATA_FRAME_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.oldDataFrameId = iprot.readI32();
              struct.setOldDataFrameIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SPLIT_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list96 = iprot.readListBegin();
                struct.splitIds = new ArrayList<Integer>(_list96.size);
                int _elem97;
                for (int _i98 = 0; _i98 < _list96.size; ++_i98)
                {
                  _elem97 = iprot.readI32();
                  struct.splitIds.add(_elem97);
                }
                iprot.readListEnd();
              }
              struct.setSplitIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPLIT_EVENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.splitEventId = iprot.readI32();
              struct.setSplitEventIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RandomSplitEventResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OLD_DATA_FRAME_ID_FIELD_DESC);
      oprot.writeI32(struct.oldDataFrameId);
      oprot.writeFieldEnd();
      if (struct.splitIds != null) {
        oprot.writeFieldBegin(SPLIT_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.splitIds.size()));
          for (int _iter99 : struct.splitIds)
          {
            oprot.writeI32(_iter99);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SPLIT_EVENT_ID_FIELD_DESC);
      oprot.writeI32(struct.splitEventId);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RandomSplitEventResponseTupleSchemeFactory implements SchemeFactory {
    public RandomSplitEventResponseTupleScheme getScheme() {
      return new RandomSplitEventResponseTupleScheme();
    }
  }

  private static class RandomSplitEventResponseTupleScheme extends TupleScheme<RandomSplitEventResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RandomSplitEventResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOldDataFrameId()) {
        optionals.set(0);
      }
      if (struct.isSetSplitIds()) {
        optionals.set(1);
      }
      if (struct.isSetSplitEventId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetOldDataFrameId()) {
        oprot.writeI32(struct.oldDataFrameId);
      }
      if (struct.isSetSplitIds()) {
        {
          oprot.writeI32(struct.splitIds.size());
          for (int _iter100 : struct.splitIds)
          {
            oprot.writeI32(_iter100);
          }
        }
      }
      if (struct.isSetSplitEventId()) {
        oprot.writeI32(struct.splitEventId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RandomSplitEventResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.oldDataFrameId = iprot.readI32();
        struct.setOldDataFrameIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list101 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.splitIds = new ArrayList<Integer>(_list101.size);
          int _elem102;
          for (int _i103 = 0; _i103 < _list101.size; ++_i103)
          {
            _elem102 = iprot.readI32();
            struct.splitIds.add(_elem102);
          }
        }
        struct.setSplitIdsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.splitEventId = iprot.readI32();
        struct.setSplitEventIdIsSet(true);
      }
    }
  }

}


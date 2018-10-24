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
public class ProjectOverviewResponse implements org.apache.thrift.TBase<ProjectOverviewResponse, ProjectOverviewResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ProjectOverviewResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProjectOverviewResponse");

  private static final org.apache.thrift.protocol.TField PROJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("project", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_EXPERIMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("numExperiments", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_EXPERIMENT_RUNS_FIELD_DESC = new org.apache.thrift.protocol.TField("numExperimentRuns", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProjectOverviewResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProjectOverviewResponseTupleSchemeFactory());
  }

  public Project project; // required
  public int numExperiments; // required
  public int numExperimentRuns; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROJECT((short)1, "project"),
    NUM_EXPERIMENTS((short)2, "numExperiments"),
    NUM_EXPERIMENT_RUNS((short)3, "numExperimentRuns");

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
        case 1: // PROJECT
          return PROJECT;
        case 2: // NUM_EXPERIMENTS
          return NUM_EXPERIMENTS;
        case 3: // NUM_EXPERIMENT_RUNS
          return NUM_EXPERIMENT_RUNS;
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
  private static final int __NUMEXPERIMENTS_ISSET_ID = 0;
  private static final int __NUMEXPERIMENTRUNS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROJECT, new org.apache.thrift.meta_data.FieldMetaData("project", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Project.class)));
    tmpMap.put(_Fields.NUM_EXPERIMENTS, new org.apache.thrift.meta_data.FieldMetaData("numExperiments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUM_EXPERIMENT_RUNS, new org.apache.thrift.meta_data.FieldMetaData("numExperimentRuns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProjectOverviewResponse.class, metaDataMap);
  }

  public ProjectOverviewResponse() {
  }

  public ProjectOverviewResponse(
    Project project,
    int numExperiments,
    int numExperimentRuns)
  {
    this();
    this.project = project;
    this.numExperiments = numExperiments;
    setNumExperimentsIsSet(true);
    this.numExperimentRuns = numExperimentRuns;
    setNumExperimentRunsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProjectOverviewResponse(ProjectOverviewResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProject()) {
      this.project = new Project(other.project);
    }
    this.numExperiments = other.numExperiments;
    this.numExperimentRuns = other.numExperimentRuns;
  }

  public ProjectOverviewResponse deepCopy() {
    return new ProjectOverviewResponse(this);
  }

  @Override
  public void clear() {
    this.project = null;
    setNumExperimentsIsSet(false);
    this.numExperiments = 0;
    setNumExperimentRunsIsSet(false);
    this.numExperimentRuns = 0;
  }

  public Project getProject() {
    return this.project;
  }

  public ProjectOverviewResponse setProject(Project project) {
    this.project = project;
    return this;
  }

  public void unsetProject() {
    this.project = null;
  }

  /** Returns true if field project is set (has been assigned a value) and false otherwise */
  public boolean isSetProject() {
    return this.project != null;
  }

  public void setProjectIsSet(boolean value) {
    if (!value) {
      this.project = null;
    }
  }

  public int getNumExperiments() {
    return this.numExperiments;
  }

  public ProjectOverviewResponse setNumExperiments(int numExperiments) {
    this.numExperiments = numExperiments;
    setNumExperimentsIsSet(true);
    return this;
  }

  public void unsetNumExperiments() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMEXPERIMENTS_ISSET_ID);
  }

  /** Returns true if field numExperiments is set (has been assigned a value) and false otherwise */
  public boolean isSetNumExperiments() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMEXPERIMENTS_ISSET_ID);
  }

  public void setNumExperimentsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMEXPERIMENTS_ISSET_ID, value);
  }

  public int getNumExperimentRuns() {
    return this.numExperimentRuns;
  }

  public ProjectOverviewResponse setNumExperimentRuns(int numExperimentRuns) {
    this.numExperimentRuns = numExperimentRuns;
    setNumExperimentRunsIsSet(true);
    return this;
  }

  public void unsetNumExperimentRuns() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMEXPERIMENTRUNS_ISSET_ID);
  }

  /** Returns true if field numExperimentRuns is set (has been assigned a value) and false otherwise */
  public boolean isSetNumExperimentRuns() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMEXPERIMENTRUNS_ISSET_ID);
  }

  public void setNumExperimentRunsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMEXPERIMENTRUNS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROJECT:
      if (value == null) {
        unsetProject();
      } else {
        setProject((Project)value);
      }
      break;

    case NUM_EXPERIMENTS:
      if (value == null) {
        unsetNumExperiments();
      } else {
        setNumExperiments((Integer)value);
      }
      break;

    case NUM_EXPERIMENT_RUNS:
      if (value == null) {
        unsetNumExperimentRuns();
      } else {
        setNumExperimentRuns((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROJECT:
      return getProject();

    case NUM_EXPERIMENTS:
      return getNumExperiments();

    case NUM_EXPERIMENT_RUNS:
      return getNumExperimentRuns();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROJECT:
      return isSetProject();
    case NUM_EXPERIMENTS:
      return isSetNumExperiments();
    case NUM_EXPERIMENT_RUNS:
      return isSetNumExperimentRuns();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProjectOverviewResponse)
      return this.equals((ProjectOverviewResponse)that);
    return false;
  }

  public boolean equals(ProjectOverviewResponse that) {
    if (that == null)
      return false;

    boolean this_present_project = true && this.isSetProject();
    boolean that_present_project = true && that.isSetProject();
    if (this_present_project || that_present_project) {
      if (!(this_present_project && that_present_project))
        return false;
      if (!this.project.equals(that.project))
        return false;
    }

    boolean this_present_numExperiments = true;
    boolean that_present_numExperiments = true;
    if (this_present_numExperiments || that_present_numExperiments) {
      if (!(this_present_numExperiments && that_present_numExperiments))
        return false;
      if (this.numExperiments != that.numExperiments)
        return false;
    }

    boolean this_present_numExperimentRuns = true;
    boolean that_present_numExperimentRuns = true;
    if (this_present_numExperimentRuns || that_present_numExperimentRuns) {
      if (!(this_present_numExperimentRuns && that_present_numExperimentRuns))
        return false;
      if (this.numExperimentRuns != that.numExperimentRuns)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_project = true && (isSetProject());
    list.add(present_project);
    if (present_project)
      list.add(project);

    boolean present_numExperiments = true;
    list.add(present_numExperiments);
    if (present_numExperiments)
      list.add(numExperiments);

    boolean present_numExperimentRuns = true;
    list.add(present_numExperimentRuns);
    if (present_numExperimentRuns)
      list.add(numExperimentRuns);

    return list.hashCode();
  }

  @Override
  public int compareTo(ProjectOverviewResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProject()).compareTo(other.isSetProject());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProject()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.project, other.project);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumExperiments()).compareTo(other.isSetNumExperiments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumExperiments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numExperiments, other.numExperiments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumExperimentRuns()).compareTo(other.isSetNumExperimentRuns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumExperimentRuns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numExperimentRuns, other.numExperimentRuns);
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
    StringBuilder sb = new StringBuilder("ProjectOverviewResponse(");
    boolean first = true;

    sb.append("project:");
    if (this.project == null) {
      sb.append("null");
    } else {
      sb.append(this.project);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("numExperiments:");
    sb.append(this.numExperiments);
    first = false;
    if (!first) sb.append(", ");
    sb.append("numExperimentRuns:");
    sb.append(this.numExperimentRuns);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (project != null) {
      project.validate();
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

  private static class ProjectOverviewResponseStandardSchemeFactory implements SchemeFactory {
    public ProjectOverviewResponseStandardScheme getScheme() {
      return new ProjectOverviewResponseStandardScheme();
    }
  }

  private static class ProjectOverviewResponseStandardScheme extends StandardScheme<ProjectOverviewResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProjectOverviewResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.project = new Project();
              struct.project.read(iprot);
              struct.setProjectIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_EXPERIMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numExperiments = iprot.readI32();
              struct.setNumExperimentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_EXPERIMENT_RUNS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numExperimentRuns = iprot.readI32();
              struct.setNumExperimentRunsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProjectOverviewResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.project != null) {
        oprot.writeFieldBegin(PROJECT_FIELD_DESC);
        struct.project.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NUM_EXPERIMENTS_FIELD_DESC);
      oprot.writeI32(struct.numExperiments);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_EXPERIMENT_RUNS_FIELD_DESC);
      oprot.writeI32(struct.numExperimentRuns);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProjectOverviewResponseTupleSchemeFactory implements SchemeFactory {
    public ProjectOverviewResponseTupleScheme getScheme() {
      return new ProjectOverviewResponseTupleScheme();
    }
  }

  private static class ProjectOverviewResponseTupleScheme extends TupleScheme<ProjectOverviewResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProjectOverviewResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProject()) {
        optionals.set(0);
      }
      if (struct.isSetNumExperiments()) {
        optionals.set(1);
      }
      if (struct.isSetNumExperimentRuns()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetProject()) {
        struct.project.write(oprot);
      }
      if (struct.isSetNumExperiments()) {
        oprot.writeI32(struct.numExperiments);
      }
      if (struct.isSetNumExperimentRuns()) {
        oprot.writeI32(struct.numExperimentRuns);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProjectOverviewResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.project = new Project();
        struct.project.read(iprot);
        struct.setProjectIsSet(true);
      }
      if (incoming.get(1)) {
        struct.numExperiments = iprot.readI32();
        struct.setNumExperimentsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.numExperimentRuns = iprot.readI32();
        struct.setNumExperimentRunsIsSet(true);
      }
    }
  }

}


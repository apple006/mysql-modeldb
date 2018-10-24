/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package modeldb;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ProblemType implements org.apache.thrift.TEnum {
  UNDEFINED(0),
  BINARY_CLASSIFICATION(1),
  MULTICLASS_CLASSIFICATION(2),
  REGRESSION(3),
  CLUSTERING(4),
  RECOMMENDATION(5);

  private final int value;

  private ProblemType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ProblemType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNDEFINED;
      case 1:
        return BINARY_CLASSIFICATION;
      case 2:
        return MULTICLASS_CLASSIFICATION;
      case 3:
        return REGRESSION;
      case 4:
        return CLUSTERING;
      case 5:
        return RECOMMENDATION;
      default:
        return null;
    }
  }
}
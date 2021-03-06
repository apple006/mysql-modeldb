/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.records;


import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Dataframesplit;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataframesplitRecord extends UpdatableRecordImpl<DataframesplitRecord> implements Record5<Integer, Integer, Double, Integer, Integer> {

    private static final long serialVersionUID = -758359864;

    /**
     * Setter for <code>modeldb_test.DataFrameSplit.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.DataFrameSplit.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.DataFrameSplit.splitEventId</code>.
     */
    public void setSpliteventid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.DataFrameSplit.splitEventId</code>.
     */
    public Integer getSpliteventid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb_test.DataFrameSplit.weight</code>.
     */
    public void setWeight(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.DataFrameSplit.weight</code>.
     */
    public Double getWeight() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>modeldb_test.DataFrameSplit.dataFrameId</code>.
     */
    public void setDataframeid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb_test.DataFrameSplit.dataFrameId</code>.
     */
    public Integer getDataframeid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>modeldb_test.DataFrameSplit.experimentRun</code>.
     */
    public void setExperimentrun(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>modeldb_test.DataFrameSplit.experimentRun</code>.
     */
    public Integer getExperimentrun() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Double, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Double, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dataframesplit.DATAFRAMESPLIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Dataframesplit.DATAFRAMESPLIT.SPLITEVENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Dataframesplit.DATAFRAMESPLIT.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Dataframesplit.DATAFRAMESPLIT.DATAFRAMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Dataframesplit.DATAFRAMESPLIT.EXPERIMENTRUN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSpliteventid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDataframeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getExperimentrun();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframesplitRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframesplitRecord value2(Integer value) {
        setSpliteventid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframesplitRecord value3(Double value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframesplitRecord value4(Integer value) {
        setDataframeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframesplitRecord value5(Integer value) {
        setExperimentrun(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframesplitRecord values(Integer value1, Integer value2, Double value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DataframesplitRecord
     */
    public DataframesplitRecord() {
        super(Dataframesplit.DATAFRAMESPLIT);
    }

    /**
     * Create a detached, initialised DataframesplitRecord
     */
    public DataframesplitRecord(Integer id, Integer spliteventid, Double weight, Integer dataframeid, Integer experimentrun) {
        super(Dataframesplit.DATAFRAMESPLIT);

        set(0, id);
        set(1, spliteventid);
        set(2, weight);
        set(3, dataframeid);
        set(4, experimentrun);
    }
}

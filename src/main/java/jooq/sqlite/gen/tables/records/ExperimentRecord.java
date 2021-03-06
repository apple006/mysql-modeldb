/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Experiment;

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
public class ExperimentRecord extends UpdatableRecordImpl<ExperimentRecord> implements Record5<Integer, Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -2096768730;

    /**
     * Setter for <code>modeldb_test.Experiment.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.Experiment.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.Experiment.project</code>.
     */
    public void setProject(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.Experiment.project</code>.
     */
    public Integer getProject() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb_test.Experiment.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.Experiment.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>modeldb_test.Experiment.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb_test.Experiment.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>modeldb_test.Experiment.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>modeldb_test.Experiment.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(4);
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
    public Row5<Integer, Integer, String, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Experiment.EXPERIMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Experiment.EXPERIMENT.PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Experiment.EXPERIMENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Experiment.EXPERIMENT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Experiment.EXPERIMENT.CREATED;
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
        return getProject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentRecord value2(Integer value) {
        setProject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentRecord value5(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentRecord values(Integer value1, Integer value2, String value3, String value4, Timestamp value5) {
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
     * Create a detached ExperimentRecord
     */
    public ExperimentRecord() {
        super(Experiment.EXPERIMENT);
    }

    /**
     * Create a detached, initialised ExperimentRecord
     */
    public ExperimentRecord(Integer id, Integer project, String name, String description, Timestamp created) {
        super(Experiment.EXPERIMENT);

        set(0, id);
        set(1, project);
        set(2, name);
        set(3, description);
        set(4, created);
    }
}

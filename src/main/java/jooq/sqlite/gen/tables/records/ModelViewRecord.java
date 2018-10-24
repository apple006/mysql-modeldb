/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.records;


import javax.annotation.Generated;

import jooq.sqlite.gen.tables.ModelView;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModelViewRecord extends TableRecordImpl<ModelViewRecord> implements Record5<Integer, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1096431443;

    /**
     * Setter for <code>modeldb_test.model_view.fe_id</code>.
     */
    public void setFeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.model_view.fe_id</code>.
     */
    public Integer getFeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.model_view.model_type</code>.
     */
    public void setModelType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.model_view.model_type</code>.
     */
    public String getModelType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>modeldb_test.model_view.model</code>.
     */
    public void setModel(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.model_view.model</code>.
     */
    public Integer getModel() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>modeldb_test.model_view.spec_id</code>.
     */
    public void setSpecId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb_test.model_view.spec_id</code>.
     */
    public Integer getSpecId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>modeldb_test.model_view.train_df</code>.
     */
    public void setTrainDf(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>modeldb_test.model_view.train_df</code>.
     */
    public Integer getTrainDf() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ModelView.MODEL_VIEW.FE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ModelView.MODEL_VIEW.MODEL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ModelView.MODEL_VIEW.MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ModelView.MODEL_VIEW.SPEC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ModelView.MODEL_VIEW.TRAIN_DF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getModelType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getSpecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTrainDf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModelViewRecord value1(Integer value) {
        setFeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModelViewRecord value2(String value) {
        setModelType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModelViewRecord value3(Integer value) {
        setModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModelViewRecord value4(Integer value) {
        setSpecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModelViewRecord value5(Integer value) {
        setTrainDf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModelViewRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5) {
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
     * Create a detached ModelViewRecord
     */
    public ModelViewRecord() {
        super(ModelView.MODEL_VIEW);
    }

    /**
     * Create a detached, initialised ModelViewRecord
     */
    public ModelViewRecord(Integer feId, String modelType, Integer model, Integer specId, Integer trainDf) {
        super(ModelView.MODEL_VIEW);

        set(0, feId);
        set(1, modelType);
        set(2, model);
        set(3, specId);
        set(4, trainDf);
    }
}

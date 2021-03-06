/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.LinearmodelRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Linearmodel extends TableImpl<LinearmodelRecord> {

    private static final long serialVersionUID = 2002043311;

    /**
     * The reference instance of <code>modeldb_test.LinearModel</code>
     */
    public static final Linearmodel LINEARMODEL = new Linearmodel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LinearmodelRecord> getRecordType() {
        return LinearmodelRecord.class;
    }

    /**
     * The column <code>modeldb_test.LinearModel.id</code>.
     */
    public final TableField<LinearmodelRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.LinearModel.model</code>.
     */
    public final TableField<LinearmodelRecord, Integer> MODEL = createField("model", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.LinearModel.rmse</code>.
     */
    public final TableField<LinearmodelRecord, Double> RMSE = createField("rmse", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>modeldb_test.LinearModel.explainedVariance</code>.
     */
    public final TableField<LinearmodelRecord, Double> EXPLAINEDVARIANCE = createField("explainedVariance", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>modeldb_test.LinearModel.r2</code>.
     */
    public final TableField<LinearmodelRecord, Double> R2 = createField("r2", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>modeldb_test.LinearModel</code> table reference
     */
    public Linearmodel() {
        this("LinearModel", null);
    }

    /**
     * Create an aliased <code>modeldb_test.LinearModel</code> table reference
     */
    public Linearmodel(String alias) {
        this(alias, LINEARMODEL);
    }

    private Linearmodel(String alias, Table<LinearmodelRecord> aliased) {
        this(alias, aliased, null);
    }

    private Linearmodel(String alias, Table<LinearmodelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ModeldbTest.MODELDB_TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LinearmodelRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LINEARMODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LinearmodelRecord> getPrimaryKey() {
        return Keys.KEY_LINEARMODEL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LinearmodelRecord>> getKeys() {
        return Arrays.<UniqueKey<LinearmodelRecord>>asList(Keys.KEY_LINEARMODEL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LinearmodelRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LinearmodelRecord, ?>>asList(Keys.LINEARMODEL_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Linearmodel as(String alias) {
        return new Linearmodel(alias, this);
    }

    /**
     * Rename this table
     */
    public Linearmodel rename(String name) {
        return new Linearmodel(name, null);
    }
}

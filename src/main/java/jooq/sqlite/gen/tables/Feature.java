/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.FeatureRecord;

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
public class Feature extends TableImpl<FeatureRecord> {

    private static final long serialVersionUID = -185462502;

    /**
     * The reference instance of <code>modeldb_test.Feature</code>
     */
    public static final Feature FEATURE = new Feature();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeatureRecord> getRecordType() {
        return FeatureRecord.class;
    }

    /**
     * The column <code>modeldb_test.Feature.id</code>.
     */
    public final TableField<FeatureRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Feature.name</code>.
     */
    public final TableField<FeatureRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Feature.featureIndex</code>.
     */
    public final TableField<FeatureRecord, Integer> FEATUREINDEX = createField("featureIndex", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Feature.importance</code>.
     */
    public final TableField<FeatureRecord, Double> IMPORTANCE = createField("importance", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Feature.transformer</code>.
     */
    public final TableField<FeatureRecord, Integer> TRANSFORMER = createField("transformer", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.Feature</code> table reference
     */
    public Feature() {
        this("Feature", null);
    }

    /**
     * Create an aliased <code>modeldb_test.Feature</code> table reference
     */
    public Feature(String alias) {
        this(alias, FEATURE);
    }

    private Feature(String alias, Table<FeatureRecord> aliased) {
        this(alias, aliased, null);
    }

    private Feature(String alias, Table<FeatureRecord> aliased, Field<?>[] parameters) {
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
    public Identity<FeatureRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FEATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FeatureRecord> getPrimaryKey() {
        return Keys.KEY_FEATURE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FeatureRecord>> getKeys() {
        return Arrays.<UniqueKey<FeatureRecord>>asList(Keys.KEY_FEATURE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FeatureRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FeatureRecord, ?>>asList(Keys.FEATURE_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Feature as(String alias) {
        return new Feature(alias, this);
    }

    /**
     * Rename this table
     */
    public Feature rename(String name) {
        return new Feature(name, null);
    }
}

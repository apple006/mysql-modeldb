/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.CrossvalidationfoldRecord;

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
public class Crossvalidationfold extends TableImpl<CrossvalidationfoldRecord> {

    private static final long serialVersionUID = 1836382569;

    /**
     * The reference instance of <code>modeldb_test.CrossValidationFold</code>
     */
    public static final Crossvalidationfold CROSSVALIDATIONFOLD = new Crossvalidationfold();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CrossvalidationfoldRecord> getRecordType() {
        return CrossvalidationfoldRecord.class;
    }

    /**
     * The column <code>modeldb_test.CrossValidationFold.id</code>.
     */
    public final TableField<CrossvalidationfoldRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.CrossValidationFold.metric</code>.
     */
    public final TableField<CrossvalidationfoldRecord, Integer> METRIC = createField("metric", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.CrossValidationFold.event</code>.
     */
    public final TableField<CrossvalidationfoldRecord, Integer> EVENT = createField("event", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.CrossValidationFold.experimentRun</code>.
     */
    public final TableField<CrossvalidationfoldRecord, Integer> EXPERIMENTRUN = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.CrossValidationFold</code> table reference
     */
    public Crossvalidationfold() {
        this("CrossValidationFold", null);
    }

    /**
     * Create an aliased <code>modeldb_test.CrossValidationFold</code> table reference
     */
    public Crossvalidationfold(String alias) {
        this(alias, CROSSVALIDATIONFOLD);
    }

    private Crossvalidationfold(String alias, Table<CrossvalidationfoldRecord> aliased) {
        this(alias, aliased, null);
    }

    private Crossvalidationfold(String alias, Table<CrossvalidationfoldRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CrossvalidationfoldRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CROSSVALIDATIONFOLD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CrossvalidationfoldRecord> getPrimaryKey() {
        return Keys.KEY_CROSSVALIDATIONFOLD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CrossvalidationfoldRecord>> getKeys() {
        return Arrays.<UniqueKey<CrossvalidationfoldRecord>>asList(Keys.KEY_CROSSVALIDATIONFOLD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CrossvalidationfoldRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CrossvalidationfoldRecord, ?>>asList(Keys.CROSSVALIDATIONFOLD_IBFK_1, Keys.CROSSVALIDATIONFOLD_IBFK_2, Keys.CROSSVALIDATIONFOLD_IBFK_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Crossvalidationfold as(String alias) {
        return new Crossvalidationfold(alias, this);
    }

    /**
     * Rename this table
     */
    public Crossvalidationfold rename(String name) {
        return new Crossvalidationfold(name, null);
    }
}

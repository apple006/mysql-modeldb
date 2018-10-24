/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.TransformeventRecord;

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
public class Transformevent extends TableImpl<TransformeventRecord> {

    private static final long serialVersionUID = -968817265;

    /**
     * The reference instance of <code>modeldb_test.TransformEvent</code>
     */
    public static final Transformevent TRANSFORMEVENT = new Transformevent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransformeventRecord> getRecordType() {
        return TransformeventRecord.class;
    }

    /**
     * The column <code>modeldb_test.TransformEvent.id</code>.
     */
    public final TableField<TransformeventRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TransformEvent.oldDf</code>.
     */
    public final TableField<TransformeventRecord, Integer> OLDDF = createField("oldDf", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TransformEvent.newDf</code>.
     */
    public final TableField<TransformeventRecord, Integer> NEWDF = createField("newDf", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TransformEvent.transformer</code>.
     */
    public final TableField<TransformeventRecord, Integer> TRANSFORMER = createField("transformer", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TransformEvent.inputColumns</code>.
     */
    public final TableField<TransformeventRecord, String> INPUTCOLUMNS = createField("inputColumns", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TransformEvent.outputColumns</code>.
     */
    public final TableField<TransformeventRecord, String> OUTPUTCOLUMNS = createField("outputColumns", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TransformEvent.experimentRun</code>.
     */
    public final TableField<TransformeventRecord, Integer> EXPERIMENTRUN = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.TransformEvent</code> table reference
     */
    public Transformevent() {
        this("TransformEvent", null);
    }

    /**
     * Create an aliased <code>modeldb_test.TransformEvent</code> table reference
     */
    public Transformevent(String alias) {
        this(alias, TRANSFORMEVENT);
    }

    private Transformevent(String alias, Table<TransformeventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Transformevent(String alias, Table<TransformeventRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TransformeventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRANSFORMEVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TransformeventRecord> getPrimaryKey() {
        return Keys.KEY_TRANSFORMEVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TransformeventRecord>> getKeys() {
        return Arrays.<UniqueKey<TransformeventRecord>>asList(Keys.KEY_TRANSFORMEVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TransformeventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TransformeventRecord, ?>>asList(Keys.TRANSFORMEVENT_IBFK_1, Keys.TRANSFORMEVENT_IBFK_2, Keys.TRANSFORMEVENT_IBFK_3, Keys.TRANSFORMEVENT_IBFK_4);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Transformevent as(String alias) {
        return new Transformevent(alias, this);
    }

    /**
     * Rename this table
     */
    public Transformevent rename(String name) {
        return new Transformevent(name, null);
    }
}
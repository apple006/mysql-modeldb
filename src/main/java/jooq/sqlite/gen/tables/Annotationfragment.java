/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.AnnotationfragmentRecord;

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
public class Annotationfragment extends TableImpl<AnnotationfragmentRecord> {

    private static final long serialVersionUID = -1810375266;

    /**
     * The reference instance of <code>modeldb_test.AnnotationFragment</code>
     */
    public static final Annotationfragment ANNOTATIONFRAGMENT = new Annotationfragment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AnnotationfragmentRecord> getRecordType() {
        return AnnotationfragmentRecord.class;
    }

    /**
     * The column <code>modeldb_test.AnnotationFragment.id</code>.
     */
    public final TableField<AnnotationfragmentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.AnnotationFragment.annotation</code>.
     */
    public final TableField<AnnotationfragmentRecord, Integer> ANNOTATION = createField("annotation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.AnnotationFragment.transformer</code>.
     */
    public final TableField<AnnotationfragmentRecord, Integer> TRANSFORMER = createField("transformer", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.AnnotationFragment.DataFrame</code>.
     */
    public final TableField<AnnotationfragmentRecord, Integer> DATAFRAME = createField("DataFrame", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.AnnotationFragment.spec</code>.
     */
    public final TableField<AnnotationfragmentRecord, Integer> SPEC = createField("spec", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.AnnotationFragment.experimentRun</code>.
     */
    public final TableField<AnnotationfragmentRecord, Integer> EXPERIMENTRUN = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.AnnotationFragment.fragmentIndex</code>.
     */
    public final TableField<AnnotationfragmentRecord, Integer> FRAGMENTINDEX = createField("fragmentIndex", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.AnnotationFragment.type</code>.
     */
    public final TableField<AnnotationfragmentRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.AnnotationFragment.message</code>.
     */
    public final TableField<AnnotationfragmentRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>modeldb_test.AnnotationFragment</code> table reference
     */
    public Annotationfragment() {
        this("AnnotationFragment", null);
    }

    /**
     * Create an aliased <code>modeldb_test.AnnotationFragment</code> table reference
     */
    public Annotationfragment(String alias) {
        this(alias, ANNOTATIONFRAGMENT);
    }

    private Annotationfragment(String alias, Table<AnnotationfragmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Annotationfragment(String alias, Table<AnnotationfragmentRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AnnotationfragmentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ANNOTATIONFRAGMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AnnotationfragmentRecord> getPrimaryKey() {
        return Keys.KEY_ANNOTATIONFRAGMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AnnotationfragmentRecord>> getKeys() {
        return Arrays.<UniqueKey<AnnotationfragmentRecord>>asList(Keys.KEY_ANNOTATIONFRAGMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AnnotationfragmentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AnnotationfragmentRecord, ?>>asList(Keys.ANNOTATIONFRAGMENT_IBFK_1, Keys.ANNOTATIONFRAGMENT_IBFK_2, Keys.ANNOTATIONFRAGMENT_IBFK_3, Keys.ANNOTATIONFRAGMENT_IBFK_4, Keys.ANNOTATIONFRAGMENT_IBFK_5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Annotationfragment as(String alias) {
        return new Annotationfragment(alias, this);
    }

    /**
     * Rename this table
     */
    public Annotationfragment rename(String name) {
        return new Annotationfragment(name, null);
    }
}

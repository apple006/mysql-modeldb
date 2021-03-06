/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.DataframecolumnRecord;

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
public class Dataframecolumn extends TableImpl<DataframecolumnRecord> {

    private static final long serialVersionUID = -153234777;

    /**
     * The reference instance of <code>modeldb_test.DataFrameColumn</code>
     */
    public static final Dataframecolumn DATAFRAMECOLUMN = new Dataframecolumn();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DataframecolumnRecord> getRecordType() {
        return DataframecolumnRecord.class;
    }

    /**
     * The column <code>modeldb_test.DataFrameColumn.id</code>.
     */
    public final TableField<DataframecolumnRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.DataFrameColumn.dfId</code>.
     */
    public final TableField<DataframecolumnRecord, Integer> DFID = createField("dfId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.DataFrameColumn.name</code>.
     */
    public final TableField<DataframecolumnRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.DataFrameColumn.type</code>.
     */
    public final TableField<DataframecolumnRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.DataFrameColumn</code> table reference
     */
    public Dataframecolumn() {
        this("DataFrameColumn", null);
    }

    /**
     * Create an aliased <code>modeldb_test.DataFrameColumn</code> table reference
     */
    public Dataframecolumn(String alias) {
        this(alias, DATAFRAMECOLUMN);
    }

    private Dataframecolumn(String alias, Table<DataframecolumnRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dataframecolumn(String alias, Table<DataframecolumnRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DataframecolumnRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DATAFRAMECOLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DataframecolumnRecord> getPrimaryKey() {
        return Keys.KEY_DATAFRAMECOLUMN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DataframecolumnRecord>> getKeys() {
        return Arrays.<UniqueKey<DataframecolumnRecord>>asList(Keys.KEY_DATAFRAMECOLUMN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DataframecolumnRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DataframecolumnRecord, ?>>asList(Keys.DATAFRAMECOLUMN_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dataframecolumn as(String alias) {
        return new Dataframecolumn(alias, this);
    }

    /**
     * Rename this table
     */
    public Dataframecolumn rename(String name) {
        return new Dataframecolumn(name, null);
    }
}

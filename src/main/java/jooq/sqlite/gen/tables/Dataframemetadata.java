/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.DataframemetadataRecord;

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
public class Dataframemetadata extends TableImpl<DataframemetadataRecord> {

    private static final long serialVersionUID = -1944344163;

    /**
     * The reference instance of <code>modeldb_test.DataFrameMetadata</code>
     */
    public static final Dataframemetadata DATAFRAMEMETADATA = new Dataframemetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DataframemetadataRecord> getRecordType() {
        return DataframemetadataRecord.class;
    }

    /**
     * The column <code>modeldb_test.DataFrameMetadata.id</code>.
     */
    public final TableField<DataframemetadataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.DataFrameMetadata.dfId</code>.
     */
    public final TableField<DataframemetadataRecord, Integer> DFID = createField("dfId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.DataFrameMetadata.metadataKvId</code>.
     */
    public final TableField<DataframemetadataRecord, Integer> METADATAKVID = createField("metadataKvId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.DataFrameMetadata</code> table reference
     */
    public Dataframemetadata() {
        this("DataFrameMetadata", null);
    }

    /**
     * Create an aliased <code>modeldb_test.DataFrameMetadata</code> table reference
     */
    public Dataframemetadata(String alias) {
        this(alias, DATAFRAMEMETADATA);
    }

    private Dataframemetadata(String alias, Table<DataframemetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dataframemetadata(String alias, Table<DataframemetadataRecord> aliased, Field<?>[] parameters) {
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
    public Identity<DataframemetadataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DATAFRAMEMETADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DataframemetadataRecord> getPrimaryKey() {
        return Keys.KEY_DATAFRAMEMETADATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DataframemetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<DataframemetadataRecord>>asList(Keys.KEY_DATAFRAMEMETADATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DataframemetadataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DataframemetadataRecord, ?>>asList(Keys.DATAFRAMEMETADATA_IBFK_1, Keys.DATAFRAMEMETADATA_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dataframemetadata as(String alias) {
        return new Dataframemetadata(alias, this);
    }

    /**
     * Rename this table
     */
    public Dataframemetadata rename(String name) {
        return new Dataframemetadata(name, null);
    }
}

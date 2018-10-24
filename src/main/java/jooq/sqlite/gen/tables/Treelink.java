/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.TreelinkRecord;

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
public class Treelink extends TableImpl<TreelinkRecord> {

    private static final long serialVersionUID = -556745203;

    /**
     * The reference instance of <code>modeldb_test.TreeLink</code>
     */
    public static final Treelink TREELINK = new Treelink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TreelinkRecord> getRecordType() {
        return TreelinkRecord.class;
    }

    /**
     * The column <code>modeldb_test.TreeLink.id</code>.
     */
    public final TableField<TreelinkRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TreeLink.parent</code>.
     */
    public final TableField<TreelinkRecord, Integer> PARENT = createField("parent", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TreeLink.child</code>.
     */
    public final TableField<TreelinkRecord, Integer> CHILD = createField("child", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.TreeLink.isLeft</code>.
     */
    public final TableField<TreelinkRecord, Integer> ISLEFT = createField("isLeft", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.TreeLink</code> table reference
     */
    public Treelink() {
        this("TreeLink", null);
    }

    /**
     * Create an aliased <code>modeldb_test.TreeLink</code> table reference
     */
    public Treelink(String alias) {
        this(alias, TREELINK);
    }

    private Treelink(String alias, Table<TreelinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private Treelink(String alias, Table<TreelinkRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TreelinkRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TREELINK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TreelinkRecord> getPrimaryKey() {
        return Keys.KEY_TREELINK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TreelinkRecord>> getKeys() {
        return Arrays.<UniqueKey<TreelinkRecord>>asList(Keys.KEY_TREELINK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TreelinkRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TreelinkRecord, ?>>asList(Keys.TREELINK_IBFK_1, Keys.TREELINK_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Treelink as(String alias) {
        return new Treelink(alias, this);
    }

    /**
     * Rename this table
     */
    public Treelink rename(String name) {
        return new Treelink(name, null);
    }
}

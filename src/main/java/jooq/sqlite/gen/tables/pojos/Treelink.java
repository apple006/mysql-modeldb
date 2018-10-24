/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Treelink implements Serializable {

    private static final long serialVersionUID = 1545968283;

    private Integer id;
    private Integer parent;
    private Integer child;
    private Integer isleft;

    public Treelink() {}

    public Treelink(Treelink value) {
        this.id = value.id;
        this.parent = value.parent;
        this.child = value.child;
        this.isleft = value.isleft;
    }

    public Treelink(
        Integer id,
        Integer parent,
        Integer child,
        Integer isleft
    ) {
        this.id = id;
        this.parent = parent;
        this.child = child;
        this.isleft = isleft;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent() {
        return this.parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getChild() {
        return this.child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    public Integer getIsleft() {
        return this.isleft;
    }

    public void setIsleft(Integer isleft) {
        this.isleft = isleft;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Treelink (");

        sb.append(id);
        sb.append(", ").append(parent);
        sb.append(", ").append(child);
        sb.append(", ").append(isleft);

        sb.append(")");
        return sb.toString();
    }
}

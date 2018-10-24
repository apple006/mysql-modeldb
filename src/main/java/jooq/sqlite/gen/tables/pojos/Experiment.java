/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class Experiment implements Serializable {

    private static final long serialVersionUID = -486083390;

    private Integer   id;
    private Integer   project;
    private String    name;
    private String    description;
    private Timestamp created;

    public Experiment() {}

    public Experiment(Experiment value) {
        this.id = value.id;
        this.project = value.project;
        this.name = value.name;
        this.description = value.description;
        this.created = value.created;
    }

    public Experiment(
        Integer   id,
        Integer   project,
        String    name,
        String    description,
        Timestamp created
    ) {
        this.id = id;
        this.project = project;
        this.name = name;
        this.description = description;
        this.created = created;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProject() {
        return this.project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Experiment (");

        sb.append(id);
        sb.append(", ").append(project);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(created);

        sb.append(")");
        return sb.toString();
    }
}

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
public class Transformevent implements Serializable {

    private static final long serialVersionUID = 1114393005;

    private Integer id;
    private Integer olddf;
    private Integer newdf;
    private Integer transformer;
    private String  inputcolumns;
    private String  outputcolumns;
    private Integer experimentrun;

    public Transformevent() {}

    public Transformevent(Transformevent value) {
        this.id = value.id;
        this.olddf = value.olddf;
        this.newdf = value.newdf;
        this.transformer = value.transformer;
        this.inputcolumns = value.inputcolumns;
        this.outputcolumns = value.outputcolumns;
        this.experimentrun = value.experimentrun;
    }

    public Transformevent(
        Integer id,
        Integer olddf,
        Integer newdf,
        Integer transformer,
        String  inputcolumns,
        String  outputcolumns,
        Integer experimentrun
    ) {
        this.id = id;
        this.olddf = olddf;
        this.newdf = newdf;
        this.transformer = transformer;
        this.inputcolumns = inputcolumns;
        this.outputcolumns = outputcolumns;
        this.experimentrun = experimentrun;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOlddf() {
        return this.olddf;
    }

    public void setOlddf(Integer olddf) {
        this.olddf = olddf;
    }

    public Integer getNewdf() {
        return this.newdf;
    }

    public void setNewdf(Integer newdf) {
        this.newdf = newdf;
    }

    public Integer getTransformer() {
        return this.transformer;
    }

    public void setTransformer(Integer transformer) {
        this.transformer = transformer;
    }

    public String getInputcolumns() {
        return this.inputcolumns;
    }

    public void setInputcolumns(String inputcolumns) {
        this.inputcolumns = inputcolumns;
    }

    public String getOutputcolumns() {
        return this.outputcolumns;
    }

    public void setOutputcolumns(String outputcolumns) {
        this.outputcolumns = outputcolumns;
    }

    public Integer getExperimentrun() {
        return this.experimentrun;
    }

    public void setExperimentrun(Integer experimentrun) {
        this.experimentrun = experimentrun;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Transformevent (");

        sb.append(id);
        sb.append(", ").append(olddf);
        sb.append(", ").append(newdf);
        sb.append(", ").append(transformer);
        sb.append(", ").append(inputcolumns);
        sb.append(", ").append(outputcolumns);
        sb.append(", ").append(experimentrun);

        sb.append(")");
        return sb.toString();
    }
}

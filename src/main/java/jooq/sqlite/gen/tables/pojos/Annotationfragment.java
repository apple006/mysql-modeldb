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
public class Annotationfragment implements Serializable {

    private static final long serialVersionUID = 1302947033;

    private Integer id;
    private Integer annotation;
    private Integer transformer;
    private Integer dataframe;
    private Integer spec;
    private Integer experimentrun;
    private Integer fragmentindex;
    private String  type;
    private String  message;

    public Annotationfragment() {}

    public Annotationfragment(Annotationfragment value) {
        this.id = value.id;
        this.annotation = value.annotation;
        this.transformer = value.transformer;
        this.dataframe = value.dataframe;
        this.spec = value.spec;
        this.experimentrun = value.experimentrun;
        this.fragmentindex = value.fragmentindex;
        this.type = value.type;
        this.message = value.message;
    }

    public Annotationfragment(
        Integer id,
        Integer annotation,
        Integer transformer,
        Integer dataframe,
        Integer spec,
        Integer experimentrun,
        Integer fragmentindex,
        String  type,
        String  message
    ) {
        this.id = id;
        this.annotation = annotation;
        this.transformer = transformer;
        this.dataframe = dataframe;
        this.spec = spec;
        this.experimentrun = experimentrun;
        this.fragmentindex = fragmentindex;
        this.type = type;
        this.message = message;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnnotation() {
        return this.annotation;
    }

    public void setAnnotation(Integer annotation) {
        this.annotation = annotation;
    }

    public Integer getTransformer() {
        return this.transformer;
    }

    public void setTransformer(Integer transformer) {
        this.transformer = transformer;
    }

    public Integer getDataframe() {
        return this.dataframe;
    }

    public void setDataframe(Integer dataframe) {
        this.dataframe = dataframe;
    }

    public Integer getSpec() {
        return this.spec;
    }

    public void setSpec(Integer spec) {
        this.spec = spec;
    }

    public Integer getExperimentrun() {
        return this.experimentrun;
    }

    public void setExperimentrun(Integer experimentrun) {
        this.experimentrun = experimentrun;
    }

    public Integer getFragmentindex() {
        return this.fragmentindex;
    }

    public void setFragmentindex(Integer fragmentindex) {
        this.fragmentindex = fragmentindex;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Annotationfragment (");

        sb.append(id);
        sb.append(", ").append(annotation);
        sb.append(", ").append(transformer);
        sb.append(", ").append(dataframe);
        sb.append(", ").append(spec);
        sb.append(", ").append(experimentrun);
        sb.append(", ").append(fragmentindex);
        sb.append(", ").append(type);
        sb.append(", ").append(message);

        sb.append(")");
        return sb.toString();
    }
}

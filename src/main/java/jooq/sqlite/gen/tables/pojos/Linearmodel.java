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
public class Linearmodel implements Serializable {

    private static final long serialVersionUID = 1185049387;

    private Integer id;
    private Integer model;
    private Double  rmse;
    private Double  explainedvariance;
    private Double  r2;

    public Linearmodel() {}

    public Linearmodel(Linearmodel value) {
        this.id = value.id;
        this.model = value.model;
        this.rmse = value.rmse;
        this.explainedvariance = value.explainedvariance;
        this.r2 = value.r2;
    }

    public Linearmodel(
        Integer id,
        Integer model,
        Double  rmse,
        Double  explainedvariance,
        Double  r2
    ) {
        this.id = id;
        this.model = model;
        this.rmse = rmse;
        this.explainedvariance = explainedvariance;
        this.r2 = r2;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModel() {
        return this.model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Double getRmse() {
        return this.rmse;
    }

    public void setRmse(Double rmse) {
        this.rmse = rmse;
    }

    public Double getExplainedvariance() {
        return this.explainedvariance;
    }

    public void setExplainedvariance(Double explainedvariance) {
        this.explainedvariance = explainedvariance;
    }

    public Double getR2() {
        return this.r2;
    }

    public void setR2(Double r2) {
        this.r2 = r2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Linearmodel (");

        sb.append(id);
        sb.append(", ").append(model);
        sb.append(", ").append(rmse);
        sb.append(", ").append(explainedvariance);
        sb.append(", ").append(r2);

        sb.append(")");
        return sb.toString();
    }
}

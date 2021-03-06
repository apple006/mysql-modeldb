/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Transformerspec;
import jooq.sqlite.gen.tables.records.TransformerspecRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class TransformerspecDao extends DAOImpl<TransformerspecRecord, jooq.sqlite.gen.tables.pojos.Transformerspec, Integer> {

    /**
     * Create a new TransformerspecDao without any configuration
     */
    public TransformerspecDao() {
        super(Transformerspec.TRANSFORMERSPEC, jooq.sqlite.gen.tables.pojos.Transformerspec.class);
    }

    /**
     * Create a new TransformerspecDao with an attached configuration
     */
    public TransformerspecDao(Configuration configuration) {
        super(Transformerspec.TRANSFORMERSPEC, jooq.sqlite.gen.tables.pojos.Transformerspec.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Transformerspec object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Transformerspec> fetchById(Integer... values) {
        return fetch(Transformerspec.TRANSFORMERSPEC.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Transformerspec fetchOneById(Integer value) {
        return fetchOne(Transformerspec.TRANSFORMERSPEC.ID, value);
    }

    /**
     * Fetch records that have <code>transformerType IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Transformerspec> fetchByTransformertype(String... values) {
        return fetch(Transformerspec.TRANSFORMERSPEC.TRANSFORMERTYPE, values);
    }

    /**
     * Fetch records that have <code>tag IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Transformerspec> fetchByTag(String... values) {
        return fetch(Transformerspec.TRANSFORMERSPEC.TAG, values);
    }

    /**
     * Fetch records that have <code>experimentRun IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Transformerspec> fetchByExperimentrun(Integer... values) {
        return fetch(Transformerspec.TRANSFORMERSPEC.EXPERIMENTRUN, values);
    }
}

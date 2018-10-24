/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Annotationfragment;
import jooq.sqlite.gen.tables.records.AnnotationfragmentRecord;

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
public class AnnotationfragmentDao extends DAOImpl<AnnotationfragmentRecord, jooq.sqlite.gen.tables.pojos.Annotationfragment, Integer> {

    /**
     * Create a new AnnotationfragmentDao without any configuration
     */
    public AnnotationfragmentDao() {
        super(Annotationfragment.ANNOTATIONFRAGMENT, jooq.sqlite.gen.tables.pojos.Annotationfragment.class);
    }

    /**
     * Create a new AnnotationfragmentDao with an attached configuration
     */
    public AnnotationfragmentDao(Configuration configuration) {
        super(Annotationfragment.ANNOTATIONFRAGMENT, jooq.sqlite.gen.tables.pojos.Annotationfragment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Annotationfragment object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchById(Integer... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Annotationfragment fetchOneById(Integer value) {
        return fetchOne(Annotationfragment.ANNOTATIONFRAGMENT.ID, value);
    }

    /**
     * Fetch records that have <code>annotation IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchByAnnotation(Integer... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.ANNOTATION, values);
    }

    /**
     * Fetch records that have <code>transformer IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchByTransformer(Integer... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.TRANSFORMER, values);
    }

    /**
     * Fetch records that have <code>DataFrame IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchByDataframe(Integer... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.DATAFRAME, values);
    }

    /**
     * Fetch records that have <code>spec IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchBySpec(Integer... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.SPEC, values);
    }

    /**
     * Fetch records that have <code>experimentRun IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchByExperimentrun(Integer... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.EXPERIMENTRUN, values);
    }

    /**
     * Fetch records that have <code>fragmentIndex IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchByFragmentindex(Integer... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.FRAGMENTINDEX, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchByType(String... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.TYPE, values);
    }

    /**
     * Fetch records that have <code>message IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Annotationfragment> fetchByMessage(String... values) {
        return fetch(Annotationfragment.ANNOTATIONFRAGMENT.MESSAGE, values);
    }
}

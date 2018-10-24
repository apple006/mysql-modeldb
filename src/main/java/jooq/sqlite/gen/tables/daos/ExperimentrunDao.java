/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Experimentrun;
import jooq.sqlite.gen.tables.records.ExperimentrunRecord;

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
public class ExperimentrunDao extends DAOImpl<ExperimentrunRecord, jooq.sqlite.gen.tables.pojos.Experimentrun, Integer> {

    /**
     * Create a new ExperimentrunDao without any configuration
     */
    public ExperimentrunDao() {
        super(Experimentrun.EXPERIMENTRUN, jooq.sqlite.gen.tables.pojos.Experimentrun.class);
    }

    /**
     * Create a new ExperimentrunDao with an attached configuration
     */
    public ExperimentrunDao(Configuration configuration) {
        super(Experimentrun.EXPERIMENTRUN, jooq.sqlite.gen.tables.pojos.Experimentrun.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Experimentrun object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experimentrun> fetchById(Integer... values) {
        return fetch(Experimentrun.EXPERIMENTRUN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Experimentrun fetchOneById(Integer value) {
        return fetchOne(Experimentrun.EXPERIMENTRUN.ID, value);
    }

    /**
     * Fetch records that have <code>experiment IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experimentrun> fetchByExperiment(Integer... values) {
        return fetch(Experimentrun.EXPERIMENTRUN.EXPERIMENT, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experimentrun> fetchByDescription(String... values) {
        return fetch(Experimentrun.EXPERIMENTRUN.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>sha IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experimentrun> fetchBySha(String... values) {
        return fetch(Experimentrun.EXPERIMENTRUN.SHA, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experimentrun> fetchByCreated(Timestamp... values) {
        return fetch(Experimentrun.EXPERIMENTRUN.CREATED, values);
    }
}

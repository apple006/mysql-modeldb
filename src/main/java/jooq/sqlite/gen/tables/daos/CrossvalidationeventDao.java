/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Crossvalidationevent;
import jooq.sqlite.gen.tables.records.CrossvalidationeventRecord;

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
public class CrossvalidationeventDao extends DAOImpl<CrossvalidationeventRecord, jooq.sqlite.gen.tables.pojos.Crossvalidationevent, Integer> {

    /**
     * Create a new CrossvalidationeventDao without any configuration
     */
    public CrossvalidationeventDao() {
        super(Crossvalidationevent.CROSSVALIDATIONEVENT, jooq.sqlite.gen.tables.pojos.Crossvalidationevent.class);
    }

    /**
     * Create a new CrossvalidationeventDao with an attached configuration
     */
    public CrossvalidationeventDao(Configuration configuration) {
        super(Crossvalidationevent.CROSSVALIDATIONEVENT, jooq.sqlite.gen.tables.pojos.Crossvalidationevent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Crossvalidationevent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Crossvalidationevent> fetchById(Integer... values) {
        return fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Crossvalidationevent fetchOneById(Integer value) {
        return fetchOne(Crossvalidationevent.CROSSVALIDATIONEVENT.ID, value);
    }

    /**
     * Fetch records that have <code>df IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Crossvalidationevent> fetchByDf(Integer... values) {
        return fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.DF, values);
    }

    /**
     * Fetch records that have <code>spec IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Crossvalidationevent> fetchBySpec(Integer... values) {
        return fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.SPEC, values);
    }

    /**
     * Fetch records that have <code>numFolds IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Crossvalidationevent> fetchByNumfolds(Integer... values) {
        return fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.NUMFOLDS, values);
    }

    /**
     * Fetch records that have <code>randomSeed IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Crossvalidationevent> fetchByRandomseed(Long... values) {
        return fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.RANDOMSEED, values);
    }

    /**
     * Fetch records that have <code>evaluator IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Crossvalidationevent> fetchByEvaluator(String... values) {
        return fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.EVALUATOR, values);
    }

    /**
     * Fetch records that have <code>experimentRun IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Crossvalidationevent> fetchByExperimentrun(Integer... values) {
        return fetch(Crossvalidationevent.CROSSVALIDATIONEVENT.EXPERIMENTRUN, values);
    }
}

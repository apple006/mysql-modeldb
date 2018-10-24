/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Modelobjectivehistory;
import jooq.sqlite.gen.tables.records.ModelobjectivehistoryRecord;

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
public class ModelobjectivehistoryDao extends DAOImpl<ModelobjectivehistoryRecord, jooq.sqlite.gen.tables.pojos.Modelobjectivehistory, Integer> {

    /**
     * Create a new ModelobjectivehistoryDao without any configuration
     */
    public ModelobjectivehistoryDao() {
        super(Modelobjectivehistory.MODELOBJECTIVEHISTORY, jooq.sqlite.gen.tables.pojos.Modelobjectivehistory.class);
    }

    /**
     * Create a new ModelobjectivehistoryDao with an attached configuration
     */
    public ModelobjectivehistoryDao(Configuration configuration) {
        super(Modelobjectivehistory.MODELOBJECTIVEHISTORY, jooq.sqlite.gen.tables.pojos.Modelobjectivehistory.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Modelobjectivehistory object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Modelobjectivehistory> fetchById(Integer... values) {
        return fetch(Modelobjectivehistory.MODELOBJECTIVEHISTORY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Modelobjectivehistory fetchOneById(Integer value) {
        return fetchOne(Modelobjectivehistory.MODELOBJECTIVEHISTORY.ID, value);
    }

    /**
     * Fetch records that have <code>model IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Modelobjectivehistory> fetchByModel(Integer... values) {
        return fetch(Modelobjectivehistory.MODELOBJECTIVEHISTORY.MODEL, values);
    }

    /**
     * Fetch records that have <code>iteration IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Modelobjectivehistory> fetchByIteration(Integer... values) {
        return fetch(Modelobjectivehistory.MODELOBJECTIVEHISTORY.ITERATION, values);
    }

    /**
     * Fetch records that have <code>objectiveValue IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Modelobjectivehistory> fetchByObjectivevalue(Double... values) {
        return fetch(Modelobjectivehistory.MODELOBJECTIVEHISTORY.OBJECTIVEVALUE, values);
    }
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggersDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TTriggersRecord, org.jooq.test.h2.generatedclasses.tables.pojos.TTriggers, java.lang.Integer> {

	/**
	 * Create a new TTriggersDao without any factory
	 */
	public TTriggersDao() {
		super(org.jooq.test.h2.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.h2.generatedclasses.tables.pojos.TTriggers.class);
	}

	/**
	 * Create a new TTriggersDao with an attached factory
	 */
	public TTriggersDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.h2.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.h2.generatedclasses.tables.pojos.TTriggers.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.TTriggers object) {
		return object.getIdGenerated();
	}

	/**
	 * Fetch records that have <code>ID_GENERATED IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TTriggers> fetchByIdGenerated(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TTriggers.ID_GENERATED, values);
	}

	/**
	 * Fetch a unique that has <code>ID_GENERATED = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.TTriggers fetchOneByIdGenerated(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.TTriggers.ID_GENERATED, value);
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TTriggers> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TTriggers.ID, values);
	}

	/**
	 * Fetch records that have <code>COUNTER IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TTriggers> fetchByCounter(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TTriggers.COUNTER, values);
	}
}

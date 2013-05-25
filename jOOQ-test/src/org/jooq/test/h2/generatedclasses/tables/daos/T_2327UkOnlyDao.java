/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2327UkOnlyDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.T_2327UkOnlyRecord, org.jooq.test.h2.generatedclasses.tables.pojos.T_2327UkOnly, java.lang.Integer> {

	/**
	 * Create a new T_2327UkOnlyDao without any factory
	 */
	public T_2327UkOnlyDao() {
		super(org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly.T_2327_UK_ONLY, org.jooq.test.h2.generatedclasses.tables.pojos.T_2327UkOnly.class);
	}

	/**
	 * Create a new T_2327UkOnlyDao with an attached factory
	 */
	public T_2327UkOnlyDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly.T_2327_UK_ONLY, org.jooq.test.h2.generatedclasses.tables.pojos.T_2327UkOnly.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.T_2327UkOnly object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_2327UkOnly> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly.ID, values);
	}

	/**
	 * Fetch a unique that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.T_2327UkOnly fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly.ID, value);
	}
}

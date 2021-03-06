/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBooleansDao extends org.jooq.impl.DAOImpl<org.jooq.examples.h2.matchers.tables.records.TBooleansRecord, org.jooq.examples.h2.matchers.tables.pojos.TBooleans, java.lang.Integer> {

	/**
	 * Create a new TBooleansDao without any configuration
	 */
	public TBooleansDao() {
		super(org.jooq.examples.h2.matchers.tables.TBooleans.T_BOOLEANS, org.jooq.examples.h2.matchers.tables.pojos.TBooleans.class);
	}

	/**
	 * Create a new TBooleansDao with an attached configuration
	 */
	public TBooleansDao(org.jooq.Configuration configuration) {
		super(org.jooq.examples.h2.matchers.tables.TBooleans.T_BOOLEANS, org.jooq.examples.h2.matchers.tables.pojos.TBooleans.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.examples.h2.matchers.tables.pojos.TBooleans object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.examples.h2.matchers.tables.pojos.TBooleans fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.examples.h2.matchers.tables.TBooleans.ID, value);
	}

	/**
	 * Fetch records that have <code>ONE_ZERO IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByOneZero(org.jooq.test._.converters.Boolean_10... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.ONE_ZERO, values);
	}

	/**
	 * Fetch records that have <code>TRUE_FALSE_LC IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByTrueFalseLc(org.jooq.test._.converters.Boolean_TF_LC... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.TRUE_FALSE_LC, values);
	}

	/**
	 * Fetch records that have <code>TRUE_FALSE_UC IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByTrueFalseUc(org.jooq.test._.converters.Boolean_TF_UC... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.TRUE_FALSE_UC, values);
	}

	/**
	 * Fetch records that have <code>YES_NO_LC IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByYesNoLc(org.jooq.test._.converters.Boolean_YES_NO_LC... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.YES_NO_LC, values);
	}

	/**
	 * Fetch records that have <code>YES_NO_UC IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByYesNoUc(org.jooq.test._.converters.Boolean_YES_NO_UC... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.YES_NO_UC, values);
	}

	/**
	 * Fetch records that have <code>Y_N_LC IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByYNLc(org.jooq.test._.converters.Boolean_YN_LC... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.Y_N_LC, values);
	}

	/**
	 * Fetch records that have <code>Y_N_UC IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByYNUc(org.jooq.test._.converters.Boolean_YN_UC... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.Y_N_UC, values);
	}

	/**
	 * Fetch records that have <code>VC_BOOLEAN IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByVcBoolean(java.lang.Boolean... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.VC_BOOLEAN, values);
	}

	/**
	 * Fetch records that have <code>C_BOOLEAN IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByCBoolean(java.lang.Boolean... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.C_BOOLEAN, values);
	}

	/**
	 * Fetch records that have <code>N_BOOLEAN IN (values)</code>
	 */
	public java.util.List<org.jooq.examples.h2.matchers.tables.pojos.TBooleans> fetchByNBoolean(java.lang.Boolean... values) {
		return fetch(org.jooq.examples.h2.matchers.tables.TBooleans.N_BOOLEAN, values);
	}
}

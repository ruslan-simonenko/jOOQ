/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_85", schema = "public")
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_85Record> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 145478290;

	/**
	 * Setter for <code>public.x_test_case_85.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID, value);
	}

	/**
	 * Getter for <code>public.x_test_case_85.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID);
	}

	/**
	 * Setter for <code>public.x_test_case_85.x_unused_id</code>. 
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, value);
	}

	/**
	 * Getter for <code>public.x_test_case_85.x_unused_id</code>. 
	 */
	@javax.persistence.Column(name = "x_unused_id", precision = 32)
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID);
	}

	/**
	 * Setter for <code>public.x_test_case_85.x_unused_name</code>. 
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME, value);
	}

	/**
	 * Getter for <code>public.x_test_case_85.x_unused_name</code>. 
	 */
	@javax.persistence.Column(name = "x_unused_name", length = 10)
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a <code>public.x_unused</code> referenced by this <code>public.x_test_case_85</code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID)))
			.and(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getXUnusedId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getXUnusedName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}
}

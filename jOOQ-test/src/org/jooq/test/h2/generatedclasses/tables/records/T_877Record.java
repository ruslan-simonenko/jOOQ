/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_877Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.T_877Record> implements org.jooq.test.h2.generatedclasses.tables.interfaces.IT_877 {

	private static final long serialVersionUID = -342699849;

	/**
	 * The table column <code>PUBLIC.T_877.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.T_877.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.T_877.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.T_877.ID);
	}

	/**
	 * Create a detached T_877Record
	 */
	public T_877Record() {
		super(org.jooq.test.h2.generatedclasses.tables.T_877.T_877);
	}
}

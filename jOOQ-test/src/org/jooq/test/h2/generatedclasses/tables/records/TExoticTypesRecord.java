/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord> implements org.jooq.test.h2.generatedclasses.tables.interfaces.ITExoticTypes {

	private static final long serialVersionUID = -900296021;

	/**
	 * The table column <code>PUBLIC.T_EXOTIC_TYPES.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.T_EXOTIC_TYPES.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.ID);
	}

	/**
	 * The table column <code>PUBLIC.T_EXOTIC_TYPES.UU</code>
	 */
	@Override
	public void setUu(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.UU, value);
	}

	/**
	 * The table column <code>PUBLIC.T_EXOTIC_TYPES.UU</code>
	 */
	@Override
	public java.lang.String getUu() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.UU);
	}

	/**
	 * Create a detached TExoticTypesRecord
	 */
	public TExoticTypesRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = -2069958426;

	/**
	 * The singleton instance of <code>public.t_785</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_785 T_785 = new org.jooq.test.postgres.generatedclasses.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.T_785Record.class;
	}

	/**
	 * The column <code>public.t_785.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_785.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>public.t_785.value</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>public.t_785</code> table reference
	 */
	public T_785() {
		super("t_785", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_785</code> table reference
	 */
	public T_785(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.T_785.T_785);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_785 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_785(alias);
	}
}

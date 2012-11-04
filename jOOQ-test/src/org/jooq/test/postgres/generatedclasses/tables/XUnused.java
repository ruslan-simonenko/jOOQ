/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XUnused extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = 1780305588;

	/**
	 * The singleton instance of <code>public.x_unused</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.postgres.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord.class;
	}

	/**
	 * The column <code>public.x_unused.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>public.x_unused.big_integer</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.math.BigInteger> BIG_INTEGER = createField("big_integer", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, this);

	/**
	 * The column <code>public.x_unused.id_ref</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = createField("id_ref", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.class</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = createField("class", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.fields</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = createField("fields", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.configuration</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = createField("configuration", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.u_d_t</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = createField("u_d_t", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.meta_data</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = createField("meta_data", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.values</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> VALUES = createField("values", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.type0</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = createField("type0", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.primary_key</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = createField("primary_key", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.primarykey</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = createField("primarykey", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.x_unused.name_ref</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = createField("name_ref", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>public.x_unused.FIELD 737</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Create a <code>public.x_unused</code> table reference
	 */
	public XUnused() {
		super("x_unused", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.x_unused</code> table reference
	 */
	public XUnused(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_X_UNUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.postgres.generatedclasses.Keys.UK_X_UNUSED_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.X_UNUSED__FK_X_UNUSED_SELF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.XUnused as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.XUnused(alias);
	}
}

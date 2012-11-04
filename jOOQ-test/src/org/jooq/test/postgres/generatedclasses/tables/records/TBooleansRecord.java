/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_booleans", schema = "public")
public class TBooleansRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = 33106653;

	/**
	 * Setter for <code>public.t_booleans.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.ID, value);
	}

	/**
	 * Getter for <code>public.t_booleans.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.ID);
	}

	/**
	 * Setter for <code>public.t_booleans.one_zero</code>. 
	 */
	public void setOneZero(org.jooq.test._.converters.Boolean_10 value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.ONE_ZERO, value);
	}

	/**
	 * Getter for <code>public.t_booleans.one_zero</code>. 
	 */
	@javax.persistence.Column(name = "one_zero", precision = 32)
	public org.jooq.test._.converters.Boolean_10 getOneZero() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.ONE_ZERO);
	}

	/**
	 * Setter for <code>public.t_booleans.true_false_lc</code>. 
	 */
	public void setTrueFalseLc(org.jooq.test._.converters.Boolean_TF_LC value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_LC, value);
	}

	/**
	 * Getter for <code>public.t_booleans.true_false_lc</code>. 
	 */
	@javax.persistence.Column(name = "true_false_lc", length = 5)
	public org.jooq.test._.converters.Boolean_TF_LC getTrueFalseLc() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_LC);
	}

	/**
	 * Setter for <code>public.t_booleans.true_false_uc</code>. 
	 */
	public void setTrueFalseUc(org.jooq.test._.converters.Boolean_TF_UC value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_UC, value);
	}

	/**
	 * Getter for <code>public.t_booleans.true_false_uc</code>. 
	 */
	@javax.persistence.Column(name = "true_false_uc", length = 5)
	public org.jooq.test._.converters.Boolean_TF_UC getTrueFalseUc() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_UC);
	}

	/**
	 * Setter for <code>public.t_booleans.yes_no_lc</code>. 
	 */
	public void setYesNoLc(org.jooq.test._.converters.Boolean_YES_NO_LC value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.YES_NO_LC, value);
	}

	/**
	 * Getter for <code>public.t_booleans.yes_no_lc</code>. 
	 */
	@javax.persistence.Column(name = "yes_no_lc", length = 3)
	public org.jooq.test._.converters.Boolean_YES_NO_LC getYesNoLc() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.YES_NO_LC);
	}

	/**
	 * Setter for <code>public.t_booleans.yes_no_uc</code>. 
	 */
	public void setYesNoUc(org.jooq.test._.converters.Boolean_YES_NO_UC value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.YES_NO_UC, value);
	}

	/**
	 * Getter for <code>public.t_booleans.yes_no_uc</code>. 
	 */
	@javax.persistence.Column(name = "yes_no_uc", length = 3)
	public org.jooq.test._.converters.Boolean_YES_NO_UC getYesNoUc() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.YES_NO_UC);
	}

	/**
	 * Setter for <code>public.t_booleans.y_n_lc</code>. 
	 */
	public void setYNLc(org.jooq.test._.converters.Boolean_YN_LC value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.Y_N_LC, value);
	}

	/**
	 * Getter for <code>public.t_booleans.y_n_lc</code>. 
	 */
	@javax.persistence.Column(name = "y_n_lc", length = 1)
	public org.jooq.test._.converters.Boolean_YN_LC getYNLc() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.Y_N_LC);
	}

	/**
	 * Setter for <code>public.t_booleans.y_n_uc</code>. 
	 */
	public void setYNUc(org.jooq.test._.converters.Boolean_YN_UC value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.Y_N_UC, value);
	}

	/**
	 * Getter for <code>public.t_booleans.y_n_uc</code>. 
	 */
	@javax.persistence.Column(name = "y_n_uc", length = 1)
	public org.jooq.test._.converters.Boolean_YN_UC getYNUc() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.Y_N_UC);
	}

	/**
	 * Setter for <code>public.t_booleans.vc_boolean</code>. 
	 */
	public void setVcBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.VC_BOOLEAN, value);
	}

	/**
	 * Getter for <code>public.t_booleans.vc_boolean</code>. 
	 */
	@javax.persistence.Column(name = "vc_boolean", length = 1)
	public java.lang.Boolean getVcBoolean() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.VC_BOOLEAN);
	}

	/**
	 * Setter for <code>public.t_booleans.c_boolean</code>. 
	 */
	public void setCBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.C_BOOLEAN, value);
	}

	/**
	 * Getter for <code>public.t_booleans.c_boolean</code>. 
	 */
	@javax.persistence.Column(name = "c_boolean", length = 1)
	public java.lang.Boolean getCBoolean() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.C_BOOLEAN);
	}

	/**
	 * Setter for <code>public.t_booleans.n_boolean</code>. 
	 */
	public void setNBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.N_BOOLEAN, value);
	}

	/**
	 * Getter for <code>public.t_booleans.n_boolean</code>. 
	 */
	@javax.persistence.Column(name = "n_boolean", precision = 32)
	public java.lang.Boolean getNBoolean() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS.N_BOOLEAN);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBooleansRecord
	 */
	public TBooleansRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS);
	}
}

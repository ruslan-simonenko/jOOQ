/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FPipelinedTable1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord> {

	private static final long serialVersionUID = -658592872;

	/**
	 * The parameter <code>TEST.F_PIPELINED_TABLE1.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FPipelinedTable1() {
		super("F_PIPELINED_TABLE1", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberTableRecord.class));

		setReturnParameter(RETURN_VALUE);
	}
}

/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PGetOneCursor extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1052973267;

	/**
	 * The parameter <code>TEST.P_GET_ONE_CURSOR.TOTAL</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> TOTAL = createParameter("TOTAL", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.P_GET_ONE_CURSOR.BOOKS</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> BOOKS = createParameter("BOOKS", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * The parameter <code>TEST.P_GET_ONE_CURSOR.BOOK_IDS</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> BOOK_IDS = createParameter("BOOK_IDS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public PGetOneCursor() {
		super("P_GET_ONE_CURSOR", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addOutParameter(TOTAL);
		addOutParameter(BOOKS);
		addInParameter(BOOK_IDS);
	}

	/**
	 * Set the <code>BOOK_IDS</code> parameter IN value to the routine
	 */
	public void setBookIds(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.routines.PGetOneCursor.BOOK_IDS, value);
	}

	/**
	 * Get the <code>TOTAL</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getTotal() {
		return getValue(TOTAL);
	}

	/**
	 * Get the <code>BOOKS</code> parameter OUT value from the routine
	 */
	public org.jooq.Result<org.jooq.Record> getBooks() {
		return getValue(BOOKS);
	}
}

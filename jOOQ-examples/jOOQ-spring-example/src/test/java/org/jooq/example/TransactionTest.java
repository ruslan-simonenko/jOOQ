/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.example;

import static org.jooq.example.db.h2.Tables.BOOK;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jooq.DSLContext;
import org.jooq.example.spring.BookService;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author Petri Kainulainen
 * @author Lukas Eder
 *
 * @see <a
 *      href="http://www.petrikainulainen.net/programming/jooq/using-jooq-with-spring-configuration/">http://www.petrikainulainen.net/programming/jooq/using-jooq-with-spring-configuration/</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/jooq-spring.xml"})
@TransactionConfiguration(transactionManager="transactionManager")
public class TransactionTest {

    @Autowired DSLContext                   dsl;
    @Autowired DataSourceTransactionManager txMgr;
    @Autowired BookService                  books;

    @After
    public void teardown() {

        // Delete all books that were created in any test
        dsl.delete(BOOK).where(BOOK.ID.gt(4)).execute();
    }

    @Test
    public void testExplicitTransactions() {
        boolean rollback = false;

        TransactionStatus tx = txMgr.getTransaction(new DefaultTransactionDefinition());
        try {

            // This is a "bug". The same book is created twice, resulting in a
            // constraint violation exception
            for (int i = 0; i < 2; i++)
                dsl.insertInto(BOOK)
                   .set(BOOK.ID, 5)
                   .set(BOOK.AUTHOR_ID, 1)
                   .set(BOOK.TITLE, "Book 5")
                   .execute();

            Assert.fail();
        }

        // Upon the constraint violation, we explicitly roll back the transaction.
        catch (DataAccessException e) {
            txMgr.rollback(tx);
            rollback = true;
        }

        assertEquals(4, dsl.fetchCount(BOOK));
        assertTrue(rollback);
    }

    @Test
    public void testDeclarativeTransactions() {
        boolean rollback = false;

        try {
            books.create(5, 1, "Book 5");
            Assert.fail();
        }
        catch (DataAccessException ignore) {
            rollback = true;
        }

        assertEquals(4, dsl.fetchCount(BOOK));
        assertTrue(rollback);
    }
}

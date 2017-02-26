/*
 * Copyright 2017 Jin Kwon &lt;onacit at gmail.com&gt;.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jinahya.recipes.item66;

import static java.lang.invoke.MethodHandles.lookup;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

public class Account1 {

    private static final Logger logger
        = getLogger(lookup().lookupClass().getName());

    // -------------------------------------------------------------------------
    public void deposit(final int amount) {
//        logger.log(Level.INFO, "{0}/deposit({1})",
//                   new Object[]{Thread.currentThread().getId(), amount});
        if (amount < 0) {
            throw new IllegalArgumentException("amount(" + amount + ")  0");
        }
        balance += amount;
    }

    public void withdraw(final int amount) {
//        logger.log(Level.INFO, "{0}/withdraw({1})",
//                   new Object[]{Thread.currentThread().getId(), amount});
        if (amount < 0) {
            throw new IllegalArgumentException("amount(" + amount + ")  0");
        }
        balance -= amount;
    }

    // ----------------------------------------------------------------- balance
    public long getBalance() {
        return balance;
    }

    // -------------------------------------------------------------------------
    private long balance;
}
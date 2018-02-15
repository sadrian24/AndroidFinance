package com.adrian.androidfinance.core.exceptions;

/**
 * Created by Adrian on 14.02.2018.
 */

public class AmountExceptions extends Exception {
    public AmountExceptions() {
    }

    public AmountExceptions(String s) {
        super(s);
    }

    public AmountExceptions(String s, Throwable throwable) {
        super(s, throwable);
    }

    public AmountExceptions(Throwable throwable) {
        super(throwable);
    }

    public AmountExceptions(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}

package com.adrian.androidfinance.core.exceptions;

/**
 * Created by Adrian on 14.02.2018.
 */

public class CurrencyExceptions extends Exception {
    public CurrencyExceptions() {
    }

    public CurrencyExceptions(String s) {
        super(s);
    }

    public CurrencyExceptions(String s, Throwable throwable) {
        super(s, throwable);
    }

    public CurrencyExceptions(Throwable throwable) {
        super(throwable);
    }

    public CurrencyExceptions(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}

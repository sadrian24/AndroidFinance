package com.adrian.androidfinance.core.impls.operations;

import com.adrian.androidfinance.core.abstracts.AbstractOperation;
import com.adrian.androidfinance.core.interfaces.Storage;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Currency;

/**
 * Created by Adrian on 26.02.2018.
 */

public class ConvertOperation extends AbstractOperation {
    private Storage fromStorage;
    private Storage toStorage;
    private Currency fromCurrency;
    private Currency toCurrency;
    private BigDecimal fromAmount;
    private BigDecimal toAmount;

    public ConvertOperation(Storage fromStorage, Storage toStorage, Currency fromCurrency, Currency toCurrency, BigDecimal fromAmount, BigDecimal toAmount) {
        this.fromStorage = fromStorage;
        this.toStorage = toStorage;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
    }

    public ConvertOperation(long id, Storage fromStorage, Storage toStorage, Currency fromCurrency, Currency toCurrency, BigDecimal fromAmount, BigDecimal toAmount) {
        super(id);
        this.fromStorage = fromStorage;
        this.toStorage = toStorage;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
    }

    public ConvertOperation(long id, String addInfo, Calendar dateTime, Storage fromStorage, Storage toStorage, Currency fromCurrency, Currency toCurrency, BigDecimal fromAmount, BigDecimal toAmount) {
        super(id, addInfo, dateTime);
        this.fromStorage = fromStorage;
        this.toStorage = toStorage;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
    }

    public Storage getFromStorage() {
        return fromStorage;
    }

    public void setFromStorage(Storage fromStorage) {
        this.fromStorage = fromStorage;
    }

    public Storage getToStorage() {
        return toStorage;
    }

    public void setToStorage(Storage toStorage) {
        this.toStorage = toStorage;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(Currency toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(BigDecimal fromAmount) {
        this.fromAmount = fromAmount;
    }

    public BigDecimal getToAmount() {
        return toAmount;
    }

    public void setToAmount(BigDecimal toAmount) {
        this.toAmount = toAmount;
    }
}

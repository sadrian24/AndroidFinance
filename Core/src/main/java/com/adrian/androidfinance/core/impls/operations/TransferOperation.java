package com.adrian.androidfinance.core.impls.operations;

import com.adrian.androidfinance.core.abstracts.AbstractOperation;
import com.adrian.androidfinance.core.interfaces.Storage;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Currency;

/**
 * Created by Adrian on 26.02.2018.
 */

public class TransferOperation extends AbstractOperation {
    private Storage fromStorage;
    private Storage toStorage;
    private BigDecimal amount;
    private Currency currency;

    public TransferOperation(Storage fromStorage, Storage toStorage, BigDecimal amount, Currency currency) {
        this.fromStorage = fromStorage;
        this.toStorage = toStorage;
        this.amount = amount;
        this.currency = currency;
    }

    public TransferOperation(long id, Storage fromStorage, Storage toStorage, BigDecimal amount, Currency currency) {
        super(id);
        this.fromStorage = fromStorage;
        this.toStorage = toStorage;
        this.amount = amount;
        this.currency = currency;
    }

    public TransferOperation(long id, String addInfo, Calendar dateTime, Storage fromStorage, Storage toStorage, BigDecimal amount, Currency currency) {
        super(id, addInfo, dateTime);
        this.fromStorage = fromStorage;
        this.toStorage = toStorage;
        this.amount = amount;
        this.currency = currency;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}

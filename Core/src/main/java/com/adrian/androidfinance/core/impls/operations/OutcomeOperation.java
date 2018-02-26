package com.adrian.androidfinance.core.impls.operations;

import com.adrian.androidfinance.core.abstracts.AbstractOperation;
import com.adrian.androidfinance.core.interfaces.Source;
import com.adrian.androidfinance.core.interfaces.Storage;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Currency;

/**
 * Created by Adrian on 26.02.2018.
 */
// TODO pentru toate clasele de creat constructor fara parametrul id el va fi autoincrement
public class OutcomeOperation extends AbstractOperation {

    private Storage fromStorage;
    private Source toSource;
    private BigDecimal amount;
    private Currency currency;

    public OutcomeOperation(Storage fromStorage, Source toSource, BigDecimal amount, Currency currency) {
        this.fromStorage = fromStorage;
        this.toSource = toSource;
        this.amount = amount;
        this.currency = currency;
    }

    public OutcomeOperation(long id, Storage fromStorage, Source toSource, BigDecimal amount, Currency currency) {
        super(id);
        this.fromStorage = fromStorage;
        this.toSource = toSource;
        this.amount = amount;
        this.currency = currency;
    }

    public OutcomeOperation(long id, String addInfo, Calendar dateTime, Storage fromStorage, Source toSource, BigDecimal amount, Currency currency) {
        super(id, addInfo, dateTime);
        this.fromStorage = fromStorage;
        this.toSource = toSource;
        this.amount = amount;
        this.currency = currency;
    }

    public Storage getFromStorage() {
        return fromStorage;
    }

    public void setFromStorage(Storage fromStorage) {
        this.fromStorage = fromStorage;
    }

    public Source getToSource() {
        return toSource;
    }

    public void setToSource(Source toSource) {
        this.toSource = toSource;
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

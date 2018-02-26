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
public class IncomeOperation extends AbstractOperation {
    private Source fromSource;
    private Storage toStorage;
    private BigDecimal amount;
    private Currency currency;

    public IncomeOperation(Source fromSource, Storage toStorage, BigDecimal amount, Currency currency) {
        this.fromSource = fromSource;
        this.toStorage = toStorage;
        this.amount = amount;
        this.currency = currency;
    }

    public IncomeOperation(long id, Source fromSource, Storage toStorage, BigDecimal amount, Currency currency) {
        super(id);
        this.fromSource = fromSource;
        this.toStorage = toStorage;
        this.amount = amount;
        this.currency = currency;
    }

    public IncomeOperation(long id, String addInfo, Calendar dateTime, Source fromSource, Storage toStorage, BigDecimal amount, Currency currency) {
        super(id, addInfo, dateTime);
        this.fromSource = fromSource;
        this.toStorage = toStorage;
        this.amount = amount;
        this.currency = currency;
    }

    public Source getFromSource() {
        return fromSource;
    }

    public void setFromSource(Source fromSource) {
        this.fromSource = fromSource;
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

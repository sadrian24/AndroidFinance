package com.adrian.androidfinance.core.impls;

import com.adrian.androidfinance.core.exceptions.AmountExceptions;
import com.adrian.androidfinance.core.exceptions.CurrencyExceptions;
import com.adrian.androidfinance.core.interfaces.Storage;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adrian on 14.02.2018.
 */

public class DefaultStorage implements Storage{

    private String name;
    private Map<Currency, BigDecimal> currencyAmounts = new HashMap<>();
    private List<Currency> currencyList;

    public DefaultStorage(String name) {
        this.name = name;
    }

    public DefaultStorage(String name, Map<Currency, BigDecimal> currencyAmounts, List<Currency> currencyList) {
        this.name = name;
        this.currencyAmounts = currencyAmounts;
        this.currencyList = currencyList;
    }

    public DefaultStorage(Map<Currency, BigDecimal> currencyAmounts) {
        this.currencyAmounts = currencyAmounts;
    }

    public DefaultStorage(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public void setAvailableCurrencies(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public List<Currency> getAvailableCurrencies() {
        return currencyList;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Map<Currency, BigDecimal> getCurrencyAmounts() {
        return currencyAmounts;
    }

    public void setCurrencyAmounts(Map<Currency, BigDecimal> currencyAmounts) {
        this.currencyAmounts = currencyAmounts;
    }

    @Override
    public void addCurrency(Currency currency) throws CurrencyExceptions {
        if (currencyAmounts.containsKey(currency)){
            throw new CurrencyExceptions("Currency already exist");
        }
        currencyList.add(currency);
        currencyAmounts.put(currency, BigDecimal.ZERO);
    }

    @Override
    public void deleteCurrency(Currency currency) throws CurrencyExceptions {

        checkCurrencyExist(currency);

        if (!currencyAmounts.get(currency).equals(BigDecimal.ZERO)){
            throw new CurrencyExceptions("Can't delete currency with amount");
        }
        currencyAmounts.remove(currency);
        currencyList.remove(currency);
    }

    @Override
    public Currency getCurrency(String code) throws CurrencyExceptions {
        for (Currency currency : currencyList){
            if (currency.getCurrencyCode().equals(code)){
                return currency;
            }
        }
        throw new CurrencyExceptions("Currency (code = " + code + ") not exist in storage");
    }

    @Override
    public BigDecimal getApproxAmount(Currency currency) {
        //TODO de implimentat bilantul cu conversia intr-o anumita valuta
        throw new UnsupportedOperationException("Not Implement");
    }

    @Override
    public BigDecimal getAmount(Currency currency) throws CurrencyExceptions {
        checkCurrencyExist(currency);
        return currencyAmounts.get(currency);
    }

    @Override
    public void changeAmount(BigDecimal amount, Currency currency) throws CurrencyExceptions {
        checkCurrencyExist(currency);
        currencyAmounts.put(currency, amount);

    }

    @Override
    public void addAmount(BigDecimal amount, Currency currency) throws CurrencyExceptions {
        checkCurrencyExist(currency);
        BigDecimal oldAmount = currencyAmounts.get(currency);
        currencyAmounts.put(currency, oldAmount.add(amount));
    }

    @Override
    public void expenseAmount(BigDecimal amount, Currency currency) throws CurrencyExceptions, AmountExceptions {
        checkCurrencyExist(currency);
        BigDecimal oldAmount = currencyAmounts.get(currency);
        BigDecimal newValue = oldAmount.subtract(amount);
        checkAmount(amount);
        currencyAmounts.put(currency, newValue);

    }

    // Check if currency exist
    private void checkCurrencyExist(Currency currency) throws CurrencyExceptions{
        if (!currencyAmounts.containsKey(currency)){
            throw new CurrencyExceptions("Currency "+currency+" not exist");
        }
    }
    private void checkAmount(BigDecimal amount) throws AmountExceptions {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new AmountExceptions("Can't be < 0");
        }
    }
}

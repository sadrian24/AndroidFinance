package com.adrian.androidfinance.core.impls;

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
        return null;
    }

    public void setCurrencyAmounts(Map<Currency, BigDecimal> currencyAmounts) {
        this.currencyAmounts = currencyAmounts;
    }

    @Override
    public void addCurrency(Currency currency) {
        currencyList.add(currency);
        currencyAmounts.put(currency, BigDecimal.ZERO);
    }

    @Override
    public void deleteCurrency(Currency currency) {
        currencyAmounts.remove(currency);
        currencyList.remove(currency);
    }

    @Override
    public Currency getCurrency(String code) {
        for (Currency currency : currencyList){
            if (currency.getCurrencyCode().equals(code)){
                return currency;
            }
        }
        return null;
    }

    @Override
    public BigDecimal getApproxAmount(Currency currency) {
        //TODO de implimentat bilantul cu conversia intr-o anumita valuta
        throw new UnsupportedOperationException("Not Implement");
    }

    @Override
    public BigDecimal getAmount(Currency currency) {
        return currencyAmounts.get(currency);
    }

    @Override
    public void changeAmount(BigDecimal amount, Currency currency) {
        currencyAmounts.put(currency, amount);

    }

    @Override
    public void addAmount(BigDecimal amount, Currency currency) {
        BigDecimal oldAmount = currencyAmounts.get(currency);
        currencyAmounts.put(currency, oldAmount.add(amount));
    }

    @Override
    public void expenseAmount(BigDecimal amount, Currency currency) {
        BigDecimal oldAmount = currencyAmounts.get(currency);
        BigDecimal newValue = oldAmount.subtract(amount);
        currencyAmounts.put(currency, newValue);

    }
}

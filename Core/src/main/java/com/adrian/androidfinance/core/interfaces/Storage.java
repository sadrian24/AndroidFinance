package com.adrian.androidfinance.core.interfaces;

import com.adrian.androidfinance.core.exceptions.AmountExceptions;
import com.adrian.androidfinance.core.exceptions.CurrencyExceptions;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import java.util.Map;

/**
 * Created by Adrian on 14.02.2018.
 */


// TODO de schimbat tipul BigDecimal cu un class care lucreaza cu banii (Money)
public interface Storage {

    String getName();

    // Obtinerea bilantului

    Map<Currency, BigDecimal> getCurrencyAmounts();

    BigDecimal getAmount(Currency currency) throws CurrencyExceptions;

    BigDecimal getApproxAmount(Currency currency);


    // Lucru cu bilantu
    void changeAmount(BigDecimal amount, Currency currency) throws CurrencyExceptions;

    void addAmount(BigDecimal amount, Currency currency) throws CurrencyExceptions;

    void expenseAmount(BigDecimal amount, Currency currency) throws CurrencyExceptions, AmountExceptions;



    // lucru cu Valute
    void addCurrency(Currency currency) throws CurrencyExceptions; // Add Currency

    void deleteCurrency(Currency currency) throws CurrencyExceptions; // Delete Currency

    Currency getCurrency(String code) throws CurrencyExceptions; // Get Currency by Code

    List<Currency> getAvailableCurrencies(); // Get all currency


}

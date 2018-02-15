package com.adrian.androidfinance.core.interfaces;

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
    void changeAmount(BigDecimal amount, Currency currency);

    void addAmount(BigDecimal amount, Currency currency);

    void expenseAmount(BigDecimal amount, Currency currency);



    // lucru cu Valute
    void addCurrency(Currency currency); // Add Currency

    void deleteCurrency(Currency currency); // Delete Currency

    Currency getCurrency(String code); // Get Currency by Code

    List<Currency> getAvailableCurrencies(); // Get all currency


}

package com.adrian.androidfinance.core.DAO.interfaces;

import com.adrian.androidfinance.core.interfaces.Storage;

import java.math.BigDecimal;
import java.util.Currency;

public interface StorageDAO extends CommonDAO<Storage> {
    boolean addCurrency(Storage storage, Currency currency);
    boolean deleteCurrency(Storage storage, Currency currency);
    boolean updateCurrency(Storage storage, BigDecimal amount);
}

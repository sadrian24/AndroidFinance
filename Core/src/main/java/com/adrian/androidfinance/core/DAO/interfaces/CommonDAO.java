package com.adrian.androidfinance.core.DAO.interfaces;

import java.util.List;

public interface CommonDAO<T> {
    List<T> getAll();

    T get(long id);

    boolean update(T storage);

    boolean delete(T storage);
}

package com.adrian.androidfinance.core.interfaces;

import com.adrian.androidfinance.core.objects.OperationType;

public interface Source {

    String getName();

    long getId();
    OperationType getOperationType();
}

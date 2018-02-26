package com.adrian.androidfinance.core.abstracts;

import java.util.Calendar;

/**
 * Created by Adrian on 26.02.2018.
 */

public class AbstractOperation {
    private long id;
    private String addInfo;
    private Calendar dateTime;


    public AbstractOperation() {
    }

    public AbstractOperation(long id) {
        this.id = id;
    }

    public AbstractOperation(long id, String addInfo, Calendar dateTime) {
        this.id = id;
        this.addInfo = addInfo;
        this.dateTime = dateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    public Calendar getDateTime() {
        return dateTime;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }
}

package com.example.loginregistro.models;
public class Festivos {
    private String date;
    private String name;
    private boolean _static;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean is_static() {
        return _static;
    }

    public void set_static(boolean _static) {
        this._static = _static;
    }
}

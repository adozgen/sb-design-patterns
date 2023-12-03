package com.adozgen.sbdesignpatterns.abstractfactory.example;
public class NoSQLConnection implements IDatabaseConnection {
    @Override
    public String connect() {
        return "no sql";
    }
}

package com.adozgen.sbdesignpatterns.abstractfactory.example;
public class SQLConnection implements IDatabaseConnection {
    @Override
    public String connect() {
        return "sql";
    }
}

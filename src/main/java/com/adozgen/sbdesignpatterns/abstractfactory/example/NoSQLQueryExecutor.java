package com.adozgen.sbdesignpatterns.abstractfactory.example;
public class NoSQLQueryExecutor implements IQueryExecutor {
    @Override
    public String executeQuery() {
        return "no sql executor";
    }
}

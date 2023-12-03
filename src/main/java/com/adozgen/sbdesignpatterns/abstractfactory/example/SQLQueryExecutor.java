package com.adozgen.sbdesignpatterns.abstractfactory.example;
public class SQLQueryExecutor implements IQueryExecutor {
    @Override
    public String executeQuery() {
        return "sql executor";
    }
}

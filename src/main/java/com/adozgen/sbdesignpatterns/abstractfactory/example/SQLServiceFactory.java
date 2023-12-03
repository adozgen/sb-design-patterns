package com.adozgen.sbdesignpatterns.abstractfactory.example;


public class SQLServiceFactory extends DatabaseServiceFactory {
    @Override
    public IDatabaseConnection createDatabaseConnection() {
        return new SQLConnection();
    }

    @Override
    public IQueryExecutor createQueryExecutor() {
        return new SQLQueryExecutor();
    }
}

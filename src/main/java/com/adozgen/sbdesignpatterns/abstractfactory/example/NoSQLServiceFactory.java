package com.adozgen.sbdesignpatterns.abstractfactory.example;


public class NoSQLServiceFactory extends DatabaseServiceFactory {
    @Override
    public IDatabaseConnection createDatabaseConnection() {
        return new NoSQLConnection();
    }

    @Override
    public IQueryExecutor createQueryExecutor() {
        return new NoSQLQueryExecutor();
    }
}

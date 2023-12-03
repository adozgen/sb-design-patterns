package com.adozgen.sbdesignpatterns.abstractfactory.example;

public abstract class DatabaseServiceFactory {
    public abstract IDatabaseConnection createDatabaseConnection();
    public abstract IQueryExecutor createQueryExecutor();
}

package com.adozgen.sbdesignpatterns.abstractfactory.example;


public class DatabaseClient {

    private DatabaseServiceFactory factory;
    private IDatabaseConnection connection;
    private IQueryExecutor executor;

    // Constructor
    public DatabaseClient(DatabaseServiceFactory factory) {
        this.factory = factory;
        this.connection = factory.createDatabaseConnection();
        this.executor = factory.createQueryExecutor();
    }

    public void performDatabaseOperations() {
        String connectionType = connection.connect();  // Veritabanına bağlan
        String query = executor.executeQuery();  // Veritabanından veri çek
        System.out.println("Connection type: " + connectionType);
        System.out.println("Query: " + query);
    }
}

package com.adozgen.sbdesignpatterns.singleton.example2;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionPool {

    private static DatabaseConnectionPool instance;
    private List<Connection> connections;
    private final int MAX_CONNECTIONS = 10;

    private DatabaseConnectionPool() {
        this.connections = new ArrayList<>();
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            connections.add(createNewConnectionForPool());
        }
    }

    private Connection createNewConnectionForPool() {
        // Veritabanı bağlantısı oluşturma
        return null;
    }

    public int getMaxConnections() {
        return connections.size();
    }

    public static DatabaseConnectionPool getInstance() {
        synchronized (DatabaseConnectionPool.class) {
            if (instance == null) {
                instance = new DatabaseConnectionPool();
            }
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        if (connections.isEmpty()) {
            return createNewConnectionForPool();
        } else {
            return connections.remove(connections.size() - 1);
        }
    }

    public synchronized void releaseConnection(Connection connection) {
        connections.add(connection);
    }

}

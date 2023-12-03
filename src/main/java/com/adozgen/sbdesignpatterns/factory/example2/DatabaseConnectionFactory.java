package com.adozgen.sbdesignpatterns.factory.example2;

public class DatabaseConnectionFactory {
    public IDatabaseConnection getConnection(String dbType) {
        return switch (dbType) {
            case "MySQL" -> new MySQLConnection();
            case "PostgreSQL" -> new PostgreSQLConnection();
            case "Oracle" -> new OracleConnection();
            default -> throw new IllegalArgumentException("Unknown database type");
        };
    }
}

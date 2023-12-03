package com.adozgen.sbdesignpatterns.factory.example2;

public class PostgreSQLConnection implements IDatabaseConnection
{
    @Override
    public String connect() {
        return "Connected to PostgreSQL database";
    }
}

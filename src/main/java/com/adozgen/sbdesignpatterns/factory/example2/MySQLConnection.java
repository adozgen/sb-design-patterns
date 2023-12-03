package com.adozgen.sbdesignpatterns.factory.example2;

public class MySQLConnection implements IDatabaseConnection
{
    @Override
    public String connect() {
        return "Connected to MySQL database";
    }
}

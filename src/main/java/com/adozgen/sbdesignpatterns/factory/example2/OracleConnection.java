package com.adozgen.sbdesignpatterns.factory.example2;

public class OracleConnection implements IDatabaseConnection
{
    @Override
    public String connect() {
        return "Connected to Oracle database";
    }
}

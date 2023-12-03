package com.adozgen.sbdesignpatterns.factory.example1;

public class BankTransferPayment implements IPayment{
    @Override
    public String processPayment() {
        return "Bank Transfer";
    }
}

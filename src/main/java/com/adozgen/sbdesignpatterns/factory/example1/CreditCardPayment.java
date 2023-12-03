package com.adozgen.sbdesignpatterns.factory.example1;

public class CreditCardPayment implements IPayment{
    @Override
    public String processPayment() {
        return "Credit Card";
    }
}

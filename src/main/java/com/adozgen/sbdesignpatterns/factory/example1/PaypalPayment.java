package com.adozgen.sbdesignpatterns.factory.example1;

public class PaypalPayment implements IPayment{
    @Override
    public String processPayment() {
        return "Paypal";
    }
}

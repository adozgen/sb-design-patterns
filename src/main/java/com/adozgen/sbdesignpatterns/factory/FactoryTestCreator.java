package com.adozgen.sbdesignpatterns.factory;

import com.adozgen.sbdesignpatterns.factory.example1.IPayment;
import com.adozgen.sbdesignpatterns.factory.example1.PaymentFactory;
import com.adozgen.sbdesignpatterns.factory.example2.DatabaseConnectionFactory;
import com.adozgen.sbdesignpatterns.factory.example2.IDatabaseConnection;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class FactoryTestCreator {

    public PaymentFactory createPaymentFactory() {
        return new PaymentFactory();
    }

    public DatabaseConnectionFactory createDatabaseConnectionFactory() {
        return new DatabaseConnectionFactory();
    }

    @PostConstruct
    public void init() {
        //example1 test
        PaymentFactory paymentFactory = createPaymentFactory();
        IPayment payment = paymentFactory.createPayment("com.adozgen.sbdesignpatterns.factory.example1.PaypalPayment");
        String  paymentType = payment.processPayment();
        System.out.println(paymentType);

        //example2 test
        DatabaseConnectionFactory databaseConnectionFactory = createDatabaseConnectionFactory();
        IDatabaseConnection databaseConnection = databaseConnectionFactory.getConnection("PostgreSQL");
        String connectionType = databaseConnection.connect();
        System.out.println(connectionType);

    }

}

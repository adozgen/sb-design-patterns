package com.adozgen.sbdesignpatterns.factory.example1;

import java.lang.reflect.InvocationTargetException;

public class PaymentFactory {
    public IPayment createPayment(String paymentType) {
        try {
            // Sınıfın adını kullanarak Class nesnesi elde etme
            Class<?> paymentClass = Class.forName(paymentType);
            // Class nesnesini kullanarak sınıfın bir örneğini oluşturma
            return (IPayment) paymentClass.getConstructor().newInstance();

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.out.println("Sınıf bulunamadı.");
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

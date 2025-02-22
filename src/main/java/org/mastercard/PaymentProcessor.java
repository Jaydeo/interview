package org.example;

public class PaymentProcessor<T extends Payment> {
    private T paymentMethod;

    public PaymentProcessor(T paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void executePayment() {
        paymentMethod.processPayment();
    }
}

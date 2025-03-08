package org.example;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        if(paymentStrategy == null) {
            throw new IllegalStateException("Estratégia de pagamento não definida");
        }
        paymentStrategy.processPayment(amount);
    }
}
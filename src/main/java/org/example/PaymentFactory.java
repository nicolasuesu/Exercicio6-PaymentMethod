package org.example;

public class PaymentFactory {
    public static PaymentStrategy createPayment(int type) {
        return switch (type) {
            case 1 -> new PixPayment();
            case 2 -> new CreditCardPayment();
            case 3 -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido");
        };
    }
}
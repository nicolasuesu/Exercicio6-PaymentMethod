package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = String.format("%011d", new Random().nextInt(100000000));

        System.out.println("\n=== Pagamento Boleto ===");
        System.out.println("Valor: R$" + amount);
        System.out.println("Código: " + boletoCode);
        System.out.println("Status: Boleto gerado!");
    }
}
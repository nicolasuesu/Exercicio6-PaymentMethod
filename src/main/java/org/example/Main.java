package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static PaymentProcessor processor = new PaymentProcessor();

    public static void main(String[] args) {
        while (true) {
            try {
                showMenu();
                int option = scanner.nextInt();
                scanner.nextLine(); // limpa buffer

                if(option == 0) {
                    System.out.println("Programa encerrado!");
                    break;
                }

                if(option >= 1 && option <= 3) {
                    System.out.println("Digite o valor:");
                    double amount = scanner.nextDouble();

                    if(amount <= 0) {
                        System.out.println("Valor inválido!");
                        continue;
                    }

                    // Usando Factory para criar a estratégia
                    PaymentStrategy strategy = PaymentFactory.createPayment(option);
                    // Configurando a estratégia no processor
                    processor.setPaymentStrategy(strategy);
                    // Processando o pagamento
                    processor.processPayment(amount);

                } else {
                    System.out.println("Opção inválida!");
                }

            } catch(Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n=== Sistema de Pagamentos ===");
        System.out.println("1 - PIX");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção:");
    }
}
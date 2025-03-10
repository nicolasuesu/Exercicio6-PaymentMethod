# Payment System with Strategy and Factory Method Patterns

## Project Description

This project demonstrates a simple payment system implemented in Java that combines the **Strategy** and **Factory Method** design patterns. The objective is to enable dynamic creation and processing of different payment methods (PIX, Credit Card, and Boleto) without modifying existing code when adding new payment options.

## Features

- **PIX:**  
  Generates a random code to simulate a PIX payment.

- **Credit Card:**  
  Prompts the user for a credit card number, performs basic validation (ensuring the card number has 16 digits), and simulates the transaction.

- **Boleto:**  
  Generates a fictitious code to simulate boleto issuance.

## Code Structure

The system is organized into multiple files, each with a specific responsibility:

1. **PaymentStrategy.java**  
   Defines the `PaymentStrategy` interface with the method `processPayment(double amount)`, which all payment strategies must implement.

2. **PixPayment.java**  
   Implements the `PaymentStrategy` for PIX payments, generating a random PIX code.

3. **CreditCardPayment.java**  
   Implements the `PaymentStrategy` for credit card payments. It prompts for the card number and validates its length.

4. **BoletoPayment.java**  
   Implements the `PaymentStrategy` for boleto payments, generating a fictitious boleto code.

5. **PaymentFactory.java**  
   Implements the Factory Method pattern by providing a static method `createPayment(int type)` that returns the appropriate payment strategy based on the user's selection.

6. **PaymentProcessor.java**  
   Responsible for setting and executing the selected payment strategy.

7. **Main.java**  
   The main class that displays an interactive terminal menu, captures user input, and utilizes the factory to create and process the payment transaction.

## How to Run

### Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher.
- **Terminal or IDE:** For compiling and executing the code.

### Compilation and Execution

1. **Save Each Class in a Separate File**  
   Make sure each class is saved in its own file (e.g., `PaymentStrategy.java`, `PixPayment.java`, etc.).

2. **Compile the Code**  
   Open a terminal in the directory containing the Java files and run:
   ```bash
   javac *.java
   ```

3. **Run the Program**  
   After successful compilation, run the program with:
   ```bash
   java Main
   ```

4. **Usage**  
   The program displays a menu similar to:
   ```
   === Sistema de Pagamentos ===
   1 - PIX
   2 - Cartão de Crédito
   3 - Boleto
   0 - Sair
   Escolha uma opção:
   ```
    - Enter the number corresponding to the desired payment method.
    - Input the transaction amount when prompted.
    - The system will use the `PaymentFactory` to create the appropriate payment strategy and process the transaction, displaying a confirmation message in the terminal.

## Implementation Details

- **Strategy Pattern:**  
  The different payment methods (PIX, Credit Card, Boleto) implement the `PaymentStrategy` interface. This encapsulates their individual payment processing logic and allows for flexible strategy selection.

- **Factory Method Pattern:**  
  The `PaymentFactory` class encapsulates object creation logic. Based on the user's input, it dynamically instantiates the correct payment strategy, making the code easily extendable for new payment methods.

- **Object-Oriented Programming Principles:**  
  The implementation utilizes encapsulation, inheritance, and polymorphism to create a modular, maintainable, and scalable codebase.

- **Error Handling:**  
  The system uses try/catch blocks to handle invalid inputs and exceptions, ensuring a robust user experience.

## How to Extend the System

To add a new payment method:

1. Create a new class that implements the `PaymentStrategy` interface with the custom payment logic.
2. Update the `PaymentFactory` by adding a new case for the new payment type.
3. Modify the menu in `Main.java` to include the new option.

## Conclusion

This project successfully demonstrates the combined use of the Strategy and Factory Method patterns to create a flexible and maintainable payment system in Java. The modular structure ensures that the system can be easily extended with new payment methods without modifying existing code, promoting scalability and good design practices.

---
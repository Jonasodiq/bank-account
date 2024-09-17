// 17 sep 2024 Jonas N Övning-2 Klasser och Objekt. Skapa en Bank Account klass
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account savingsAccount = new Account("Sara", 1000);
        Account checkingAccount = new Account("Jonas", 500);

        // Create an account using the default constructor
//        Account savingsAccount = new Account();
//        savingsAccount.setName("Alice");
//        savingsAccount.deposit(1000);
//        System.out.println(savingsAccount);

        // Create an account with balance
//        Account checkingAccount = new Account(500);
//        checkingAccount.setName("Bob");
//        checkingAccount.withdraw(200);
//        System.out.println(checkingAccount);

        // Create an account with name and balance
        Account businessAccount = new Account("Charlie", 1500);
        businessAccount.deposit(500);
        System.out.println(businessAccount);

        double currentBalance = savingsAccount.getBalance();
        System.out.println("Current balance: " + currentBalance);

        String currentName = businessAccount.getName();
        System.out.println("Current account holder: " + currentName);

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    try {
                        double depositAmount = scanner.nextDouble();
                        savingsAccount.deposit(depositAmount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    try {
                        double withdrawAmount = scanner.nextDouble();
                        savingsAccount.withdraw(withdrawAmount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to transfer: ");
                    try {
                        double transferAmount = scanner.nextDouble();
                        savingsAccount.transferAmount(checkingAccount, transferAmount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 4:
                    System.out.println(savingsAccount);
                    System.out.println(checkingAccount);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


// 17 sep 2024 Jonas N Övning-2 Klasser och Objekt. Skapa en Bank Account klass
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account savingsAccount = new Account("Sara", 1000);
        Account checkingAccount = new Account("Jonas", 500);

        // Create an account using the default constructor
        Account savingsAccountAlice = new Account();
        savingsAccountAlice.setName("Alice");
        savingsAccount.deposit(1000);
        System.out.println(savingsAccountAlice);

        // Create an account with balance
        Account checkingAccountBob = new Account(500);
        checkingAccountBob.setName("Bob");
        checkingAccount.withdraw(200);
        System.out.println(checkingAccountBob);

        // Create an account with name and balance
        Account businessAccount = new Account("Charlie", 1500);
        businessAccount.deposit(500);
        System.out.println(businessAccount);

        double currentBalance = savingsAccount.getBalance();
        System.out.println("Current balance: " + currentBalance);

        String currentName = businessAccount.getName();
        System.out.println("Current account holder: " + currentName);

        while (true) {
            System.out.println("1. Deposit \uD83D\uDCB5");
            System.out.println("2. Withdraw \uD83D\uDCB8");
            System.out.println("3. Transfer \uD83D\uDD01");
            System.out.println("4. Show Balance \uD83C\uDFE6");
            System.out.println("5. Exit \uD83D\uDD1A");
            System.out.print("Choose an option: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.❌ Please enter a number.");
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
                        System.out.println("Invalid input.❌ Please enter a valid amount.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    try {
                        double withdrawAmount = scanner.nextDouble();
                        savingsAccount.withdraw(withdrawAmount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input.❌ Please enter a valid amount.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to transfer: ");
                    try {
                        double transferAmount = scanner.nextDouble();
                        savingsAccount.transferAmount(checkingAccount, transferAmount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input.❌ Please enter a valid amount.");
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
                    System.out.println("Invalid choice.❌ Please try again.");
            }
        }
    }
}


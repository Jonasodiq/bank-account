// 17 sep 2024 Jonas N Övning-2 Klasser och Objekt. Skapa en Bank Account klass
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account savingsAccount = new Account("Alice", 1000);
        Account checkingAccount = new Account("Bob", 500);

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
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    savingsAccount.transferAmount(checkingAccount, transferAmount);
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


// 17 sep 2024 Jonas N Övning-2 Klasser och Objekt. Skapa en Bank Account klass

public class Main {
    public static void main(String[] args) {

        // Create an account using the default constructor
        Account savingsAccount = new Account();
        savingsAccount.setName("Alice");
        savingsAccount.deposit(1000);
        System.out.println(savingsAccount);

        // Create an account with balance
        Account checkingAccount = new Account(500);
        checkingAccount.setName("Bob");
        checkingAccount.withdraw(200);
        System.out.println(checkingAccount);

        // Create an account with name and balance
        Account businessAccount = new Account("Charlie", 1500);
        businessAccount.deposit(500);
        System.out.println(businessAccount);

        double currentBalance = savingsAccount.getBalance();
        System.out.println("Current balance: " + currentBalance);

        String currentName = businessAccount.getName();
        System.out.println("Current account holder: " + currentName);

    }
}


public class Account {

    // Instance variables
    private String name;
    private double balance;

    // Constructor that sets balance to 0
    public Account() {
        this.balance = 0;
    }

    // Constructor that takes in a balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Constructor that takes in a name
    public Account(String name) {
        this.name = name;
    }

    // Constructor that sets both name and balance
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to increase the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("You can't deposit a negative amount");
        }
    }

    // Method to reduce the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    // Method to read name
    public String getName() {
        return name;
    }

    // Method to write to a name
    public void setName(String name) {
        this.name = name;
    }

    // Method to read balance
    public double getBalance() {
        return balance;
    }

    // Method that returns a string with name and balance
    @Override
    public String toString() {
        return "Name: " + name + ", Balance: " + balance;
    }

    // Metod för att överföra pengar till ett annat konto
    public void transferAmount(Account toAccount, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " + this.name + " to " + toAccount.getName());
        } else {
            System.out.println("Invalid amount or insufficient funds for transfer.");
        }
    }
}

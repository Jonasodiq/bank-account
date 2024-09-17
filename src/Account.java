public class Account {

    // Instansvariabler
    private String name;
    private double balance;

    // Konstruktör som sätter balance till 0
    public Account() {
        this.balance = 0;
    }

    // Konstruktör som tar in en balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Konstruktör som tar in ett namn
    public Account(String name) {
        this.name = name;
    }

    // Konstruktör som sätter både name och balance
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Metod för att öka saldot
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("You can't deposit a negative amount");
        }
    }

    // Metod för att minska saldot
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    // Metod för att läsa name
    public String getName() {
        return name;
    }

    // Metod för att skriva till ett namn
    public void setName(String name) {
        this.name = name;
    }

    // Metod för att läsa balance
    public double getBalance() {
        return balance;
    }

    // Metod som returnerar en sträng med name och balance
    @Override
    public String toString() {
        return "Name: " + name + ", Balance: " + balance;
    }
}

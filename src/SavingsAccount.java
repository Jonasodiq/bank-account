public class SavingsAccount extends Account {
    private double interestRate;

    // Konstruktör som tar emot en räntesats
    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance); // Anropa superklassens konstruktör
        this.interestRate = interestRate;
    }

    // Metod för att lägga till ränta till balansen
    public void addInterest() {
        double interest = getBalance() * ( interestRate / 100);
        deposit(interest);
    }

    // Get & Setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Räntesats: " + interestRate + "%";
    }
}

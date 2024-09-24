public class SavingAccount extends Account {
    private double interestRate;
    public SavingAccount(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * ( interestRate / 100);
        deposit(interest);
    }

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

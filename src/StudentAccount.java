public class StudentAccount extends Account {
    private double discountRate;

    // Konstruktör som tar emot en rabatt
    public StudentAccount(String name, double balance, double discountRate) {
        super(name, balance); // Anropa superklassens konstruktör
        this.discountRate = discountRate;
    }

    // Metod för att göra ett uttag med rabatt
    @Override
    public void withdraw(double amount) {
        double discountedAmount = amount * (1 - discountRate / 100);
        super.withdraw(discountedAmount);
    }

    // Getter och Setter för rabatt
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rabatt: " + discountRate + "%";
    }
}


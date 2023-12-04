package Class1_OOP.BankSystem.week13;

public abstract class Account {
    protected double balance;
    protected long IBAN;
    protected double totalAssets;

    public Account(double balance, long IBAN, double totalAssets) {
        this.balance = balance;
        this.IBAN = IBAN;
        this.totalAssets = totalAssets;
    }

    public abstract void calculateTotalAssets();

    public void addToBalance(double amount) {
        balance += amount;
    }

    public void subtractFromBalance(double amount) {
        balance -= amount;
    }

    public void transferTo(Account other, double amount) {
        subtractFromBalance(amount);
        other.addToBalance(amount);
    }

    public String toString() {
        return "Balance: " + balance + ", IBAN: " + IBAN + ", Total Assets: " + totalAssets;
    }
}

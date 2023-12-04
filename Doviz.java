package Class1_OOP.BankSystem.week13;

import Class1_OOP.BankSystem.week13.Account;

public class Doviz extends Account {

    private double euro;
    private double usd;

    public Doviz(double balance, long IBAN, double euro, double usd) {
        super(balance, IBAN, 0);
        this.euro = euro;
        this.usd = usd;
        calculateTotalAssets();
    }

    public void calculateTotalAssets() {
        totalAssets = euro * 20.1 + usd * 18.9;
    }

    public String toString() {
        return "Currency Account - " + super.toString() + ", Euro: " + euro + "€, USD: " + usd + "$";
    }
}

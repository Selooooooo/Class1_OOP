package Class1_OOP.BankSystem.week13;

import Class1_OOP.BankSystem.week13.Account;

public class PreciousMetals extends Account {
    private double gold;
    private double silver;
    private double platinum;

    public PreciousMetals(double balance, long IBAN, double gold, double silver, double platinum) {
        super(balance, IBAN, 0);
        this.gold = gold;
        this.silver = silver;
        this.platinum = platinum;
        calculateTotalAssets();
    }

    public void calculateTotalAssets() {
        totalAssets = gold * 1104.7 + silver * 13.21 + platinum * 594.46;
    }

    public String toString() {
        return "Valuable Metals Account - " + super.toString() + ", Gold: " + gold + "g, Silver: " + silver + "g, Platinum: " + platinum + "g";
    }
}


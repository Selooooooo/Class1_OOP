package Class1_OOP.BankSystem.week13;

import Class1_OOP.BankSystem.week13.Doviz;
import Class1_OOP.BankSystem.week13.PreciousMetals;
import Class1_OOP.BankSystem.week13.Transfer;

public class Demo {
    public static void main(String[] args) {
        // Create a new PreciousMetals account with 10 grams of gold, 20 grams of silver, and 5 grams of platinum
        PreciousMetals pmAccount = new PreciousMetals(0, 1234567890123456L, 10, 20, 5);

        // Create a new Doviz account with 500 euros and 1000 US dollars
        Doviz dovizAccount = new Doviz(0, 1234567890123457L, 500, 1000);

        // Deposit 1000 TL into the PreciousMetals account
        Transfer.deposit(pmAccount, 1000);

        // Withdraw 500 TL from the Doviz account
        Transfer.withdraw(dovizAccount, 500);

        // Transfer 100 TL from the PreciousMetals account to the Doviz account
        Transfer.transfer(pmAccount, dovizAccount, 100);

        // Print out the account details
        System.out.println(pmAccount);
        System.out.println(dovizAccount);
    }
}

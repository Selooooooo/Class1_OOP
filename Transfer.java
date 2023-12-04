package Class1_OOP.BankSystem.week13;

import Class1_OOP.BankSystem.week13.Account;

public class Transfer {
    public static void deposit(Account account, double amount) {
        account.addToBalance(amount);
    }

    public static void withdraw(Account account, double amount) {
        account.subtractFromBalance(amount);
    }

    public static void transfer(Account source, Account destination, double amount) {
        if (source.balance >= amount) {
            source.subtractFromBalance(amount);
            destination.addToBalance(amount);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed: insufficient funds in source account");
        }
    }

}

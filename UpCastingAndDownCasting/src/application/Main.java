package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Lucas", 0.0, 500.00);

        //UPCASTING
        Account account2 = businessAccount;
        Account account3 = new BusinessAccount(1003, "Bob", 0.0, 250.00);
        Account account4 = new SavingsAccount(1004, "Ricardo", 0.0, 0.01);

        //DOWNCASTING
        BusinessAccount account5 = (BusinessAccount)account3;
        account5.loan(100.00);
        if (account4 instanceof BusinessAccount) {
            BusinessAccount account6 = (BusinessAccount) account4;
            account6.loan(200.00);
            System.out.println("Emprestimo!");
        }

        if (account4 instanceof SavingsAccount) {
            SavingsAccount account6 = (SavingsAccount) account4;
            account6.updateBalance();
            System.out.println("Atualizando!");
        }
    }
}
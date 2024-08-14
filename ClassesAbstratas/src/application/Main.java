package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> listAccounts = new ArrayList<>();

        listAccounts.add(new SavingsAccount(1001, "Maria", 1000.00, 0.01));
        listAccounts.add(new BusinessAccount(1002, "Bob", 1000.00, 500.00));
        listAccounts.add(new SavingsAccount(1003, "Ana", 1180.00, 0.01));
        listAccounts.add(new BusinessAccount(1004, "Alex", 500.00, 500.00));

        double sum = 0.0;
        for (Account account : listAccounts) {
            sum += account.getBalance();
        }

        System.out.printf("Saldo Total: %.2f%n", sum);

        for (Account account : listAccounts) {
            account.deposit(150);
        }

        for (Account account : listAccounts) {
            System.out.printf("Saldo da Conta %d: %.2f%n", account.getNumber(), account.getBalance());
        }
    }
}
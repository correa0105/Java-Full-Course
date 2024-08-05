package application;

import entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int accountNumber = sc.nextInt();

        System.out.print("Digite o nome do titular da conta: ");
        sc.nextLine();
        String cardholderName = sc.nextLine();

        System.out.print("Você quer depositar um valor inicial? (s/n) ");
        char verifyInitialDeposit = sc.next().charAt(0);

        Account account;

        if (verifyInitialDeposit == 's') {
            System.out.print("Digite o valor inicial de depósito: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, cardholderName, initialDeposit);
        } else {
            account = new Account(accountNumber, cardholderName);
        }

        System.out.println("Dados da conta: " + account.toString());

        System.out.print("Digite o valor do depósito: ");
        account.deposit(sc.nextDouble());

        System.out.println("Conta Atualizada: " + account.toString());

        System.out.print("Digite o valor do saque: ");
        account.withdraw(sc.nextDouble());

        System.out.println("Conta Atualizada: " + account.toString());

        sc.close();
    }
}
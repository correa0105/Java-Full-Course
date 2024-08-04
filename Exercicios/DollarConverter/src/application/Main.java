package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("Qual o valor atual do dolar? ");
        cc.currencyDollar = sc.nextDouble();

        System.out.println("Quantos dolares você deseja comprar? ");
        cc.dollarAmountPurchased = sc.nextDouble();

        System.out.printf("O valor que ai pagar em reais, considerando o IOF é: %.2f%n", cc.dollarConverter());
    }
}
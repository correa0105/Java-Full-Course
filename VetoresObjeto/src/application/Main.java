package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de adições: ");
        int n = sc.nextInt();

        Product[] vect= new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Informe o nome do produto: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Informe o preço produto: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double average = sum / n;

        System.out.println("Média: " + average);

        sc.close();
    }
}
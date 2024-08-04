package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto");

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço: ");
        double price = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Dados do Produto: " + product);

        System.out.print("Digite a quantidade de produtos a serem adicionados no estoque: ");
        int quanityAdd = sc.nextInt();
        product.addProducts(quanityAdd);
        System.out.println("Dados do Atualiszados: " + product);

        System.out.print("Digite a quantidade de produtos a serem removidas no estoque: ");
        int quanityRemove = sc.nextInt();
        product.removeProducts(quanityRemove);
        System.out.println("Dados do Atualizados: " + product);

        sc.close();
    }
}
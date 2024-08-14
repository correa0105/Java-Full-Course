package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int qntProducts = sc.nextInt();
        sc.nextLine();

        List<Product> productList = new ArrayList<>();

        for(int i = 0; i<qntProducts; i++) {
            System.out.println("Produto #" + (i+1));

            System.out.print("Produto Comum, Usado ou Importado (C/U/I)? ");
            char productType = sc.nextLine().charAt(0);

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Preço: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Product product;

            if(productType == 'C' || productType == 'c') {
                product = new Product(name, price);
                productList.add(product);
            }

            if(productType == 'U' || productType == 'u') {
                System.out.print("Data de Manufaturação: ");
                String manufactureDate = sc.nextLine();
                product = new UsedProduct(name, price, LocalDate.parse(manufactureDate, dateTimeFormatter));
                productList.add(product);
            }

            if(productType == 'I' || productType == 'i') {
                System.out.print("Custo de Importação: ");
                double customFee = sc.nextDouble();
                sc.nextLine();
                product = new ImportedProduct(name, price, customFee);
                productList.add(product);
            }
        }

        System.out.println("Tag do Produto: ");
        for(Product product : productList) {
            System.out.println(product.priceTag());
        }
    }
}
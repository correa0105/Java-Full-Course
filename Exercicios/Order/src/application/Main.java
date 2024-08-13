package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatComplete = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Dados do Cliente:");

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), dateFormatComplete);

        System.out.println("Dados da Ordem:");
        System.out.print("Status: ");
        String orderStatus = sc.next();

        Client client = new Client(name, email, birthDate);
        Order order = new Order(client, LocalDateTime.now(), OrderStatus.valueOf(orderStatus));

        System.out.print("Quantos produtos vai adicionar na ordem? ");
        int numberProductList = sc.nextInt();

        for(int i = 0; i<numberProductList; i++) {
            System.out.println("Informações do Item #" + (i+1));

            System.out.print("Nome do Produto: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Preço do Produto: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantidade de Produtos: ");
            int qntProduct = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(product, qntProduct);

            order.addItem(orderItem);
        }

        System.out.println(order);

        sc.close();
    }
}
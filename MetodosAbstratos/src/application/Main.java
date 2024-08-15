package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> listShapes = new ArrayList<>();

        System.out.print("Qual o numero de formas? ");
        int numberShapes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<numberShapes; i++) {
            System.out.println("Forma #" + (i+1));

            System.out.print("É Ciruculo ou Retangulo (C/R)? ");
            char rectangleOrCircle = sc.next().charAt(0);

            System.out.print("Qual a Cor? (BLACK/BLUE/RED)? ");
            Color color = Color.valueOf(sc.next());

            Shape shape;

            if (rectangleOrCircle == 'r' || rectangleOrCircle == 'R') {
                System.out.print("Largura: ");
                double width = sc.nextDouble();

                System.out.print("Altura: ");
                double heigth = sc.nextDouble();

                shape = new Rectangle(color, width, heigth);
                listShapes.add(shape);
            }

            if (rectangleOrCircle == 'c' || rectangleOrCircle == 'C') {
                System.out.print("Raio: ");
                double radius = sc.nextDouble();

                shape = new Circle(color, radius);
                listShapes.add(shape);
            }
        }

        System.out.println("Formas: ");

        for (Shape shape : listShapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
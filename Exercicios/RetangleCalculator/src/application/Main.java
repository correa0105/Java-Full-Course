package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle retangle = new Retangle();

        System.out.println("Digite a largura e a altura do retangulo: ");

        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangle.area());
        System.out.printf("PERIMETRO = %.2f%n", retangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangle.diagonal());

        sc.close();
    }
}
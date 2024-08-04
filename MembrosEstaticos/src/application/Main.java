package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double radius = sc.nextDouble();

        double circumference = Calculator.circumference(radius);
        double volume = Calculator.volume(radius);

        System.out.printf("Circunferencia: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);
    }
}
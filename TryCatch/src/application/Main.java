package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("Metodo 1 Iniciando!");
        method2();
        System.out.println("Metodo 1 Finalizando!");
    }

    public static void method2() {
        System.out.println("Metodo 2 Iniciando!");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição Inválida!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Entrada Inválida!");
        }

        sc.close();
        System.out.println("Metodo 2 Finalizando!");
    }
}
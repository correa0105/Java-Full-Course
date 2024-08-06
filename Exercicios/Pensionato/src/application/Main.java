package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos quartos serão alugados? ");
        int numberStudents = sc.nextInt();

        while (numberStudents > 10 || numberStudents <= 0) {
            System.out.println("A quantidade maxima permitida é 10");
            System.out.print("Quantos estudantes vão alugar? ");
            numberStudents = sc.nextInt();
        }

        Rent[] rooms = new Rent[10];
        sc.nextLine();

        for(int i = 0; i < numberStudents; i++) {
            System.out.println("Aluguel #" + (i+1) + ":");

            System.out.print("Nome do Estudante: ");
            String studentName = sc.nextLine();

            System.out.print("Email Estudante: ");
            String studentEmail = sc.nextLine();

            System.out.print("Nª Quarto: ");
            int room = sc.nextInt();
            sc.nextLine();

            rooms[room] = new Rent(studentName, studentEmail, room);
        }

        System.out.println("Quartos Alugados: ");
        for(int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null) System.out.println(rooms[i].toString());
        }

        sc.close();
    }
}
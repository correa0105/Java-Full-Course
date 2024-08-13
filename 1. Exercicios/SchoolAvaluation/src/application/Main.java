package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        student.name = sc.nextLine();

        System.out.println("Digite as 3 notas do aluno: ");
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.println("NOTA FINAL: " + student.calcStudentAverage());
        student.checksApproval(student.calcStudentAverage());

    }
}
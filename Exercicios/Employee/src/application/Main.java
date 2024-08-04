package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();

        System.out.print("Salário Bruto: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Funcionário: " + emp);

        System.out.print("Porcentual que deseja adicionar ao salário? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Valor atualizado: " + emp);

        sc.close();
    }
}
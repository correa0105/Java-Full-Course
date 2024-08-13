package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<>();

        System.out.print("Digite a quantidade de funcionários: ");
        int employeeNumber = sc.nextInt();

        for (int i = 0; i<employeeNumber; i++) {
            sc.nextLine();
            System.out.println("Funcionários #" + (i+1));

            System.out.print("Terceirizado (s/n)? ");
            char isOutsourced = sc.nextLine().charAt(0);

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Horas Trabalhadas: ");
            int hours = sc.nextInt();

            System.out.print("Valor por Hora: ");
            double valuePerHour = sc.nextDouble();

            Employee employee;
            if (isOutsourced == 's') {
                System.out.print("Custo Adicional: ");
                double additionalCharge = sc.nextDouble();

                employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                listEmployee.add(employee);
            } else {
                employee = new Employee(name, hours, valuePerHour);
                listEmployee.add(employee);
            }
        }

        for (Employee emp : listEmployee) {
            System.out.println(emp.getName() + " - R$" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
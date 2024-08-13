package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Quantos funcionários será cadastrado? ");
        int qtdEmployee = sc.nextInt();

        for (int i = 0; i < qtdEmployee; i++) {
            System.out.println("Colaborador #" + (i+1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        System.out.print("Digite o ID do colaborador que deseja aumentar o salário: ");
        int idEmployee = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a porcentagem de acrescimo: ");
        double salaryIncrease = sc.nextDouble();

        List<Employee> result = employeeList.stream().filter(x -> x.getId() == idEmployee).toList();
        for(Employee employee : result) {
            double salaryAtt = employee.getSalary() + (employee.getSalary() * (salaryIncrease / 100));
            employee.setSalary(salaryAtt);
        }

        System.out.println("Lista de Colaboradores: ");

        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
}
package application;

import entities.Department;
import entities.Contract;
import entities.Worker;
import enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatComplete = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateFormatMonthYear = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String departamentName = sc.nextLine();

        System.out.println("Digite os dados do trabalhador: ");

        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Senioridade: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salario Base: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(new Department(departamentName), workerName, baseSalary, WorkerLevel.valueOf(workerLevel));

        System.out.print("Quantos contratos tem este trabalhador: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            System.out.println("Preencha o Contrato #" + (i+1) + ":");

            System.out.print("Data (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), dateFormatComplete);

            System.out.print("Valor por Hora: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duração do Contrato (Horas): ");
            int hours = sc.nextInt();

            Contract contrat = new Contract(contractDate, valuePerHour, hours);
            worker.addContract(contrat);
        }

        System.out.print("Digite o mes e o ano para calcular o salário (MM/YYYY): ");
        YearMonth period = YearMonth.parse(sc.next(), dateFormatMonthYear);
        int month = period.getMonthValue();
        int year = period.getYear();

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartament().getName());
        System.out.println("Ele recebeu na data " + period.format(dateFormatMonthYear) + ": " + worker.income(month,year));
        sc.close();
    }
}
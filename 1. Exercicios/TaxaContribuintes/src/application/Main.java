package application;

import entities.Company;
import entities.Individual;
import entities.Taxpayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Taxpayer> listTaxpayer = new ArrayList<Taxpayer>();

        System.out.print("Quantidade de Contribuintes: ");
        int numberOfContribuintes = sc.nextInt();

        for (int i = 0; i < numberOfContribuintes; i++) {
            System.out.println("Contribuinte #" + (i + 1));

            System.out.print("Pessoa Fisica ou Juridica? (PF/PJ)? ");
            String type = sc.next().substring(0, 2);

            System.out.print("Nome: ");
            String name = sc.next();

            System.out.print("Renda Anual: ");
            Double anualIncome = sc.nextDouble();

            if (type.equals("PF") || type.equals("pf")) {
                System.out.print("Despesas de Saúde: ");
                Double healthExpenditures = sc.nextDouble();
                listTaxpayer.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Quantidade de Funcionários: ");
                Integer numberOfEmployees = sc.nextInt();
                listTaxpayer.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("Contribuintes:");
        for (Taxpayer taxpayer : listTaxpayer) {
            System.out.println(taxpayer.getName() + ": R$ " + String.format("%.2f", taxpayer.tax()));
        }

        double sum = 0.0;

        for (Taxpayer taxpayer : listTaxpayer) {
            sum += taxpayer.tax();
        }

        System.out.println("Taxas Totais: R$ " + String.format("%.2f", sum));

        sc.close();
    }
}
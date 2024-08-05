import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de adições: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor para adicionar no vetor: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
             sum += vect[i];
        }

        double average = sum / n;

        System.out.println("Média: " + average);

        sc.close();
    }
}
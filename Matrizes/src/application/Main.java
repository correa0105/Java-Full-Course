package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe o tamanho da matriz: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i< mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                System.out.printf("Informe o numero que vai ficar na Linha=%d e Coluna=%d: ", (i+1), (j+1));
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Principal: ");
        for (int i = 0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int qtdNegativeNumbers = 0;

        for (int i = 0; i<mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                int number = mat[i][j];
                if (number < 0) {
                    qtdNegativeNumbers++;
                }
            }
        }

        System.out.printf("\nQuantidade de numeros negativos: " + qtdNegativeNumbers);
    }
}
package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe a quantidade de linhas: ");
        int line = sc.nextInt();

        System.out.print("Informe a quantidade de colunas: ");
        int column = sc.nextInt();

        int[][] mat = new int[line][column];

        for (int i = 0; i< mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                System.out.printf("Informe o numero que vai ficar na Linha=%d e Coluna=%d: ", (i+1), (j+1));
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i< mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                System.out.printf(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Digite o numero para buscar na matriz: ");
        int searchValue = sc.nextInt();

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == searchValue) {
                    System.out.println("Linha: " + i + ", Coluna: " + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Baixo: " + mat[i+1][j]);
                    }
                }
            }
        }
    }
}
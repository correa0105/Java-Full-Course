import java.util.Scanner;

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe um Valor para X:");
        double x = sc.nextDouble();

        System.out.printf("Informe um Valor para Y:");
        double y = sc.nextDouble();

        double total = x + y;

        System.out.printf("A soma de X + Y (%.2f + %.2f) é: %.2f", x, y, total);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        System.out.printf("Informe o raio do circulo:");
        double raio = sc.nextDouble();

        double calculaArea = pi * (Math.pow(raio, 2));

        System.out.printf("A Area do circulo é: %.4f", calculaArea);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe A:");
        int a = sc.nextInt();

        System.out.printf("Informe B:");
        int b = sc.nextInt();

        System.out.printf("Informe C:");
        int c = sc.nextInt();

        System.out.printf("Informe D:");
        int d = sc.nextInt();

        double produtoDiferenca = ((a * b) - (c * d));

        System.out.printf("A diferença do produto de A e B pelo produto de C e D é: %.2f", produtoDiferenca);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o numero do colaborador:");
        int numeroColaborador = sc.nextInt();

        System.out.printf("Quantidade de horas trabalhadas:");
        int horasTrabalhadas = sc.nextInt();

        System.out.printf("Valor por hora:");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("Numero do colaborador: %d\n", numeroColaborador);
        System.out.printf("Salário do colaborador: U$ %.2f", salario);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codPeca1, codPeca2, qntPeca1, qntPeca2;
        double valorPeca1, valorPeca2, totalPeca1, totalPeca2, total;

        System.out.printf("Primeira peça, informe o CÓDIGO, a QUANTIDADE e o VALOR UNITÁRIO:");
        codPeca1 = sc.nextInt();
        qntPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        totalPeca1 = qntPeca1 * valorPeca1;

        System.out.printf("Segunda peça, informe o CÓDIGO, a QUANTIDADE e o VALOR UNITÁRIO:");
        codPeca2 = sc.nextInt();
        qntPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
        totalPeca2 = qntPeca2 * valorPeca2;

        total = totalPeca1 + totalPeca2;

        System.out.printf("Valor a pagar: R$ %.2f", total);
    }
}*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double pi = 3.14159;

        System.out.printf("Informe A, B, C:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double areaTrianguloRetangulo = (a * c) / 2;
        double areaDoCirulo = pi * (Math.pow(c, 2));
        double areaDoTrapezio = ((a + b)*c) / 2;
        double areaDoQuadrado = Math.pow(b, 2);
        double areaDoRetangulo = a * b;


        System.out.printf("A área do triângulo retângulo que tem A por base e C por altura é: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("A área do círculo de raio C é: %.3f\n", areaDoCirulo);
        System.out.printf("A área do trapézio que tem A e B por bases e C por altura é: %.3f\n", areaDoTrapezio);
        System.out.printf("A área do quadrado que tem lado B é: %.3f\n", areaDoQuadrado);
        System.out.printf("A área do retângulo que tem lados A e B é: %.3f", areaDoRetangulo);
    }
}

import java.util.Scanner;

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("Você digitou 0!");
        } else if (numero > 0) {
            System.out.println("Seu numero é positivo");
        } else {
            System.out.println("Seu numero é negativo");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é PAR");
        } else {
            System.out.println("O numero é IMPAR");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            if (a % b == 0) {
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        } else {
            if (b % a == 0) {
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        }

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a hora inicial e hora final de um jogo: ");
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        if (horaInicial == horaFinal) {
            duracao = 24;
        }

        System.out.printf("O jogo durou %d horas", duracao);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o codigo do item e a quantidade: ");
        int codigoItem = sc.nextInt();
        int quantidade = sc.nextInt();

        double totalDaConta = 0;

        if (codigoItem == 1) {
            totalDaConta = quantidade * 4;
        } else if (codigoItem == 2) {
            totalDaConta = quantidade * 4.50;
        } else if (codigoItem == 3) {
            totalDaConta = quantidade * 5;
        } else if (codigoItem == 4) {
            totalDaConta = quantidade * 2;
        } else if (codigoItem == 5) {
            totalDaConta = quantidade * 1.50;
        }

        System.out.printf("Total a pagar: R$ %.2f", totalDaConta);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.printf("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.printf("Intervalo [25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.printf("Intervalo [50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.printf("Intervalo [75,100]");
        } else {
            System.out.printf("Fora de intervalo!");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x < 0 && y > 0) {
            System.out.printf("Q2");
        } else if (x > 0 && y > 0) {
            System.out.printf("Q1");
        } else if (x < 0 && y < 0) {
            System.out.printf("Q3");
        } else if (x > 0 && y < 0) {
            System.out.printf("Q4");
        } else if (x == 0 && y == 0) {
            System.out.printf("Origem");
        }
    }
}*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salario: ");
        double salario = sc.nextDouble();

        double valorIsento = 2000;
        double valorDoImpostoFaixa1 = 80;
        double valorDoImpostoFaixa2 = valorDoImpostoFaixa1 + 270;
        double valorDoImposto = 0;

        if (salario <= 2000) {
            System.out.println("Isento de impostos");
        } else if (salario > 2000 && salario <= 3000) {
            double residuoDeImposto = salario - valorIsento;
            valorDoImposto = residuoDeImposto * 0.8;
        } else if (salario > 3000 && salario <= 4500) {
            double residuoDeImposto = salario - valorIsento - 1000;
            valorDoImposto = valorDoImpostoFaixa1 + (residuoDeImposto * 0.18);

        } else if (salario > 4500) {
            double residuoDeImposto = salario - valorIsento - 1000 - 1500;
            valorDoImposto = valorDoImpostoFaixa2 + (residuoDeImposto * 0.28);
        }

        System.out.println("Valor do Imposto: R$ " + valorDoImposto);
    }
}

import java.io.PrintStream;
import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;

        System.out.printf("Digite sua senha: ");
        int senhaDigitada = sc.nextInt();

        while (senhaDigitada != 2002) {
            System.out.printf("Senha inválida!\n");
            System.out.printf("Digite sua senha: ");
            senhaDigitada = sc.nextInt();
        }

        System.out.printf("Acesso permitido!");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite X e Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.printf("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.printf("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.printf("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.printf("Quarto");
            }
            System.out.printf("\nDigite X e Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.print(
                "Digite para adicionar\n" +
                "1.Álcool\n" +
                "2.Gasolina\n" +
                "3.Diesel\n" +
                "4.Fim\n"
        );

        int menuSelecionado = sc.nextInt();

        while (menuSelecionado != 4) {
            switch (menuSelecionado) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            System.out.print(
                    "Digite para adicionar\n" +
                    "1.Álcool\n" +
                    "2.Gasolina\n" +
                    "3.Diesel\n" +
                    "4.Fim\n"
            );
            menuSelecionado = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int x = sc.nextInt();

        for(int i = 1; i <= x; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.printf("Digite o valor do loop: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.printf("Digite um numero: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;
        int totalDePesos = peso1 + peso2 + peso3;

        System.out.printf("Digite a quantidade de testes: ");
        int qtdTestes = sc.nextInt();

        double valor1;
        double valor2;
        double valor3;
        double mediaPonderada;

        for(int i = 1; i <= qtdTestes; i++) {
            System.out.print("Digite 3 médias: ");
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();

            valor1 = (valor1 * peso1);
            valor2 = (valor2 * peso2);
            valor3 = (valor3 * peso3);

            mediaPonderada = (valor1 + valor2 + valor3) / totalDePesos;

            System.out.println(mediaPonderada);
        }


    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++) {
            System.out.printf("Informe um par de numero: ");
            double n1 = sc.nextInt();
            double n2 = sc.nextInt();

            if (n2 != 0) {
                double divisao = n1 / n2;
                System.out.println(divisao);
            } else {
                System.out.println("Divisão impossivel");
            }
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero para calcular seu fatorial: ");
        int numero = sc.nextInt();

        int fatorial = 1;

        for(int i = 1; i <= numero; i++) {
            System.out.printf("Multiplicando %d por %d\n", fatorial, i);
            fatorial *= i ;
        }

        System.out.printf("Fatorial: " + fatorial);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int numero = sc.nextInt();

        for(int i = 1; i <= numero; i++) {
            System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
        }
    }
}



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Lucas\\3. Cursos\\Java (Udemy) - Em Andamento\\Finally\\src\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        System.out.println(new File(".").getAbsolutePath());
    }
}
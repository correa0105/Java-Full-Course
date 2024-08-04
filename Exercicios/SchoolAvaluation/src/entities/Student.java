package entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double calcStudentAverage () {
        return n1 + n2 + n3;
    }

    public void checksApproval(double studentAverage) {
        if (studentAverage > 60) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
            System.out.printf("FALTOU %.2f PARA APROVAR", 60 - studentAverage);
        }
    }
}

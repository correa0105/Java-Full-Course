package entities;

public class SavingsAccountPlus extends SavingsAccount{
    //O COMPILADOR NÃO DEIXA HERDAR SAVINGSACCOUNT POIS FOI DEFINIDA COMO FINAL

    @Override
    public void withdraw(double amount) {
        balance -= amount + 3;
    }
    //O COMPILADOR NÃO DEIXA EU SOBRESCREVER WITHDRAW POIS FOI DEFINIDA COMO FINAL
}

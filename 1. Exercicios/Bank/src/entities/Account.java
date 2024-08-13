package entities;

public class Account {
    private final int accountNumber;
    private String cardholderName;
    private double accountBalance;

    public Account(int accountNumber, String cardholderName) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
    }

    public Account(int accountNumber, String cardholderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        this.accountBalance -= withdrawAmount;
    }

    public String toString() {
        return "Conta " + getAccountNumber() + ", Titular: " + getCardholderName() + ", Saldo: " + String.format("%.2f", getAccountBalance());
    }
}

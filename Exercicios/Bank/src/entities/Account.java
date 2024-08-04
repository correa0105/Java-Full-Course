package entities;

public class Account {
    private final int accountNumber;
    private String cardholderName;
    private double accountBalance;

    public Account(int accountNumber, String cardholderName) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
    }

    public Account(int accountNumber, String cardholderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public void deposit(double depositoAmount) {
        this.accountBalance += depositoAmount;
    }

    public void withdraw(double withdrawAmount) {
        this.accountBalance -= withdrawAmount;
    }
}

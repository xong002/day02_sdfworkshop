package sg.edu.nus.iss;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {

    String name;
    String accountNumber;
    float accountBalance;
    ArrayList<String> transactions = new ArrayList<String>();
    boolean accountClosed = false;
    LocalDate createdDate;
    LocalDate closingDate;

    public BankAccount(String name) {
        this.name = name;
        setAccountBalance(0.00f);
        setCreatedDate(LocalDate.now());
        System.out.println(
                "Account name: " + name + "\n" +
                "Account balance: " + accountBalance + "\n" +
                "Date created: " + createdDate);
    }

    // format sysout
    public void deposit(float depositValue) {
        if (depositValue <= 0 || accountClosed) {
            throw new IllegalArgumentException();
        } else {
            setAccountBalance(accountBalance += depositValue);
            transactions.add("deposit $" + depositValue + " at " + LocalDateTime.now());
            System.out.println(
                "Account name: " + name + "\n" +
                "Account balance: " + accountBalance + "\n" +
                "Transactions: " + transactions);
        }
    }

    public void withdraw(float withdrawValue) {
        if (withdrawValue <= 0 || accountClosed || withdrawValue > accountBalance) {
            throw new IllegalArgumentException();
        } else {
            setAccountBalance(accountBalance -= withdrawValue);
            transactions.add("withdraw $" + withdrawValue + " at " + LocalDateTime.now());
            System.out.println(
                "Account name: " + name + "\n" +
                "Account balance: " + accountBalance + "\n" +
                "Transactions: " + transactions);
        }
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isAccountClosed() {
        return accountClosed;
    }

    public void setAccountClosed(boolean accountClosed) {
        this.accountClosed = accountClosed;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

}

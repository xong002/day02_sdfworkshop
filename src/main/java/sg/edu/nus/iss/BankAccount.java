package sg.edu.nus.iss;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.UUID;

public class BankAccount {

    String name = "";
    String accountNumber = "";
    float accountBalance;
    ArrayList<String> transactions = new ArrayList<String>();
    boolean accountClosed = false;
    LocalDate createdDate;
    LocalDate closingDate;

    public String dateFormat(LocalDate date) {
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public BankAccount(String name) {
        this.name = name;
        setAccountBalance(0.00f);
        setAccountNumber(UUID.randomUUID().toString());
        setCreatedDate(LocalDate.now());
        System.out.println(
                "Account name: " + name + "\n" +
                        "Account number: " + accountNumber + "\n" +
                        "Starting account balance: " + accountBalance + "\n" +
                        "Date created: " + dateFormat(createdDate));
    }

    public BankAccount(String name, float startBalance) {
        this.name = name;
        setAccountBalance(startBalance);
        setCreatedDate(LocalDate.now());
        setAccountNumber(UUID.randomUUID().toString());
        System.out.println(
                "Account name: " + name + "\n" +
                        "Account number: " + accountNumber + "\n" +
                        "Starting account balance: " + accountBalance + "\n" +
                        "Date created: " + dateFormat(createdDate));
    }

    public void deposit(float depositValue) {
        if (depositValue <= 0 || accountClosed) {
            throw new IllegalArgumentException();
        } else {
            setAccountBalance(accountBalance += depositValue);
            transactions.add("deposit $" + depositValue + " at " + dateFormat(LocalDate.now()));
            System.out.println(
                    "Account name: " + name + "\n" +
                            "Account balance: " + accountBalance + "\n" +
                            "Transactions List:");
            for (String i : transactions) {
                System.out.println("- " + i);
            }
        }
    }

    public void withdraw(float withdrawValue) {
        if (withdrawValue <= 0 || accountClosed || withdrawValue > accountBalance) {
            throw new IllegalArgumentException();
        } else {
            setAccountBalance(accountBalance -= withdrawValue);
            transactions.add("withdraw $" + withdrawValue + " at " + dateFormat(LocalDate.now()));
            System.out.println(
                    "Account name: " + name + "\n" +
                            "Account balance: " + accountBalance + "\n" +
                            "Transactions List:");
            for (String i : transactions) {
                System.out.println("- " + i);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (this.name == "") {
            this.name = name;
        } else
            throw new UnsupportedOperationException();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (this.accountNumber == "") {
            this.accountNumber = accountNumber;
        } else
            throw new UnsupportedOperationException();
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

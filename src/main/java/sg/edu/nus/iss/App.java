package sg.edu.nus.iss;

public class App {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("John");

        bankAccount1.deposit(100);

        BankAccount bankAccount2 = new BankAccount("Ben", 100);

        bankAccount2.deposit(200);
        bankAccount2.withdraw(50);

        FixedDepositAccount fd1 = new FixedDepositAccount("Dom", 100);

        // fd1.deposit(50);
        fd1.getAccountBalance();

        FixedDepositAccount fd2 = new FixedDepositAccount("Dom2", 100, 5);

        fd2.getAccountBalance();

        FixedDepositAccount fd3 = new FixedDepositAccount("Dom2", 100, 5, 12);

        fd3.getAccountBalance();

    }
}

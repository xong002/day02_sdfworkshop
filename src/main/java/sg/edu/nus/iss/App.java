package sg.edu.nus.iss;

public class App {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("John");

        bankAccount1.deposit(100);

        BankAccount bankAccount2 = new BankAccount("Ben", 100);

        bankAccount2.deposit(200);
        bankAccount2.withdraw(50);

    }
}

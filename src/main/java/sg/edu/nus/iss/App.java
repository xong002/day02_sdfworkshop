package sg.edu.nus.iss;

import java.io.Console;

public class App 
{
    public static void main( String[] args )
    {
        Console con = System.console();
        String input = con.readLine("Enter name\n");

        BankAccount bankAccount = new BankAccount(input);

        bankAccount.deposit(100);
        bankAccount.deposit(200);
        bankAccount.withdraw(50);
        bankAccount.withdraw(100);

    }
}

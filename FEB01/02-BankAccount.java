/**
 * Class illustrating Bank Account Management System
 */
import java.util.*;

class Account{
    private static int counter = 0;
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account()
    {
        this.id = ++counter;
        this.balance = 500d;
        this.annualInterestRate = 4d;
    }
    public Account(int id, double balance)
    {
        counter++;
        this.id = id;
        this.balance = balance;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public double getMonthlyInterest()
    {
        return this.balance*(1/12d)*this.annualInterestRate/100d;
    }
    public boolean withdraw(double amount)
    {
        if(this.balance > amount)
        {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    public boolean deposit(double amount)
    {
        if(amount > 0)
        {
            this.balance += amount;
            return true;
        }
        return false;
    }
    public static void drawLine()
    {
        for(int i=0;i<30;i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        char choice;
        Account myAccount = new Account();
        boolean running = true;
        while(running)
        {
            System.out.println("1. Create default account\n2. Create custom account\n3. Withdraw\n4. Deposit\n5. GetBalance\n"+
            "6. GetMonthlyInterest \n7. Exit");
            // scanner.next();
            choice = scanner.next().charAt(0); // @TODO: Clear buffer
            double amount = -1d;
            switch(choice)
            {
                case '1':
                myAccount = new Account();
                break;
                case '2':
                System.out.print("Enter custom account ID and custom balance (Separated by a space) ");
                myAccount = new Account(scanner.nextInt(), scanner.nextDouble());
                case '3':
                System.out.println("Enter the amount that is to be withdrawn ");
                amount = scanner.nextDouble();
                myAccount.withdraw(amount);
                drawLine();
                break;
                case '4':
                System.out.println("Enter the amount that is to be deposit ");
                amount = scanner.nextDouble();
                myAccount.deposit(amount);
                drawLine();
                break;
                case '5':
                System.out.println("Your balance is "+myAccount.getBalance());
                drawLine();
                break;
                case '6':
                System.out.println("Your monthly interest is " + myAccount.getMonthlyInterest());
                drawLine();
                break;
                case '7':
                running = false;
                default:
                System.out.println("Please select the right option");
                drawLine();
                break;
            }
        }
    }
}
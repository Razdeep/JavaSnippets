/**
 * Simple calculator
 */
import java.util.Scanner;
class Solution{
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number ");
        double b = scanner.nextDouble();
        System.out.print("Enter the operator (+,-,*,/) ");
        char ch = scanner.next().charAt(0);
        double result = -1;
        boolean error = false;
        switch(ch){
            case '+':
            result = a+b;
            break;
            case '-':
            result = a-b;
            break;
            case '/':
            if(b != 0)
            result = a/b;
            else
            {
                error = true;
                System.out.print("Divide by zero exception to be thrown\n");
            }
            break;
            case '*':
            result = a*b;
            break;
            default:
            error = true;
            System.out.print("Operator error\n");
        }
        if(!error)
        System.out.println("The result is "+result);
    }
}
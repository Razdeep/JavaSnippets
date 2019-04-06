/**
 * WAP in which prompt the user  to enter a number x which is
 * not divisible by number y entered by user. If x is divisible by y
 * then create an exception and throw it. Also ask the user to
 * re-enter the number and repeat the process
 * 
 */

import java.util.Scanner;

class Solution{
    static class MyException extends Throwable{
        String myText = "This is my exception";
        MyException()
        {
            // System.out.println(myText);
        }
        public String toString()
        {
            return myText;
        }
    }
    public static void myMod(int x, int y) throws MyException
    {
        try{
            if( x % y == 0 )
                throw new MyException();
            System.out.println("Successful myMod = " + x % y);
        }
        catch(Throwable e)
        {
            System.out.println("Caught at myMod");
            throw e;
        }
    }
    public static void main(String[] args)
    {
        while(true)
        {
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter x ");
                int x = scanner.nextInt();
                System.out.println("Enter y ");
                int y = scanner.nextInt();
                myMod(x, y);
                break;
            }
            catch(MyException e)
            {
                System.out.println(e);
            }
            catch(Throwable e)
            {
                System.out.println(e);
            }
        }
    }
}
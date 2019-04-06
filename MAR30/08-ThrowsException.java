/**
 * This is unchecked excepton
 * 
 */
import java.io.*;
class Solution{
    static void method() throws ArithmeticException
    {
        System.out.println("Method");
        throw new ArithmeticException();
    }
    public static void main(String[] args)
    {
        method();  
    }
}
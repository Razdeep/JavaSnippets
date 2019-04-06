/**
 * Throws keyword is used to declare exceptions
 * Throw keyword is used to generate exception
 * 
 * This must not compile because we didnt put `method()` in the try catch block,
 * when you remove throws IOException from the main method
 * 
 * This is Checked exception
 */
import java.io.*;
class Solution{
    static void method() throws IOException
    {
        System.out.println("Method");
        throw new IOException();
    }
    public static void main(String[] args) throws IOException
    {
        method();
    }
}
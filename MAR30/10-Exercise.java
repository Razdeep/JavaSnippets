/**
 * Can we use throws in catch signature
 * Can we define more than 1 finally block for single try block
 * Can we define try block within catch
 * Can we define try block without catch
 * Can we handle the exception by using Throwable
 * Can we handle the runtime errors
 * Can we define try within finally
 * Can we create the object with RuntimeException class
 * Can we throw the object of Throwable class using throw keyword
 * Can we throw objects of error using throw keyword
 * Write a code to generate two exception at the same time
 * 
 */
import java.io.*;

class Solution
{
    static void method() throws ArithmeticException
    {
        try{
            throw new IOException();
        }
        catch(IOException exception)
        {
            System.out.println(exception);
            throw new ArithmeticException();
        }
        finally{
            System.out.println("Finally1");
        }
        
    }
    public static void main(String[] args)
    {
        try{
            method();
        }
        catch(ArithmeticException exception)
        {
            System.out.println(exception);
        }
        finally{
            System.out.println("Finally2");
        }
    }
}
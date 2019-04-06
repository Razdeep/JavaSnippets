/**
 * Nested try inside catch block
 * 
 */
import java.io.*;

class Solution
{
    public static void main(String args[])
    {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Caught : " + exception);
            try{
                throw new IOException();
            }
            catch(IOException ex){
                System.out.println("Caught : " + ex);
            }
        }
    }
}
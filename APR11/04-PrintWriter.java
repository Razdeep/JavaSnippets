/**
 * PrintWriter
 * 
 */
import java.io.*;
class Solution{
    public static void main(String args[])
    {
        try{
            PrintWriter print_writer = new PrintWriter("sample");
            print_writer.print("Hello");
            print_writer.print(1998);
            print_writer.flush(); // Important
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
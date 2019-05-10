/**
 * Write a program to create a file named Exercise1.txt if it doesnot exist.
 * Append new data to it ifit already exists. Write 100 integers created into
 * the file using text I/0. Integers should be separated by space.
 * 
 */
// @TODO
import java.io.*;
class Solution{
    public static void main(String[] args)
    {
        PrintWriter print_writer = null;
        try{
            print_writer = new PrintWriter("abc.txt");
            for (int i = 1; i <= 100; i++)
                print_writer.print(i + " ");
            print_writer.flush();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            if(print_writer != null)
                print_writer.close();
        }
    }
}
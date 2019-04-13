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
        try{
            FileOutputStream file_output_stream = new FileOutputStream("Exercise1.txt");
            DataOutputStream data_output_stream = new DataOutputStream();
            for (int i = 1; i <= 100; i++)
                file_output_stream.write(i);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
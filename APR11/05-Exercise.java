/**
 * Using DataOutputStream write 100 numbers to a file
 * 
 */
import java.io.*;
class Solution{
    public static void main(String[] args)
    {
        try{
            FileOutputStream file_output_stream = new FileOutputStream("Exercise1.txt");
            DataOutputStream data_output_stream = new DataOutputStream(file_output_stream);
            for (int i = 1; i <= 100; i++)
                data_output_stream.writeInt(i);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
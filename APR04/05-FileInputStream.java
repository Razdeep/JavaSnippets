/**
 * File input stream
 * 
 */
import java.io.*;
class Solution{
    public static void main(String[] args) throws Exception
    {
        FileInputStream file_input_stream = new FileInputStream(new File("in.txt"));
        FileOutputStream file_output_stream = new FileOutputStream(new File("out.txt"));
        int a = file_input_stream.read();
        while(a != -1)
        {
            file_output_stream.write(a);
            a = file_input_stream.read();
        }
        file_input_stream.close();
        file_output_stream.close();
    }
}
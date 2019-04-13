/**
 * A new syntax for try is available from JDK 1.7
 * This is called `Try With Resource Allocation`
 * 
 */
import java.io.*;

class Solution{
    public static void main(String[] args) throws Exception
    {
        try(
            FileInputStream  fin  = new FileInputStream("in.txt");
            FileOutputStream fout = new FileOutputStream("out.txt");
        ){
            int a;
            while ((a = fin.read()) != -1)
            {
                fout.write(a);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
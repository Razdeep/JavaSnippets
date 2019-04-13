/**
 * Input/Output classes
 * 
 * Constructors
 * 
 * FileOutputStream(String filename)
 * FileOutputStream(File file)
 * FileOutputStream(String filename, boolean flag)
 * FileOutputStream(File file, boolean flag)
 * 
 */
import java.io.*;

class Solution{
    // Since fin.close() and fout.close() can also generate exception
    // outside the try block, it is compulsory to declare throws Exception
    public static void main(String[] args) throws Exception
    {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            fin  = new FileInputStream("in.txt");
            fout = new FileOutputStream("out.txt");
            int a;
            while ((a = fin.read()) != -1)
            {
                // System.out.println(a);
                fout.write(a);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            if (fin != null)
                fin.close();
            if (fout != null)
                fout.close();
        }
    }
}
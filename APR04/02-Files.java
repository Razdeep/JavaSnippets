/**
 * -----------
 *    Files
 * -----------
 * 
 *   More File methods
 * 
 * String getName()
 * String getPath()
 * String getAbsolutePath()
 * long length()
 * boolean delete()
 * boolean renameTo(File name)
 * boolean isAbsolute()
 * boolean isHidden()
 * File[] listFiles()
 * boolean createNewFile()
 * lastModified()
 * 
 * Note: listFiles() only works with directories
 * 
 * Warning : Handle the delete function at your own risk.
 *           To try out the method change the value of `experimental`
 *           variable to false
 * 
 */
import java.util.Scanner;
import java.io.*;

class Solution{
    public static void main(String args[])
    {
        boolean experimental = true; // For safety check
        Scanner scanner = new Scanner(System.in);
        try{
            File file = new File("//home//rajdeep//Desktop//DEV//JavaSnippets//APR04",
                                 "Helloworld.txt");
            System.out.println("File Name = " + file.getName());
            System.out.println("File path = " + file.getPath());
            System.out.println("File absolute path = " + file.getAbsolutePath());
            System.out.println("Length = " + file.length());

            File file2 = new File("Untitled.txt");
            if(file2.createNewFile())
                System.out.println("Untitled.txt created");
            if(file2.renameTo(new File("NewUntitled.txt")))
                System.out.println("Untitled.txt renamed to NewUntitled.txt");
            if(file2.delete() && !experimental)
                System.out.println("Untitled.txt deleted");
            
            File file3 = new File(".");
            System.out.println("Listing the list of files");
            for(File file_iterator : file3.listFiles())
                System.out.println(file_iterator);
            // System.out.println(new java.util.Date());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
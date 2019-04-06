/**
 * WAP to show list of all the text file's name from a directory
 * 
 */
import java.io.*;
class Solution{
    public static void main(String args[])
    {
        try{
            File file = new File(".");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
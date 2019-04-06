/**
 * -----------
 *    Files
 * ----------- 
 * File paths can be either absolute or relative.
 * Absolute paths are the files having path from the root directory
 * (Drives in case of Windows and root directory inc ase of unix based
 * Operating system such as MacOs, Linux)
 * Relative paths point to the same directory from where the java program
 * is executed.
 * 
 *   Constructors
 * File(String path_name)
 * File(String parent, String child)
 * File(File parent, String Child)
 *  Note : The parent arg in the above constructor must be a directory
 * 
 *   File methods
 * boolean isFile()
 * boolean isDirectory()
 * boolean exists()
 * boolean canRead()
 * boolean canWrite()
 * More methods are listed in the 02-Files.java
 * 
 * Note: For using absolute paths use \\ instead of \
 * 
 */
import java.io.*;

class Solution{
    public static void main(String args[]) throws Exception
    {
        try{
            File file = new File("Helloworld.txt");
            System.out.println("Helloword.txt is"
                        + (file.isFile() ? "" : " not") + " a file");
            System.out.println("Is directory = " + file.isDirectory());
            System.out.println("Existance = " + file.exists());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
/**
 * System is an inbuilt class
 * out is an object of PrintStream class defined inside the System class
 * print and println are the method names
 * 
 * Internal Structure of the System Library is something like this...
 * 
 * class System{
 *  public class PrintStream{
 *      ...
 *  }
 *  public static PrintStream out;
 * }
 * 
 * Println provides a new line character at the end of the string argument
 * 
 */
class Solution{
    public static void main(String argv[])
    {
        System.out.println("Hello Java");
    }
}
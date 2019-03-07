/**
 * Expected output: Compile time error
 * 
 * Explanation:
 * The middle of a for loop is of a boolean type.
 * Integers won't be converted into boolean so
 * it will through an error
 */
class Solution{
    public static void main(String args[])
    {
        for(int i = 0; 0 ; i++)
        {
            System.out.println("hello");
            break;   
        }
    }
}
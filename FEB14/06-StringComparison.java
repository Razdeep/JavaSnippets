/**
 * ------------------------
 * String Comparsion
 * ------------------------
 * public boolean startsWith(String str)
 * public boolean endsWith(String str)
 * 
 * The startsWith() method determines whether a given String begins
 * with a specified string.
 * 
 * Conversely, endsWith( ) determines whether the String in question
 * ends with a specified string.
 * 
 * Note: These are case sensitive
 */
class Solution{
    public static void main(String args[])
    {
        String text = "The quick brown fox jumped over the lazy dog";
        System.out.println(text.startsWith("The"));     // true
        System.out.println(text.startsWith("the"));     // false
        System.out.println(text.startsWith("quick"));   // false
        System.out.println(text.startsWith("dog"));     // false
        System.out.println(text.endsWith("dog"));       // true
    }
}
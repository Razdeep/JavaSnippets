/**
 * -----------------------
 * String Comparison
 * -----------------------
 * 
 * A string is less than another if it comes before the other in dictionary order. 
 * A string is greater than another if it comes after the other in dictionary order.
 * 
 * int compareTo(String str)
 * 
 * returns greater than 0, if Invoking string is greater than the parameter passed
 * returns 0, if Invoking string is equal to the parameter passed
 * returns less than 0, if Invoking string is lesser than the parameter passed
 * 
 */
class Solution{
    public static void main(String args[])
    {
        System.out.println("abc".compareTo("ABC"));     // 32
        System.out.println("abc".compareTo("xyz"));     // -23
        System.out.println("abc".compareTo("abcdef"));  // -3
        System.out.println("abc".compareTo("ab"));      // 1
        System.out.println("abc".compareTo("abc"));     // 0
    }
}
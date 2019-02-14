/**
 * -------------------------
 * Methods of StringClass
 * -------------------------
 * public int length();
 * public charAt(int index)
 * public void getChars(int sourceStart, int sourceEnd, char target[], int targetStart)
 * public char[] toCharArray()
 * public String concat(String text)
 * 
 */

/**
 * Output: s1 == s2
 * 
 * Explanation:
 * Both the "Hello" are string literals. They might have different references,
 * but the thing to note here is that, both of them(s1 and s2) share the same memory
 * allocated by the JVM.
 * The == operator compares the location of the string literals.
 * In this case, since both of the share same memory, therefore s1==s2 returns true.
 * In the second case, s3 is having it's own memory though it has the same content.
 * Whenever the s1 == s3 is done, the memory locations donot match and that is why,
 * their resultant becomes false. Hence only the top condition executes
 * 
 * Resolution:
 * In order to prevent such kind of scenario, we can use the equals method,
 * declared in the Object class and overriden in the String class.
 */
class Solution{
    public static void main(String args[])
    {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        if(s1 == s2)
            System.out.println("s1 == s2");
        if(s1 == s3)
            System.out.println("s1 == s3");
    }
}
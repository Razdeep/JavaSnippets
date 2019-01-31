/**
 * Misc Print Arguments
 * Note: Expressions are always evaluated from left to right
 * Output: Code would run
 */
class Solution{
    
    void meth1()
    {
        System.out.println("Byte");
        System.out.println(5+8+"byte");
        System.out.println("byte"+5+8);
    }
    
    public static void main(String args[])
    {
        new Solution().meth1();
    }
}
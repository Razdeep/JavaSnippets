/**
 * Method overloading 2
 * Expected Output: float
 * Explanation: Implicit conversion from integer to float
 */
class Solution{
    
    void meth1(byte a, byte b)
    {
        System.out.println("Byte");
    }
    void meth1(float a, float b)
    {
        System.out.println("Float");
    }
    public static void main(String args[])
    {
        new Solution().meth1(10, 10);
    }
}
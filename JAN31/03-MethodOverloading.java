/**
 * Method overloading 3
 * Expected Output: float
 * Explanation: Implicit conversion from integer to float
 */
class Solution{
    
    void meth1(double a, double b)
    {
        System.out.println("Double");
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
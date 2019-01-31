/**
 * Method overloading 4
 * Expected Output: Ambiguous Invocation
 * Explanation: Implicit conversion messes up everything
 */
class Solution{
    
    void meth1(int a, double b)
    {
        System.out.println("First method");
    }
    void meth1(double a, int b)
    {
        System.out.println("Second method");
    }
    public static void main(String args[])
    {
        new Solution().meth1(10, 10);
    }
}
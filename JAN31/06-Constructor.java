/**
 * Note: Constructor cannot be final or static
 */
class Solution{
    static double x = 99;
    // double y = 99; // Doesn't work
    double y;
    public Solution()
    {
        y = 100;
    }
    public static void main(String args[])
    {
        System.out.println(x);
        Solution solution = new Solution();
        System.out.println(solution.y);
    }
}
/**
 * Static methods can only use static variables directly
 * 
 */
class Solution{
    int a;
    int b=1998;
    Solution()
    {
        System.out.println("In constructor");
    }
    public static void main(String[] argv)
    {
        Solution solution = new Solution();
        // System.out.println("a="+a); // THIS WONT WORK
        System.out.println("a="+solution.a);
    }
}
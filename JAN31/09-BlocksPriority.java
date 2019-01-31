/**
 * Static Blocks execute first
 * Initializer blocks get copied to the constructor
 * 
 */
class Solution{
    public Solution()
    {
        System.out.println("A");
    }
    void Solution()
    {
        System.out.println("B");
    }
    static{
        System.out.println("C");
    }
    {
        System.out.println("D");
    }
    {
        System.out.println("E");
    }
    public static void main(String args[])
    {
        Solution solution = new Solution();
    }
}
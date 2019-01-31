/**
 * Method overloading 1
 * Expected output: Integer
 */
class Solution{
    void meth1(int a, int b)
    {
        System.out.println("Integer");
    }
    void meth1(byte a, byte b)
    {
        System.out.println("Byte");
    }
    public static void main(String args[])
    {
        new Solution().meth1(10, 10);
    }
}
/**
 * Using static initializer block
 */
class Solution{
    // Executes before the main method
    static{
        System.out.println("Hello Block");
    }
    public static void main(String args[])
    {
        System.out.print("Hello main");
    }
}
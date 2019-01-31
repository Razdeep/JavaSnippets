/**
 * Using initializer block
 * Note: Initializer blocks only get called when object is created.
 * If executes, it gets called before the main method
 */
class Solution{
    // Initializer block
    {
        System.out.println("Hello Block");
    }
    public static void main(String args[])
    {
        // Solution solution = new Solution();
        System.out.print("Hello main");
    }
}
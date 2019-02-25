/**
 * StringBuilder
 * length() vs capacity()
 * 
 * length() returns number of characters in the StringBuilder object
 * capacity() returns the total memory occupied by the StringBuilder Object
 * 
 * Return type of both the methods is int
 * 
 * Expected Output:
 * length = 11
 * capacity = 27
 * 
 * Explanation:
 * If we dont pass any argument, the capacity of StringBuilder would be 16.
 * When we pass string type arguments in StringBuilder, resultant capacity
 * becomes Initial Capacity + Length of Argument passed
 * 
 * In this case "New Zealand" has 11 length and capacity is = 11 + 16 = 27
 * 
 */
class Solution{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("New Zealand");
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
    }
}
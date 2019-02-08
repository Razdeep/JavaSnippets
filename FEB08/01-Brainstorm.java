/**
 * Brainstorm #1
 * -------------------
 * Output : 0
 * Explanation : We can declare an array with zero elements too
 */
class Solution{
    public static void main(String args[])
    {
        int[] a = new int[0];
        System.out.println(a.length);
        // System.out.println(a[0]); // This would throw an exception though
    }
}
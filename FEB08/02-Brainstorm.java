/**
 * Brainstorm #2
 * -----------------------
 * Output : 225
 * -----------------------
 * Note : Do not consider [] like a 100% pointer, here function is called by values
 * 
 */
class Solution{
    static void test(int[] a)
    {
        int[] b = new int[2];
        a = b;
        System.out.print(b.length);
        System.out.print(a.length);
    }
    public static void main(String args[])
    {
        int[] a = new int[5];
        test(a);
        System.out.print(a.length);
    }
}
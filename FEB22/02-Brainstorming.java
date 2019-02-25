/**
 * Expected Output:
 * 16
 * 65
 * 17
 * 65
 * 
 * Explanation:
 * By default, StringBuilder objects has 16 character capacity
 * 
 */
class Solution{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        sb = new StringBuilder(65);
        System.out.println(sb.capacity());

        sb = new StringBuilder("A");
        System.out.println(sb.capacity());

        sb = new StringBuilder('A');
        System.out.println(sb.capacity());
    }
}

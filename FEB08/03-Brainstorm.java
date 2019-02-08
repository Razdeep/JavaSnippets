/**
 * Brainstorm #3
 * ----------------------
 * Output : 1 2 <ArrayIndexOutOfBoundsException>
 * 
 * Explanation : At one point of time, the value of count would be equal to 2,
 *              At that time if the loop condition is check, the program would
 *              try to access the element at entries[2] which doesnt exist.
 *              In order to prevent a crash, an exception is thrown
 */
class Solution{
    public static void main(String args[])
    {
        String entries[] = {"entry1", "entry2"};
        int count = 0;
        while(entries[count++] != null)
            System.out.println(count);
        System.out.println(count);
    }
}
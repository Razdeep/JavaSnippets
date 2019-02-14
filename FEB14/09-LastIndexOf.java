/**
 * Signatures of lastIndexOf
 * lastIndexOf(char ch)
 * lastIndexOf(char ch, int offset)
 * lastIndexOf(String str)
 * lastIndexOf(String str, int offset)
 * 
 * Note: Here the direction is towards left of the offset @CHECK
 * 
 * returns the first occurence of the passed parameter
 * if not found returns -1
 */
class Solution{
    public static void main(String args[]) {
        String text = new String("Rajdeep Roy Chowdhury");

        System.out.println("Index of R in text: " + text.lastIndexOf('R'));
        System.out.println("Index of r in text: " + text.lastIndexOf('r'));
        System.out.println("Index of R in text before 5th char: " + text.lastIndexOf('R', 5));
        System.out.println("Index of R in text after 15th char: " + text.lastIndexOf('R', 15));
        System.out.println("Index of hardcoded string Roy after 4th char: " + text.lastIndexOf("Roy", 16));
    }
}
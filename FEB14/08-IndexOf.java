/**
 * Signatures of indexOf
 * indexOf(char ch)
 * indexOf(char ch, int offset)
 * indexOf(String str)
 * indexOf(String str, int offset)
 * 
 * returns the first occurence of the passed parameter
 * if not found returns -1
 */
class Solution{
    public static void main(String args[]) {
        String text = new String("Rajdeep Roy Chowdhury");

        System.out.println("Index of R in text: " + text.indexOf('R'));
        System.out.println("Index of r in text: " + text.indexOf('r'));
        System.out.println("Index of R in text after 5th char: " + text.indexOf('R', 5));
        System.out.println("Index of R in text after 15th char: " + text.indexOf('R', 15));
        System.out.println("Index of hardcoded string Roy after 4th char: " + text.indexOf("Roy", 4));
    }
}
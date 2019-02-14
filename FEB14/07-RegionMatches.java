/**
 * 
 * Syntax:
 * regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
 * regionMatches(int toffset, String other, int ooffset, int len)
 * 
 */
class Solution {
    public static void main(String[] args)
    {
        String str1 = "Red Green Orange Yellow";
        String str2 = "Yellow Orange Green Red";

        boolean match1 = str1.regionMatches(0, str2, 28, 8);
        boolean match2 = str1.regionMatches(9, str2, 9, 8);
        boolean match3 = str1.regionMatches(0, str2, 20, 3);
        System.out.println();

        System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);
        System.out.println("str1[0 - 3] == str2[20 - 22]? " + match3);
        System.out.println();
    }
}
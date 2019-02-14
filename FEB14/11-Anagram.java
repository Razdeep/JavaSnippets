/**
 * WAP to check two strings are anagram or not
 * Anagrams: If two strings have same character set
 * 
 * Intuition:
 * #1: We can maintain a character frequency table and check each values
 * #2: We can sort the string and check if they are equal
 * 
 * This program illustrates Intuition #2 (By sorting).
 */
import java.util.Arrays;
import java.util.Scanner;
class Solution{
    static boolean areAnagrams(String a, String b)
    {
        char[] text1 = a.toUpperCase().toCharArray();
        char[] text2 = b.toUpperCase().toCharArray();
        Arrays.sort(text1);
        Arrays.sort(text2);
        for(int i=0;i<text1.length;i++)
        {
            if(text1[i] != text2[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string ");
        String text1 = scanner.nextLine();
        System.out.println("Enter the second string ");
        String text2 = scanner.nextLine();
        // Note this length() is method not a field like arrays
        if(text1.length() == text2.length() && areAnagrams(text1, text2))
        {
            System.out.println(text1 + " and " + text2 + " are Anagrams ");
        }
        else{
            System.out.println(text1 + " and " + text2 + " are not Anagrams ");
        }
    }
}
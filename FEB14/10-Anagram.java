/**
 * WAP to check two strings are anagram or not
 * Anagrams: If two strings have same character set
 * 
 * Intuition:
 * #1: We can maintain a character frequency table and check each values
 * #2: We can sort the string and check if they are equal
 * 
 * This program illustrates Intuition #1.
 * Check the next program for Intuition #2.
 */
import java.util.Scanner;
class Solution{
    static boolean areAnagrams(String text1, String text2)
    {
        text1 = text1.toUpperCase();
        text2 = text2.toUpperCase();
        int[] char_frequency_1 = new int[26];
        int[] char_frequency_2 = new int[26];
        for(int i = 0; i<text1.length(); i++)
        {
            char_frequency_1[text1.charAt(i)-'A']++;
            char_frequency_2[text2.charAt(i)-'A']++;
        }

        for(int i=0;i<char_frequency_1.length;i++) // here the length is a field
        {
            if(char_frequency_1[i]!=char_frequency_2[i])
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
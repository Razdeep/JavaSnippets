/**
 * WAP to sort an array of strings
 * Hint: Use compareTo method
 */

import java.util.Scanner;

class Solution{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int string_array_length = scanner.nextInt();
        scanner.nextLine();
        String[] string_array = new String[string_array_length];
        for(int i = 0; i < string_array_length; i++)
        {
            System.out.println("Enter string[" + i + "] ");
            String temp = scanner.nextLine();
            string_array[i] = temp;
        }
        // Using BubbleSort
        for(int i=0;i<string_array_length-1;i++)
        {
            for(int j=0;j<string_array_length-i-1;j++)
            {
                if(string_array[j].compareTo(string_array[j+1]) > 0)
                {
                    String temp = string_array[j];
                    string_array[j] = string_array[j+1];
                    string_array[j+1] = temp;
                }
            }
        }
        for(String this_string : string_array)
            System.out.println(this_string);
    }
}
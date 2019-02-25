/**
 * Baby name comparison
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

class Solution
{
    private static ArrayList<int> range(int n)
    {
        ArrayList<int> result = new ArrayList<int>(n);
        for(int i = 0; i < n; i++)
            result[i] = i;
        return result;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string ");

        StringBuilder[] bobTheBuilder = new StringBuilder[3];
        for(int i: range(3))
        {
            bobTheBuilder[i] = new StringBuilder(scanner.nextLine());
        }

    }
}
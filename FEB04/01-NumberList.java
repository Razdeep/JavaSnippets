/**
 * 
 * WAP to create an array and follow the steps below
 * 1. Populate the array by the user
 * 2. Display all values
 * 3. Display all in reverse
 * 4. Display sum of all integers
 * 5. Display all values less than 5
 * 6. Display teh lowest value
 * 7. Highest value
 * 8. Display all values higher than the average value
 * 
 */
import java.util.Scanner;

class Solution{
    private static void drawLine()
    {
        for(int i=0; i<20; i++)
            System.out.print("-");
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Populating the array...\n");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter array["+i+"] ");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        drawLine();

        System.out.println("Displaying the array in exact order...\n");
        for(int i: array)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        drawLine();

        System.out.println("Displaying the array in reverse order...\n");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        drawLine();

        System.out.println("Calculating the sum of all integers...\n");
        int sum=0;
        for(int i: array)
        {
            sum += i;
        }
        System.out.println("The sum of all integers is "+sum);
        System.out.println();
        drawLine();

        // Highest & lowest
        int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        for(int i: array)
        {
            highest = (i>highest) ? i : highest;
            lowest = (i<lowest) ? i : lowest;
        }
        System.out.println("Highest is "+highest);
        System.out.println();
        drawLine();
        System.out.println("Lowest is "+lowest);
        System.out.println();
        drawLine();

        double average = sum/array.length;
        System.out.println("Average is "+average);
        System.out.println();
        drawLine();

        System.out.println("Showing values greater than average...\n");
        for(int i: array)
        {
            if(i>average)
            System.out.println(i+" ");
        }
        System.out.println();
        drawLine();
    }
}
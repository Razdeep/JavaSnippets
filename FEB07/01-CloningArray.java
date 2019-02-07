/**
 * Reference copying vs Cloning array
 * [ Using clone() method of an array ]
 */
import java.util.Scanner;
class Solution{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers ... ");
        int[] a = new int[5];
        for(int i=0; i<5; i++)
        {
            System.out.print("a["+i+"] ");
            a[i] = scanner.nextInt();
        }
        int[] b = a;
        int previous_value = a[2]; // For keeping the original array intact
        a[2] = 99; // Tweaking the value

        System.out.println("\nDisplaying the result of reference copying of array...\n");
        for(int i=0; i<5; i++)
        {
            System.out.println("a[" + i + "] = "+ a[i] + "\tb[" + i + "] = "+ b[i] + " ");
        }
        System.out.println();
        /** Note : Changes are being reflected in the another array
         * because two reference variables are pointing to same
         * memory location. To resolve this we can use clone() method
         * of the array.
         */

        // Restoring the original array
        a[2] = previous_value;
        System.out.println("\nDisplaying the restored arrays...\n");
        for(int i=0; i<5; i++)
        {
            System.out.println("a[" + i + "] = "+ a[i] + "\tb[" + i + "] = "+ b[i] + " ");
        }
        System.out.println();

        // Cloning the array a to the array b
        b = a.clone();
        a[2] = 99;
        System.out.println("\nDisplaying the result of cloned arrays...\n");
        for(int i=0; i<5; i++)
        {
            System.out.println("a[" + i + "] = "+ a[i] + "\tb[" + i + "] = "+ b[i] + " ");
        }
        /**
         * Note: Both of these arrays have their individual memory allocations
         * and they donot share the same memory location.
         */
        System.out.println();
    }
}
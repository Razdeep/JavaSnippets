/**
 * WAP to convert double to int array by using user defined method
 */
import java.util.Scanner;
class Solution{
    public static int[] doubleToIntArray(double double_array[])
    {
        int[] array = new int[double_array.length];
        for(int i=0; i<double_array.length; i++)
        {
            array[i] =(int) double_array[i];
        }
        return array;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = scanner.nextInt();
        double[] double_array = new double[5];
        for(int i=0; i<5; i++)
        {
            double_array[i] = scanner.nextDouble();
        }
        int[] copy_array = doubleToIntArray(double_array);
        for(int i : copy_array)
        {
            System.out.print(i+" ");
        }
    }
}
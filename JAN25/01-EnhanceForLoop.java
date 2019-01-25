/**Tip #1: Local vars must be initialized
 * 
 * For, do...while, while loops are same as C and C++
 * Using enhanced for loop
 * 
 * Example
 *  for (type var : iterable) {
 *      Statements;
 *  }
 * 
 */
import java.util.Scanner;
class Solution{
    public static void main(String args[])
    {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for(int i : arr)
        {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
/**
 * Ways to initialize an array
 */
class Solution{
    public static void main(String args[])
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        for(int i=0; i<arr1.length; i++) // length is not a method
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        int[] arr2 = new int[]{1, 2, 5, 4, 3};
        for(int i=0; i<arr2.length; i++) // length is not a method
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        // int[] arr3;                  // This is not allowed
        // arr3 = {1, 2, 3, 4, 5};      // Illegal  
        int[] arr3;
        arr3 = new int[5];
        arr3[0] = 99;
        for(int i=0; i<arr3.length; i++) // length is not a method
        {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }
}
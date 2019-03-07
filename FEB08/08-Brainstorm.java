/**
 * Expected Output:
 * Not same
 * 
 * Explanation:
 * Arrays are first class objects.
 * arr1 and arr2 are two different reference to different objects
 * So when we compare arr1 and arr2, two different reference variables
 * are compared, the result we get is "Not same"
 * 
 */
class Solution{
    public static void main(String args[])
    {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        if( arr1 == arr2 )
        {
            System.out.println("Same");
        }
        else{
            System.out.println("Not same");
        }
    }
}
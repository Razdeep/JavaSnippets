/**
 * NOTE: if 2 command line arguments are not passed, the program would throw
 *      an <ArrayIndexOutOfBoundsException>
 * Explanation: args[0] is not considered the program name like c or c++.
 *              Instead the args[0] represents the 1st command line argument
 */
class Solution
{
    public static void main(String...args)
    {
        System.out.println("Argument at 0 is " + args[0]);
        System.out.println("Argument at 1 is " + args[1]);
    }   
}
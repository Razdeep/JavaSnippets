/**
 * --------------------------------
 * Using variable arguments
 * --------------------------------
 * 
 * NOTE #1: variable arguments must be placed AT LAST in the parameter
 * All the other parameters should be passed before the variable argument
 * for example:
 * void foo(double val, int ... a);
 * 
 * NOTE #2: For a method or constructor, only one variable argument is allowed
 * 
 */
class Solution{
    public static void foo(int ... a)
    {
        for(int i=0; i<a.length; i++)
            System.out.println(a[i]);
    }
    public static void main(String... args)
    {
        int i[] = {10,20,30};
        System.out.println("First method");
        foo(i);
        System.out.println("Second method");
        foo(10, 20, 90, 200, 250);
    }
}
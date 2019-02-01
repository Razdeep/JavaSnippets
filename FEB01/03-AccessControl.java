/**
 * Access Specifiers in Java
 * 
 * public    : anywhere
 * private   : same class
 * protected : same package or subclasses of another package
 * default   : same package
 * 
 * Note: This class is taking the value from another file 'SampleClass.java'
 * 
 */
class Solution{
    public static void main(String args[])
    {
        System.out.println(SampleClass.a);
    }
}
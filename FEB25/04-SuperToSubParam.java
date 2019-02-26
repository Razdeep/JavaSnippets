/**
 * Actual object's method would be called
 */
class A{
    void m1()
    {
        System.out.println("M1 of superclass");
    }
}
class B extends A{
    void m1()
    {
        System.out.println("M1 of subclass");
    }
}
class Solution{
    public static void main(String args[])
    {
        A obj = new B();
        obj.m1();
    }
}
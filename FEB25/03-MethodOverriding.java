/**
 * Method overriding
 * This is runtime polymorphism
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
        B obj = new B();
        obj.m1();
        obj.m1();
    }
}
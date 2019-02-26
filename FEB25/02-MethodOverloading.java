/**
 * This is compile time polymorphism
 */
class A{
    void m1()
    {
        System.out.println("M1");
    }
}
class B extends A{
    void m1(int x)
    {
        System.out.println("M1 with args");
    }
}
class Solution{
    public static void main(String args[])
    {
        B obj = new B();
        obj.m1();
        obj.m1(2);
    }
}
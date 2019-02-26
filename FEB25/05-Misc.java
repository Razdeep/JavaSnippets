/**
 * This would produce compilation error
 * @TODO
 * Note: We can call the methods of LHS only
 * The methods of the RHS will be actually called at runtime
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
    void m3()
    {
        System.out.println("M3 of subclass");
    }
}
class Solution{
    public static void main(String args[])
    {
        A obj = new B();
        obj.m1();
        obj.m3();
    }
}
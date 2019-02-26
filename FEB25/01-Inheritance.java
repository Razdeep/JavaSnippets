/**
 * Inheritance
 * Java doesnot support multiple inheritance because of diamond problem
 * 
 */
class A{
    void m1()
    {
        System.out.println("M1");
    }
}
class B extends A{
    void m2()
    {
        System.out.println("M2");
    }
}
class Solution{
    public static void main(String args[])
    {
        B obj = new B();
        obj.m1();
        obj.m2();
    }
}
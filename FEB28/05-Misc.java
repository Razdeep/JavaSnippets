// @TODO
class A{
    public void m1()(
        System.out.println("m1");
    )
}
class B{
    public void m2()(
        System.out.println("m2");
    )
}
class Solution{
    public static void main(String args[])
    {
        A obj = new B(); // Upcasting
        B obj2 =(B) obj;
        obj2.m2();
    }
}
/**
 * This shall produce error
 */
class A{
    A(int x)
    {
        System.out.println("A");
    }
}
class B extends A{
    B()
    {
        System.out.println("B");
    }
}
class Solution{
    public static void main(String args[])
    {
        B b = new B();
    }
}
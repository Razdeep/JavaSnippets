/**
 * This shall produce error
 * Explanation:
 * @TODO
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
        super(10);
        System.out.println("B");
    }
}
class Solution{
    public static void main(String args[])
    {
        B b = new B();
    }
}
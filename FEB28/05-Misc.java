// @TODO
class A{
    public void m1(){
        System.out.println("m1");
    }
}
class B extends A{
    public void m2(){
        System.out.println("m2");
    }
}
class Solution{
    public static void main(String args[])
    {
        A obj = new B(); // Upcasting
        // B obj = new A(); // Not possible
        obj.m2(); // This shall give error because LHS variable methods can 
                 // only be called by the object and the RHS implemented methods
                 // actually get called in the name of LHS methods
    }
}
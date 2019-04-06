/**
 * Anonymous class has the same access to local variables of the enclosing
 * scope as local classes
 * 
 * @TODO ADD MORE INFO
 * 
 */
class Demo
{
    void meth1()
    {
        System.out.println("Base method");
    }
}
class Solution
{
    public static void main(String[] args)
    {
        Demo obj = new Demo(){
            // Class creation + object creation
            void meth1()
            {
                System.out.println("Anonymous class");
            }
        };
        obj.meth1();
        Demo obj2 = new Demo(){
            // Class creation + object creation
            void meth1()
            {
                System.out.println("Anonymous 2 class");
            }
        };
        obj2.meth1();
    }
}
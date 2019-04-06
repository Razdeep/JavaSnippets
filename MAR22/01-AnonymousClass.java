/**
 * -----------------
 *  ANONYMOUS CLASS
 * -----------------
 * Anonymous class must be a subclass
 * Anonymous cannot be abstract
 */
abstract class Demo
{
    abstract void meth1();
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
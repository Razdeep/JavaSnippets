/**
 * ----------
 *  Exercise
 * ----------
 * WAP to create a class Demo containng two overloaded methods of demo().
 * Define a local class X containing show() in one of the demo() method.
 * Access the show() from the other demo
 * 
 */
class Demo{
    public static void demo(int a)
    {
        class X{
            void show()
            {
                System.out.println("Showing");
            }
        }
        X x = new X();
        x.show();
    }
    public static void demo(String str)
    {
        demo(1);
    }
    public static void main(String[] args)
    {
        demo("Hello");
    }
}
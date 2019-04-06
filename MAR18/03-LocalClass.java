/**
 * -------------------
 *  LOCAL CLASS
 * -------------------
 * When a class is defined inside a method, then it is called a Local Class.
 * The scope of such class is limited to it's enclosing braces.
 * 
 * Local class can access enclosing method's EFFECTIVE FINAL variables
 */
class Solution{
    private static void sayHello()
    {
        class Hello{
            Hello()
            {
                System.out.println("Hello");
            }
            private void sayHi()
            {
                System.out.println("Hi");
            }
        }
        Hello hello = new Hello();
        hello.sayHi();
    }
    public static void main(String[] args)
    {
        sayHello();
    }
}
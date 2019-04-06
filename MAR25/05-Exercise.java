/**
 * Write a proram which defines
 *  ==> Class A with one abstract method int add(int a, int b) and a 
 *      variable 'a' with value 10
 * 
 *  ==> An interface 'X' with at least one abstract method void test(),
 *      one default method void demo() and one static method void show()
 *      and a data value a with value 20
 * 
 *  ==> An interface Y with one abstract method void test() and one
 *      default method void demo() and a data member a with value
 *      30
 * 
 *  ==> Create a class Z which inherits the class A and interfaces X
 *      and Y, Now invoke all the 5 methods of the class and interface
 *      and also display the values of a
 */
class A{
    int add(int a, int b)
    {
        return a + b;
    }
}
interface X{
    abstract void test();
    void demo();
    static void show();
}
interface Y{
    abstract void test();
    void demo();
    static void show();
}
class Z extends A implements X,Y{

}
class Solution{

}
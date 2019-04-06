/**
 * ----------------------
 * Lambda Expression
 * ----------------------
 * Method without any name
 * It is used to define the abstract method of functional interfaces
 * 
 */
interface MyInterface{
    void test();
}
class Solution{
    public static void main(String[] args)
    {
        // Creating anonymous class
        MyInterface obj = new MyInterface(){
            public void test(){
                System.out.println("Anonymous");
            }
        };
        obj.test();
        // Since a lot of code is involved to achieve this functionality,
        // Lambda expressions came into picture

        MyInterface obj2 = () -> System.out.println("Anonymous using Lambda");
        obj2.test();
        // This behaves the same as above code.
        // Lambda expression can be only used in Functional Interfaces
        // () represents the parameter list of abstract method
        // For multi-line function definition use () -> { <Definition> }
    }
}
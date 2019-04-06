/**
 * ---------------------
 * Function Interface
 * ---------------------
 * It is the interface that specifies only one abstract method.
 * 
 * Annotations(eg. `@override`) are optional
 * 
 * Annotation for functional interface is `@FunctionalInterface`
 * 
 */

@FunctionalInterface
interface MyInterface{
    // This functional interface is actually valid,
    // 
    void test();
    public boolean equals(Object ob);
    public String toString();
}
class Solution{
    public static void main(String[] args)
    {

    }
}
/**
 * ------------------
 * NESTED CLASS
 * ------------------
 * Two types of class nesting is allowed - static and nonstatic
 * 
 */
// @TODO
class Solution{
    static class OuterClass{
        class NestedClass{
            NestedClass(){
                System.out.println("Object of nested created successfully");
            }
        }
        
    }
    public static void main(String[] args)
    {
        OuterClass.NestedClass nestedObject = new OuterClass.NestedClass();
    }
}
/**
 * Explanation: Each and every object of java is derived from the superclass
 *              called 'Object'. In this object toString() defined which is
 *              automatically called by JVM inside print statement.
 *              On performing toString() on any object, it would return
 *              'ClassName@HashValueOfObject'.
 *              The toString() method can also be overriden.
 */
class Solution{
    static class A{
        public String toString()
        {
            return "This is the A object";
        }
    }
    static class B{
        // Should be kept blank
    }
    public static void main(String args[])
    {
        Solution.A a = new Solution.A();
        Solution.B b = new Solution.B();
        System.out.println(a);
        System.out.println(b);
    }
}
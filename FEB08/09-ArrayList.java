/**
 * NOTE: ArrayList is not a linked list. It is defined in `java.util` packaged
 * Whenever the memory space falls short, JVM allocates a new List in the memory,
 * having double(or triple) space and copies all the elements implicitly. The
 * previous space is deallocated implicitly.
 * 
 * Constructor Overloading
 * ArrayList()
 * ArrayList(capacity)
 * ArrayList(Collection c)
 */
import java.util.*;

class Solution
{
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(10.5);
        arr.add(30);
        arr.add(20);
        arr.add("K17SJ");
        System.out.println("ArrayList = " + arr);
    }
}
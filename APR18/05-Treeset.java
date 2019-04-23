/**
 * TreeSets on basic datatypes
 * Note: This works without implementing comparator or comparable
 * because it is already implemented in the wrapper classes
 * of the basic data type
 */
import java.util.*;
class Solution{
    public static void main(String args[])
    {
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(7);
        myTreeSet.add(4);
        myTreeSet.add(3);
        myTreeSet.add(1);
        myTreeSet.add(4);
        myTreeSet.add(5);
        System.out.println(myTreeSet);
    }
}
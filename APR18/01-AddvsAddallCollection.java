/**
 * Collection
 * 
 */
import java.util.*;
class Solution{
    public static void main(String args[])
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add('a');
        arrayList.add("Rajdeep");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(99);
        arrayList2.add(arrayList);
        arrayList2.addAll(arrayList);
        for (Object this_object : arrayList2)
            System.out.println(this_object);
    }
}
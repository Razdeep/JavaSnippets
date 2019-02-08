/**
 * ArrayLists are generic classes
 * They can also be used to store heterogenous objects like python lists,
 * if a datatype is not specified in the angular bracket(ArrayList<#DATA-TYPE#>).
 * 
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
        arr.add(new Bekar("K"));
        arr.add(new Bekar("L"));
        System.out.println("ArrayList = " + arr);
    }
}
class Bekar{
    String name;
    Bekar(String name)
    {
        this.name = name;
    }
}
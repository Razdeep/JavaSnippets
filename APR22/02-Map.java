
/**
 * ---------------------
 *         Maps
 * ---------------------
 * 
 * Types of Map
 *  - TreeMap
 *  - HashMap
 *  - LinkedHashMap
 * 
 * Methods
 *  - void clear()
 *  - boolean containsKey(Object value)
 *  - Object get(Object key)
 *  - boolean isEmpty()
 *  - Set<K> keySet()
 *  - put(K key, Object value)
 *  - 
 */
import java.util.*;

class Solution {
    public static void main(String args[])
    {
        HashMap<Integer, String> myHashMap = new HashMap<>();
        String[] name = {"Rajdeep","Roy","Chowdhury"};
        for (int i = 0; i < name.length; i++)
            myHashMap.put(i, name[i]);
        for (int i = 0; i < name.length; i++)
            System.out.println(i + " " + myHashMap.get(i)); 

        System.out.println("Printing keys...");
        System.out.println(myHashMap.keySet());

        System.out.println("Printing values...");
        System.out.println(myHashMap.values());
    }
}
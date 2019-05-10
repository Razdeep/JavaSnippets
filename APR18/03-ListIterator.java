import java.io.*; 
import java.util.*; 
  
class Solution { 
    public static void main(String[] args) 
    { 
        ArrayList<String> list = new ArrayList<String>(); 
  
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        list.add("E"); 
  
        ListIterator iterator = list.listIterator(); 
  
        System.out.println("Displaying list elements in forward direction : "); 
  
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
  
        System.out.println(); 
  
        System.out.println("Displaying list elements in backward direction : "); 
  
        while (iterator.hasPrevious()) 
            System.out.print(iterator.previous() + " "); 
  
        System.out.println(); 
    } 
} 
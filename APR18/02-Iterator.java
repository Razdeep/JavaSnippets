/**
 * ------------------
 *     Iterators
 * ------------------
 * 
 * ‘Iterator’ is an interface which belongs to collection framework. 
 * It allows us to traverse the collection, access the data element 
 * and remove the data elements of the collection.
 * java.util package has public interface Iterator and contains three methods:
 *      boolean hasNext(): It returns true if Iterator has more element 
 *                         to iterate.
 * 
 *      Object next(): It returns the next element in the collection 
 *                      until the hasNext()method return true. This 
 *                      method throws ‘NoSuchElementException’ if there is 
 *                      no next element.
 * 
 *      void remove(): It removes the current element in the collection.
 *                     This method throws ‘IllegalStateException’ if this
 *                       function is called before next( ) is invoked.
 */
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
  
        // Iterator to traverse the list 
        Iterator iterator = list.iterator(); 
  
        System.out.println("List elements : "); 
  
        while (iterator.hasNext()) 
        {
            System.out.print(iterator.next() + " "); 
        }
  
        System.out.println(); 
    } 
} 
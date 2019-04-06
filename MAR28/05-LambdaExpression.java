/**
 * Create a functional interface Predicate with  an abstract method
 * test with following signature
 * 
 * boolean test(String t)
 * 
 * Write a test program to filter all the strings present in ArrayList
 * which ended with character 'g' by using above test method
 * with the help of lambda expression
 * 
 */
import java.util.ArrayList;

@FunctionalInterface
interface Predicate{
    boolean test(String t);
}
class Solution{
    public static void main(String[] args)
    {
        Predicate my_predicate = (text) -> {
            if(text.charAt(text.length() - 1) == 'g')
                return true;
            return false;
        };
        ArrayList<String> my_arraylist = new ArrayList<>();
        my_arraylist.add("Seattle");
        my_arraylist.add("Honkong");
        my_arraylist.add("Sydney");
        my_arraylist.add("Brussels");
        my_arraylist.add("Venice");
        my_arraylist.add("Beijing");
        for(String text: my_arraylist)
        {
            if(my_predicate.test(text))
                System.out.println(text);
        }
    }
}
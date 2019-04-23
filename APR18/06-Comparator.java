/**
 * Comparator is used to implement the logic of order outside the class
 */
import java.util.*;
class MyComparator implements Comparator<Student>
{
    public int compare(Student first, Student second)
    {
        if (first.id < second.id)
            return -1;
        else if(first.id > second.id)
            return 1;
        else
            return 0;
    }
}
class Student{
    String name;
    int id;
    Student (String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public String toString()
    {
        return "Name = "+this.name+"  Id: " + this.id;
    }
}
class Solution{
    public static void main(String args[])
    {
        TreeSet<Student> myTreeSet = new TreeSet<>(new MyComparator());
        myTreeSet.add(new Student("Rajdeep", 11712546));
        myTreeSet.add(new Student("Deep", 11712543));
        myTreeSet.add(new Student("Raj", 11712550));
        System.out.println(myTreeSet);
    }
}
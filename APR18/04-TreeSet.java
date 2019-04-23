/**
 * TreeSet
 * 
 * TreeSet always search for compareTo() implementation in Object.
 * If not implemented in the class, Comparator object must be passed as
 * argument in TreeSet while object declaration
 */
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int id;
    Student (String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public int compareTo(Student otherStudent)
    {
        if (this.id < otherStudent.id)
            return -1;
        else if(this.id > otherStudent.id)
            return 1;
        else
            return 0;
    }
    public String toString()
    {
        return "Name = "+this.name+"  Id: " + this.id;
    }
}
class Solution{
    public static void main(String args[])
    {
        TreeSet<Student> myTreeSet = new TreeSet<>();
        myTreeSet.add(new Student("Rajdeep", 11712546));
        myTreeSet.add(new Student("Deep", 11712543));
        myTreeSet.add(new Student("Raj", 11712550));
        System.out.println(myTreeSet);
    }
}
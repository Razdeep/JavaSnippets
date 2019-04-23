/**
 * --------------
 *   Evaluation
 * --------------
 * 
 * WAP to create a class Student with attributes name and cgpa. Add atleast
 * 5 student objects in an appropriate collection such that they are sorted
 * in descending order on the basis of their cgpa.
 * Display all the students who are elligible for Verizon placement Drive
 * (Elligibility: cgpa >= 7.5)
 * 
 */
import java.util.*;

class Solution
{
    static class Student implements Comparable<Student>{
        String name;
        float cgpa;
        Student(String name, float cgpa){
            this.name = name;
            this.cgpa = cgpa;
        }
        @Override
        public String toString()
        {
            return "Name " + name + "\t cgpa "+cgpa;
        }
        @Override
        public int compareTo(Student other)
        {
            return (int)(other.cgpa - this.cgpa);
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int n = scanner.nextInt();
        TreeSet<Student> studentTree = new TreeSet<>();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter name of Student #"+(i+1));
            String this_name = scanner.next();
            System.out.println("Enter the cgpa of Student #" + (i+1));
            float this_cgpa = scanner.nextFloat();
            studentTree.add(new Student(this_name, this_cgpa));
        }

        System.out.println("Displaying all the students in descending order");
        for(Student this_student : studentTree)
        {
            System.out.println(this_student);
        }

        System.out.println("Displaying all the student who are ellgible for Verizon Placement Drive");
        for(Student this_student : studentTree)
        {
            if (this_student.cgpa >= 7.5)
            System.out.println(this_student);
        }
    }
}
/**
 * Create a class Employee with attributes name, designation and salary
 * Display the records according to the sorted order of the Employee
 * 
 * Display the names of all employees who have salary greater than 50000
 * 
 * Hint: use tailSet(fromElements)
 */
// @TODO last part
import java.util.*;
class Employee implements Comparable<Employee>{
    String name, designation;
    int salary;
    public Employee(String name, String designation, int salary)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee other)
    {
        return other.salary - this.salary;
    }
    @Override
    public String toString()
    {
        return "Name : " + name + "  Designation: " + designation + "  Salary: " + salary;
    }
}
class Solution{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Employee> employeeTree = new TreeSet<>();
        System.out.println("Enter number of employees ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter name of Employee #"+i);
            String name = scanner.next();
            System.out.println("Enter designation of Employee #"+i);
            String designation = scanner.next();
            System.out.println("Enter the salary of Employee #"+i);
            int salary = scanner.nextInt();
            employeeTree.add(new Employee(name, designation, salary));
        }
        System.out.println(employeeTree);
    }
}
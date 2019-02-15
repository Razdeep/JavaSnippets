/**
 * ----------------------------------
 * Employee Management System
 * ----------------------------------
 * Create a class employee with attributes name, age, gender, specialization,
 * highestDegree and experience. Write a menu-driven program to store the new record,
 * display all the records, search the record and delete the record of a
 * particular Employee
 */
import java.util.Scanner;
import java.util.ArrayList;
class Employee{
    String name, gender, specialization, highestDegree;
    int experience,age;
    public Employee(String name, int age, String gender, String specialization, String highestDegree, int experience)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.specialization = specialization;
        this.highestDegree = highestDegree;
        this.experience = experience;
    }
    public static void displayAll(ArrayList<Employee> employeeList){
        drawLine();
        System.out.println("Name\tAge\tGender\tSpecial\tDegree\tExperience");
        drawLine();
        for(Employee this_employee : employeeList)
        {
            System.out.println(this_employee.name+"\t"+this_employee.age+"\t"+this_employee.gender+
            "\t"+this_employee.specialization+"\t"+this_employee.highestDegree+"\t"+this_employee.experience);
        }
    }
    public static int searchRecord(String name, ArrayList<Employee> employeeList)
    {
        for(int i=0; i<employeeList.size(); i++)
        {
            if(name.equals(employeeList.get(i).name) == true)
            {
                return i;
            }
        }
        return -1;
    }
    public static void drawLine()
    {
        System.out.println("");
        for(int i=0; i<30; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("");
        System.out.println("Employee Management System");
        boolean running = true;
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        while(running)
        {
            System.out.println(" 1. New Employee\n 2. Display All Records\n 3. Search Record\n 4. Delete\n 5.Exit");
            drawLine();
            System.out.println("Enter choice ");
            int choice = scanner.nextInt();
            drawLine();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                System.out.println("Enter name ");
                String name = scanner.nextLine();
                System.out.println("Enter age ");
                int age = scanner.nextInt();
                scanner.nextLine(); // buffer clear
                System.out.println("Enter gender ");
                String gender = scanner.nextLine();
                System.out.println("Enter specialization ");
                String specialization = scanner.nextLine();
                System.out.println("Enter Highest degree ");
                String highestDegree = scanner.nextLine();
                System.out.println("Enter experience ");
                int experience = scanner.nextInt();
                employeeList.add(new Employee(name, age, gender, specialization, highestDegree, experience));
                break;
                case 2:
                displayAll(employeeList);
                break;
                case 3:
                    System.out.println("Enter the name of employee to search ");
                    int index = searchRecord(scanner.nextLine(), employeeList);
                    if(index != -1)
                    {
                        System.out.println("Name:" + employeeList.get(index).name);
                        System.out.println("Age:" + employeeList.get(index).age);
                        System.out.println("Gender: "+employeeList.get(index).gender);
                        System.out.println("Specialization" + employeeList.get(index).specialization);
                        System.out.println("Highest Degree:" + employeeList.get(index).highestDegree);
                        System.out.println("Experience: "+ employeeList.get(index).experience);
                    }
                    else
                        System.out.println("Record not found");
                break;
                case 4:
                    System.out.println("Enter the name of employee to delete ");
                    int idx = searchRecord(scanner.nextLine(), employeeList);
                    if( idx!=-1 )
                    {
                        employeeList.remove(idx);
                        System.out.println("Record successfully deleted");
                    }
                    else{
                        System.out.println("Record to be deleted could not be found");
                    }
                break;
                case 5:
                running = false;
                break;
                default:
                System.out.println("Invalid option");
            }
        }
        System.out.println("Thank you for using Employee Management System");
    }
}
/**
 * --------------
 *   Evaluation
 * --------------
 * Create a class SectionInfo which can store the information of any number
 * of students by taking lambda expressions to filter the students according
 * to city, with minimum CGPA, with 12th percentage and date of admission
 * 
 */
import java.util.*;
import java.time.*;

class Solution
{
    @FunctionalInterface
    interface StringClassifier{
        public ArrayList<SectionInfo.Student> classify(SectionInfo sectionInfo, String city);
    }
    @FunctionalInterface
    interface MinimumCGPA{
        public float findMin(SectionInfo sectionInfo);
    }
    @FunctionalInterface
    interface DateClassifier{
        public ArrayList<SectionInfo.Student> classify(SectionInfo sectionInfo, LocalDate localDate);
    }
    static class SectionInfo{
        class Student{
            String name, city;
            LocalDate date_of_admission;
            float percentage_of_12, CGPA;
            
            Student(String name, String city, LocalDate date_of_admission,
                float percentage_of_12, float CGPA)
                {
                    this.name = name;
                    this.city = city;
                    this.date_of_admission = date_of_admission;
                    this.percentage_of_12 = percentage_of_12;
                    this.CGPA = CGPA;
                }
            void display()
            {
                System.out.println(name+"\t"+city+"\t"+date_of_admission+"\t"+percentage_of_12+"\t"+CGPA);
            }
        }
        ArrayList<Student> studentList;
        SectionInfo()
        {
            studentList = new ArrayList<Student>(10);
        }
        void addStudent(Student student)
        {
            studentList.add(student);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String choices_text = " 1. Add student\n 2. Display All\n 3. Use Filters in city\n 4. Minimum CGPA\n 5. Date of Admission";
        SectionInfo sectionInfo = new SectionInfo();
        while(running)
        {
            System.out.println(choices_text);
            int ch = scanner.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter name ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter city ");
                String city = scanner.nextLine();
                System.out.println("Enter date of admission(YYYY-MM-DD) ");
                // LocalDate date_of_admission = new LocalDate();
                LocalDate date_of_admission = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                System.out.println("Enter percentage of 12th ");
                float percentage_of_12 = scanner.nextFloat();
                System.out.println("Enter CGPA ");
                float CGPA = scanner.nextFloat();
                SectionInfo.Student student = sectionInfo.new Student(name, city, date_of_admission, percentage_of_12, CGPA);
                sectionInfo.addStudent(student);
                break;

                case 2:
                System.out.println("Displaying all the students... ");
                System.out.println("Name\t City\t DateOfAdm\t Percentage\t CGPA");
                for(SectionInfo.Student this_student : sectionInfo.studentList)
                {
                    this_student.display();
                }
                break;

                case 3:
                StringClassifier cityClassifier = (arg_sectionInfo, arg_city) ->
                {
                    ArrayList<SectionInfo.Student> result = new ArrayList<SectionInfo.Student>();
                    for(SectionInfo.Student this_student : arg_sectionInfo.studentList)
                    {
                        if(this_student.city == arg_city)
                        {
                            result.add(this_student);
                        }
                    }
                    return result;
                };
                System.out.println("Enter a city name by which you want to classify ");
                scanner.nextLine();
                String query = scanner.nextLine();
                ArrayList<SectionInfo.Student> filtered_students = cityClassifier.classify(sectionInfo, query);
                System.out.println("Displaying the students according to filter city");
                for(SectionInfo.Student this_student : filtered_students)
                {
                    this_student.display();
                }
                break;

                case 4:
                MinimumCGPA minimumCGPA = (arg_sectionInfo) ->
                {
                    float result = 1000000;
                    for(SectionInfo.Student this_student : arg_sectionInfo.studentList)
                    {
                        if(this_student.CGPA < result)
                            result = this_student.CGPA;
                    }
                    return result;
                };
                float answer = minimumCGPA.findMin(sectionInfo);
                System.out.println("The minimum CGPA is " + answer);
                break;

                case 5:
                System.out.println("Filtering using date of admission ");
                DateClassifier dateClassifier = (arg_sectionInfo, arg_date) ->
                {
                    ArrayList<SectionInfo.Student> result = new ArrayList<SectionInfo.Student>(10);
                    for(SectionInfo.Student this_student : arg_sectionInfo.studentList)
                    {
                        if(this_student.date_of_admission.equals(arg_date))
                        {
                            result.add(this_student);
                        }
                    }
                    return result;
                };
                System.out.println("Enter the date by which you want to classify ");
                LocalDate my_date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                ArrayList<SectionInfo.Student> filtered_students_2 = dateClassifier.classify(sectionInfo, my_date);
                System.out.println("Displaying the students according to filter date of admission ");
                for(SectionInfo.Student this_student : filtered_students_2)
                {
                    this_student.display();
                }
                break;

                default:
                System.out.println("You have selected wrong option");
            }
        }
    }
}
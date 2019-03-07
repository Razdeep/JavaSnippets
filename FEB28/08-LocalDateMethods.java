/**
 * Methods of LocalDate
 */
import java.time.*;

class Solution{
    public static void main(String args[])
    {
        LocalDate local_date = LocalDate.now();
        System.out.println("The year is " + local_date.getYear());
        System.out.println("The Month value is " + local_date.getMonthValue());
        System.out.println("The Month is " + local_date.getMonth());
        System.out.println("The Day is " + local_date.getDayOfWeek());
        System.out.println("The Date is " + local_date.getDayOfMonth());
        System.out.println("Today is the " + local_date.getDayOfYear());
        String answer = local_date.isLeapYear() ? " a " : " not a ";
        System.out.println("This is" + answer + "Leap year");
    }
}
/**
 * WAP to let user enter date in the format
 * YYYY-MM-DD
 *   1. Is it in future or past?
 *   2. Is it a leap year?
 *   3. What day of week is it?
 *   4. What is the day a month from now? // @TODO
 */
import java.time.*;
import java.util.Scanner;

class Solution{
    public static void main(String args[])
    {
        System.out.println("Enter the date is YYYY-MM-DD ");
        String date_text = new Scanner(System.in).nextLine();
        LocalDate date = LocalDate.parse(date_text);
        if( date == LocalDate.now())
            System.out.println("Dates are equal");
        else if(date.isAfter(LocalDate.now()))
            System.out.println("Date is in the future");
        else
            System.out.println("Date was in the past");
        System.out.println(date_text + " is Leap year :" + (date.isLeapYear()? "YES" : "NO" ));
        System.out.println(date_text + " is a "+date.getDayOfWeek());
        System.out.println("This is the " + date.getDayOfWeek().getValue() + "-th day of the week");
        // System.out.println("Days");
    }
}
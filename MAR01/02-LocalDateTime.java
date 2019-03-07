/**
 * LocalDateTime
 * 
 * public static LocalDateTime now()
 * public static LocalDateTime of(int year, Month month, int dayOfMonth,)
 */
import java.time.*;
import java.time.temporal.*;
class Solution{
    public static void main(String[] args)
    {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2019,2,20,12,15,12);
        LocalDateTime ldt3 = LocalDateTime.parse("2019-04-19","21:15:10");  // @TODO

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println("Difference = " + ldt1.until(ldt3, ChronoUnit.MINUTES));
    }
}
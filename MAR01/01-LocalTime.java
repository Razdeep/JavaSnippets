/**
 * LocalTime
 * public static LocalTime now()
 * public static LocalTime parse(CharSequence )
 * 
 * Methods
 * public int getHour()
 * public int getMinute()
 * 
 * Temporal Unit -> Interface implemented by ChronoUnit enum
 * 
 */
import java.time.*;
import java.time.temporal.*;
class Solution{
    public static void main(String args[])
    {
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(12,15,12);
        LocalTime lt3 = LocalTime.parse("21:15:10");

        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println("Difference = " + lt1.until(lt3, ChronoUnit.MINUTES));

    }
}
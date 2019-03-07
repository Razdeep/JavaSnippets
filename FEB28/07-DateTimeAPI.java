/**
 * These classes are immutable
 */
import java.time.*;
class Solution{
    public static void main(String args[])
    {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2019,5,15);
        LocalDate ld3 = LocalDate.parse("2017-08-31");

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
    }
}
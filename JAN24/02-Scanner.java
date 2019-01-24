/**Using different methods of the Scanner class 
 * NOTE : if you are using nextLine after a token reaing method(like nextInt()),
 *        it would skip the input line. There are no flush methods.
 * RESOLUTION : Use another nextLine() before the desired nextLine()
 * 
*/
import java.util.Scanner;
class Solution{
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter byte ");
        byte my_byte = scanner.nextByte();
        System.out.println("Next Byte = "+my_byte);

        System.out.println("Enter Short "); 
        short my_short = scanner.nextShort();
        System.out.println("Next short = "+my_short);

        System.out.println("Enter int "); 
        int my_int = scanner.nextInt();
        System.out.println("Next Int = "+my_int);

        System.out.println("Enter long "); 
        long my_long = scanner.nextLong();
        System.out.println("Next long = "+my_long);

        System.out.println("Enter float "); 
        float my_float = scanner.nextFloat();
        System.out.println("Next float = "+my_float);

        System.out.println("Enter Double "); 
        double my_double = scanner.nextDouble();
        System.out.println("Next double = "+my_double);

        System.out.println("Enter Char "); 
        String my_char = scanner.next();
        System.out.println("Next char = "+my_char);

        System.out.println("Enter String "); 
        scanner.nextLine();
        String my_line = scanner.nextLine();
        System.out.println("Next string = "+my_line);

    }
}
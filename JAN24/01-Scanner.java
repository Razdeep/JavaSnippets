/** etting input from the CLI 
 * 
 * We can also use wild card imports by
 * import java.util.*;
*/
import java.util.Scanner;
class Solution{
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integers ");
        int a = scanner.nextInt();
        System.out.print("You have entered "+a+"\n");
    }
}
/**
 * Playing with StringBuilders
 * Note: Capacity increase with following formula
 *      new capactity = 2 * previous_capacity + 2
 * 
 */
import java.util.Scanner;

class Solution
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string ");

        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

        stringBuilder.append(" Hello world");
        System.out.println(stringBuilder);

        stringBuilder.reverse(); // Changes are actually reflected back
        System.out.println(stringBuilder);

        stringBuilder.reverse(); // Changes reverted
        // System.out.println(stringBuilder);

        stringBuilder.insert(stringBuilder.length()-5,"Linux ");
        // Inserts Linux in between "Hello" and "World"
        System.out.println(stringBuilder);

        stringBuilder.replace(stringBuilder.length()-11, stringBuilder.length()-5,"Arch ");
        System.out.println(stringBuilder);

        stringBuilder.delete(stringBuilder.length()-11, stringBuilder.length()-6);
        System.out.println(stringBuilder);
        
        System.out.println("Capacity = " + stringBuilder.capacity());

        stringBuilder.ensureCapacity(77);
        System.out.println("Capacity = " + stringBuilder.capacity());
    }
}
/**
 * Tweaking arguments of Lambda expressions
 * 
 */
@FunctionalInterface
interface Operation{
    void operate(int a, int b);
}
class Solution
{
    public static void main(String[] args)
    {
        Operation operation = (int x, int y) -> {
            System.out.println(x + y);
        };
        // Skipping to mention the type
        operation.operate(2, 3);
        Operation operation2 = (a, b) -> {
            System.out.println(a * b);
        };
    }
}
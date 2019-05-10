class Solution
{
    class Demo{
        int a = 10;
        class Demo2{
            void meth1()
            {
                System.out.println("Method1");
                System.out.println("a = " + a);
            }
        }
    }
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Solution.Demo obj = solution.new Demo();
        Demo.Demo2 obj2 = obj.new Demo2();
    }
}

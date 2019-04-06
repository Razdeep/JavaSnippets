// @TODO
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
class Demo3
{
    public static void main(String[] args)
    {
        Demo obj = new Demo();
        Demo.Demo2 obj2 = obj.new Demo2();
    }
}
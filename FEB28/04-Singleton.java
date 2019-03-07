// @TODO
class DemoSingle{
    private DemoSingle obj = new DemoSingle();
    private DemoSingle()
    {
        
    }
    public static DemoSingle getObject()
    {
        return obj;
    }
    void bark()
    {
        System.out.println("Bhow Bhow");
    }
}
class Solution{
    public static void main(String args[])
    {
        DemoSingle demo = DemoSingle.getObject();
        demo.bark();
    }
}
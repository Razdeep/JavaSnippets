class DemoSingle{
    private static DemoSingle obj;
    private DemoSingle()
    {
        
    }
    public static DemoSingle getObject()
    {
        if(obj == null)
            obj = new DemoSingle();
        return obj;
    }
    public void bark()
    {
        System.out.println("Bhow bhow");
    }
}
class Solution{
    public static void main(String args[])
    {
        DemoSingle demo = DemoSingle.getObject();
        demo.bark();
    }
}
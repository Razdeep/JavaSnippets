/**
 * ----------------------
 *    Generics in java
 * ----------------------
 * 
 */
class Gen <T1, T2>{
    T1 obj1;
    T2 obj2;
    Gen(T1 obj1, T2 obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    T1 getObj1()
    {
        return obj1;
    }
    T2 getObj2()
    {
        return obj2;
    }
    void show()
    {
        System.out.println("Class = " + obj.getClass().getName());
    }
}
class Solution
{
    public static void main(String[] args)
    {
        Integer i = new Integer(100);
        String s = "Demo";
        Gen<Integer, String> obj = new Gen<Integer>(i);
        Gen<String> obj2 = new Gen<>(s);
        int i2    = obj.getObj();
        String s2 = obj2.getObj();
        System.out.println("obj.getObj() = " + i2);
        System.out.println("obj2.getObj() = " + s2);
        obj.show();
        obj2.show();
    }
}
/**
 * ----------------------
 *    Generics in java
 * ----------------------
 * @TODO
 * 
 */
class Gen <T>{
    T obj;
    Gen(T obj)
    {
        this.obj = obj;
    }
    T getObj()
    {
        return obj;
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
        Gen<Integer> obj = new Gen<Integer>(i);
        Gen<String> obj2 = new Gen<>(s);
        int i2    = obj.getObj();
        String s2 = obj2.getObj();
        i2 = s2;
        System.out.println("obj.getObj() = " + i2);
        System.out.println("obj2.getObj() = " + s2);
        obj.show();
        obj2.show();
    }
}
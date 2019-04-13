/**
 * Write
 * 
 * //@TODO
 * 
 */
import java.io.*;

class MyClass implements Serializable{
    String s;
    int i;
    double d;
    // Constructor
    public MyClass(String s, int i, double d)
    {
        this.s = s;
        this.i = i;
        this.d = d;
    }
    public String toString(){
        return "Showing object " + s + i + d;
    }
}
class Solution{
    public static void main(String args[])
    {
        try{
            MyClass object1 = new MyClass("Hello", 2, 2.7e10);
            System.out.println("Object1 " + object1);
            FileOutputStream fos = new FileOutputStream("Serial");
            ObjectOutputStream oas = new ObjectOutputStream(fos);
            oas.writeObject(object1);
            oas.flush();
            oas.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
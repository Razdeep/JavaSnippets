/**
 * Read
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
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
/**
 * -----------------
 * DataInputStream
 * -----------------
 * Note: Before executing this, make sure to execute the 04-DataOutputStream.java
 * DataOutputStream stores data in an encoded format
 */
import java.io.*;
class Solution{
    public static void main(String[] args) throws Exception{
        DataInputStream din = null;
        try{
            din = new DataInputStream(new FileInputStream("in.txt"));
            boolean finished = false;
            while(!finished)
            {
                try{
                    int x = din.readInt();
                    System.out.println(x);
                }
                catch(Exception e)
                {
                    finished = true;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            if(din != null)
                din.close();
        }
    }
}
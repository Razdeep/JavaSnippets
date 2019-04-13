/**
 * -----------------
 * DataInputStream
 * -----------------
 * 
 */
// @TODO hint write first read last
import java.io.*;
class Solution{
    public static void main(String[] args) throws Exception{
        // DataInputStream din;
        try{
            DataInputStream din = new DataInputStream(new FileInputStream("in.txt"));
            int x = din.readInt();
            System.out.println(x);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            // din.close();
        }
    }
}
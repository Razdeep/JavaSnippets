
/**
 * -----------------
 * DataOutputStream
 * -----------------
 * 
 */

import java.io.*;

class Solution {
    public static int fibonacci(int index) {
        if (index == 0)
            return 0;
        if (index == 1)
            return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    public static void main(String[] args) throws Exception {
        DataOutputStream dout = null;
        try {
            dout = new DataOutputStream(new FileOutputStream("in.txt"));
            for (int i = 0; i <= 10; i++)
                dout.writeInt(fibonacci(i));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (dout != null)
                dout.close();
        }
    }
}
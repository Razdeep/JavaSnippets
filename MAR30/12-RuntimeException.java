/**
 * Runtime exception
 * 
 */
class Solution{
    public static void main(String args[])
    {
        try{
            throw new RuntimeException();
        }
        catch(RuntimeException exception)
        {
            System.out.println(exception);
        }
    }
}
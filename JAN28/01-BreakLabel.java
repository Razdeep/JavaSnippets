/**
 * Using break labels
 */
class Solution{
    public static void main(String arg[])
    {
        outer: for(int i=0;i<3;i++)
        {
            System.out.print("Pass " + i);
            for(int j=0;j<10;j++)
            {
                if(j==3)
                break outer;
            }
        }
        System.out.println("Outside Loop");
    }
}

// @TODO

class Solution{
    public static void main(String args[])
    {
        int i;
        for(i=5;i>=0;i--)
        {
            for(int j=0; j<=i; j++)
            System.out.print(" ");
            if( i%2!=0 ) // NOTE : This is for even rows
            {
                for(int j=0; j<5-i; j++)
                System.out.print("*");
                for(int j=1; j<5-i; j++)
                System.out.print("*");
            }
            else{ // NOTE : This is for odd rows
                for(int j=0; j<5-i; j++)
                {
                    if( j!=0 )
                    System.out.print("*");
                    else
                    System.out.print("+");
                }
                for(int j=1; j<5-i; j++)
                {
                    if( j != 5-i-1)
                    System.out.print("*");
                    else
                    System.out.print("+");
                }

            }
            System.out.println();
        }
        for(int j=0; j<5-i; j++)
        System.out.print("+");
        System.out.println();
    }
}
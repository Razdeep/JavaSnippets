/**
 * WAP to calculate and display the CGPI of students by taking at least
 * three subjects marks as input from the user. The number of CA
 * comonents in subjects can vary (eg :  Java(4) 4 CAs, DataStructure(3) 3 CAs,
 * English(2) 3 CAs, and consider best n-1 CAs for final CGPI.
 * Your program should be user interactive
 */

import java.util.Scanner;
class Solution{
    public static double effectiveScore(double...ca)
    {
        /**
         * For getting the effective score, we deducting the min of ca from
         * the total score and dividing by (no. of CA's - 1 )
         * Complexity: O(n)
         */
        double sum = 0, min = Integer.MAX_VALUE;
        for(double i : ca)
        {
            sum += i;
            min = ( i < min ) ? i : min;
        }
        return (sum - min) / (ca.length - 1);
    }
    public static double getGrade(double effective_score)
    {
        if(effective_score >= 80)
            return 10;
        else if(effective_score >= 60)        
            return 8;
        else if(effective_score >= 50)
            return 6;
        else if(effective_score >= 40)
            return 5;
        else
            return 0;
    }
    public static double calculateCGPA(double[][] mark_list){
        double[] credits = {4d, 3d, 2d};
        double sum_credits = 0;
        for(double this_credit : credits)
        {
            sum_credits += this_credit;
        }
        double gain = 0;
        for(int i=0;i<mark_list.length;i++)
        {
            gain += ( getGrade( effectiveScore( mark_list[i] )) * credits[i]);
        }
        return gain / sum_credits;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double[][] mark_list = new double[3][]; 
        mark_list[0] = new double[4];
        mark_list[1] = new double[3];
        mark_list[2] = new double[3];
        
        String[] subject = {"Java", "Data Structures", "English"};
        
        for(int i = 0; i<3; i++)
        {
            System.out.println("Enter the marks of "+ mark_list[i].length +" CAs of "+subject[i]+" ");
            for(int j = 0; j<mark_list[i].length; j++)
            {
                System.out.print("Enter marks of CA #"+(j+1)+" of "+subject[i]+" ");
                mark_list[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Calculating CGPA");
        System.out.println("Your CGPA is "+calculateCGPA(mark_list));
    }
}
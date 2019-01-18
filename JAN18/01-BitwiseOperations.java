/**
 * boolean -> true/false
 * char -> 2 byte
 * byte -> 1 byte
 * short -> 2 byte
 * int -> 4 byte
 * long -> 8 byte
 * float -> 4 byte
 * double -> 8 byte
 * char is actually the subset of int. It follows the properties of int
 */

/**
 * Program illustrating bitwise operations
 */

 class Solution{
     public static void main(String argv[])
     {
         int a = 4;
         int b = 8;
         int c = a & b;
         System.out.println("c = " + c);
     }
 }

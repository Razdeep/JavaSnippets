/**
 * StringBuilder
 * 
 * void setLength(int length)
 * 
 * When we increase the size of the buffer, null characters are added 
 * to the end of the existing buffer. 
 * 
 * If we call setLength( ) with a value less than the current value 
 * returned by length( ), then the characters stored beyond the new 
 * length will be lost.
 * 
 */
class Solution{
    public static void main(String args[])
    {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        System.out.println("Length = " + stringBuilder.length());
        System.out.println("Capacity = " + stringBuilder.capacity());
        
        System.out.println("Tweaking...");
        // using setLength()
        stringBuilder.setLength(22);
        System.out.println(stringBuilder);
        System.out.println("Length = " + stringBuilder.length());
        System.out.println("Capacity = " + stringBuilder.capacity());
    }
}
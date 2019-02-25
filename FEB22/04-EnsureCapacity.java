/**
 * StringBuilder
 * 
 * void ensureCapacity(int capacity)
 * 
 * If we want to preallocate room for a certain number of characters
 * after a StringBuilder has been constructed, we can use ensureCapacity()
 * to set the size of the buffer.
 * 
 * This is useful if we know in advance that we will be appending a
 * large number of small strings to a StringBuilder.
 * 
 * Q-> How does StringBuilder expand?
 * Answer: When the length of StringBuilder becomes larger than the capacity
 * then memory reallocation is done: In case of StringBuilder, reallocation
 * of memory is done using the following rule:
 *
 * If the new_length <= 2*(original_capacity + 1), then 
 *		new_capacity = 2*(original_capacity + 1) 
 *
 * Else, new_capacity = new_length.
 *
 */
class Solution{
    public static void main(String args[])
    {
        
    }
}
/**
 * Manual Garbage Collection using finalize()
 * 
 * Note: Each n every class is implicitly derived from the predefined
 * class called the 'Object'. The Object class has a method called finalize()
 * can be used to delete the object.
 * 
 */

// @TODO: Update documentation

class Solution{
    void isAlive()
    {
        System.out.print("I'm alive");
    }
    public static void main(String args[]){
        Solution solution = new Solution();
        solution.isAlive();
        try {
            solution.finalize();
        }
        catch(Throwable t) {
            System.out.println("Caught the exception");
            throw new AssertionError(t);
        }
        
        solution.isAlive();
    }
}
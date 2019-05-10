/**
 * ----------------
 *   Final Class
 * ----------------
 * 
 * Final classes are used to make sure that the final classes 
 * are not inherited anymore
 * 
 * NOTE : This must not compile
 */
class Solution{
    static public final class Dinosaur{
        @Override
        public String toString()
        {
            return "Graaaw !!";
        }
    }
    public static class Lizard extends Dinosaur{
        @Override
        public String toString()
        {
            return "Tik! Tik! Tik!";
        }
    }
    public static void main(String args[])
    {
        Lizard derp = new Lizard();
        System.out.println(derp);
    }
}
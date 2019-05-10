// Important
class Solution{
    public static class Rrc{
        @Override
        public String toString()
        {
            return "Hi! I'm Rajdeep";
        }
    }
    public static void main(String args[])
    {
        Rrc rajdeep = new Rrc();
        System.out.println(rajdeep);
        System.out.println(rajdeep instanceof Rrc);
        System.out.println(rajdeep instanceof Object);
    }
}
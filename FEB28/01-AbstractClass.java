class Solution{
    public static abstract class Hypothetical{
        String text;
        public abstract void setText(String text);
    }
    public static class Real extends Hypothetical{
        @Override
        public void setText(String text)
        {
            this.text = text;
        }
        Real(String text)
        {
            setText(text);
        }
        @Override
        public String toString()
        {
            return text;
        }
    }
    static public void main(String args[])
    {
        Hypothetical obj = new Real("Rajdeep");
        System.out.println(obj);
    }
}
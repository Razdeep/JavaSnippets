/**
 * Expected Output:
 * 10
 * 
 * Explanation:
 * this keyword can also be called to call 
 * another parameterized constructor
 */
class Point{
    int x, y;
    public Point(){
        this(10,10);
        
    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY()
    {
        return y;
    }
    public static void main(String args[])
    {
        Point point = new Point();
        System.out.println(point.getX());
    }
}
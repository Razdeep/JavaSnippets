/**
 * Note : For creating array of objects,
 *          first, allocate the area
 *          second, create objects
 * ------------------------------------------
 */
class Circle{
    public static void main(String args[])
    {
        Circle[] circleArray = new Circle[10];
        for(int i=0; i < circleArray.length; i++)
            circleArray[i] = new Circle();
    }
}
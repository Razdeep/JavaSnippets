/**
 * ------------------
 *     Exercise
 * ------------------
 * 
 * WAP to define a class Car having attributes name, mileage and price.
 * Create 5 car objects and store them in a file named as Cars.txt
 * Write a public method void showCars(int amount) which display all the
 * cars having price less than amt.
 * 
 */
import java.io.*;
import java.util.*;
class Solution{

    public static class Car{
        String name;
        int price, mileage;
        public Car(String name, int price, int mileage)
        {
            this.name = name;
            this.price = price;
            this.mileage = mileage;
        }
    }
    static ArrayList<Car> carList = null;
    static void showCars(int amount)
    {
        for(Car this_car: carList)
        {
            if (this_car.price < amount)
                System.out.println("Name : " + this_car.name + "\tPrice : " + this_car.price + "\tMileage : " + this_car.mileage);
        }
    }
    public static void storeCars()
    {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("cars.txt");
            oos = new ObjectOutputStream(fos);
            for(Car this_car: carList)
            {
                oos.writeObject(this_car);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            if (oos != null)
                oos.close();
            if(fos != null)
                fos.close();
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        carList = new ArrayList<>();
        System.out.println("Enter number of cars you want input ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter name, price, mileage ");
            carList.add(new Car(scanner.next(), scanner.nextInt(), scanner.nextInt()));
        }
        storeCars();
        System.out.println("Enter filter amount ");
        showCars(scanner.nextInt());
    }
}
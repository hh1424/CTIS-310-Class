package edu.guilford;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {
        // System.out.println( "Hello World!");
        Scanner scan = new Scanner(System.in);

        //Instantiate a car object for a new car
        car newCar = new car("Ford", "F-150", "XLT", 2018, 
        "Truck", 30000.00, "White", "1FTFW1ET2JFA12345", 
        "5.0L V8", 0, "Automatic", "4WD", 
        "ABC123", "John Doe");

        System.out.println(newCar);

        car myCar = new car("Lincoln", "MKZ", "Reserve", 2018, 
        "Sedan", 40000.00, "Black", "1LN6L9EK2JY123456", 
        "2.0L I4", 0, "Automatic", "FWD", 
        "DEF456", "Jane Doe");

        System.out.println(myCar);

        String make = scan.nextLine();
        System.out.println("Enter car's make: ");
        String model = scan.nextLine();
        System.out.println("Enter car's model: ");
        String trim = scan.nextLine();
        System.out.println("Enter car's trim: ");
        int year = scan.nextInt();
        System.out.println("Enter car's year: ");
        String bodyStyle = scan.nextLine();
        System.out.println("Enter car's body style: ");
        double price = scan.nextDouble();
        System.out.println("Enter car's price: ");
        String color = scan.nextLine();
        System.out.println("Enter car's color: ");
        String vin = scan.nextLine();
        System.out.println("Enter car's VIN: ");
        String engine = scan.nextLine();
        System.out.println("Enter car's engine: ");
        int mileage = scan.nextInt();
        System.out.println("Enter car's mileage: ");
        String transmission = scan.nextLine();
        System.out.println("Enter car's transmission: ");
        String driveTrain = scan.nextLine();
        System.out.println("Enter car's drive train: ");
        String licensePlate = scan.nextLine();
        System.out.println("Enter car's license plate: ");
        String owner = scan.nextLine();
        System.out.println("Enter car's owner: ");
        
        car anotherNewCar = new car(make, model, trim, year, bodyStyle, 
        price, color, vin, engine, mileage, transmission, driveTrain, licensePlate, owner);

        System.out.println(anotherNewCar);



        
    }
}

/*
 * Class Name:    Car
 *
 * Author:        Julie Main
 * Creation Date: Monday, March 27 2006, 15:04 
 * Last Modified: Monday, March 27 2006, 20:43
 * 
 */

import java.util.*;

public class Car
{
    private String make;
    private String model;
    private String registration;
    private int year;
    private double originalPrice;

    public Car (String make, String model, String registration, 
                int year, double price)
    {
       this.make = make;
       this.model = model;
       this.registration = registration;
       this.year = year;
       this.originalPrice = price;
    }

    public void displayDetails()
    {
       System.out.println("Car Registration: " + registration);
       System.out.println("Make: " + make);
       System.out.println("Model: " + model);
       System.out.println("Year: " + year);
    }

    public double getPrice()
    {
       return originalPrice;
    }

    public int getYear()
    {
       return year;
    }
}


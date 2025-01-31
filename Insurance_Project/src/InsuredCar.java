/*
 * Class Name:    InsuredCar
 *
 * Author:        Julie Main
 * Creation Date: Monday, March 27 2006, 15:10 
 * Last Modified: Monday, March 27 2006, 20:44
 * 
 */

import java.util.*;

public class InsuredCar extends Car implements Insured
{
   private String driverName;
   private int driverRating;
   private int driverAge;

   public InsuredCar(String make, String model, String registration,
                     int year, double price, String name, int rating,
                     int age)
   {
      super(make, model, registration, year, price);
      driverName = name;
      driverRating = rating;
      driverAge = age;
   }

   public double getInsuranceValue(int year)
   {
      int carAge = year - getYear();
      double insuranceValue = getPrice();
      for (int i = 0; i < carAge; ++i)
      {
         insuranceValue *= 0.9;
      }
      return insuranceValue;
   }

   public double getInsurancePremium(int year)
   {
      double insurancePremium = 0.03 * getInsuranceValue(year);
      if (driverAge < 25)
      {
         insurancePremium *= 1.2;
      }
      for (int i = 1; i < driverRating; ++i)
      {
         insurancePremium *= 1.1;
      }
      return insurancePremium;
   }

   public void outputPolicyDetails(int year)
   {
      displayDetails();
      System.out.println("Driver: " + driverName);
      System.out.println("Age: " + driverAge);
      System.out.println("Rating: " + driverRating);
      System.out.println("Insurance value: " + getInsuranceValue(year));
      System.out.println("Insurance premium: " +
      getInsurancePremium(year));
   }
}


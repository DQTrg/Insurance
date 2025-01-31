/*
 * Class Name:    House
 *
 * Author:        Julie Main
 * Creation Date: Monday, March 27 2006, 15:41 
 * Last Modified: Monday, March 27 2006, 20:43
 * 
 */

import java.util.*;

public class House
{
   private String ownerName;
   private String address;
   private double houseValue;
   private int yearOfValuation;
  
   public House(String owner, String address, double value, int year)
   {
      this.ownerName = owner;
      this.address = address;
      this.houseValue = value;
      this.yearOfValuation = year;
   }

   public void displayDetails()
   {
      System.out.println("House Owner: " + ownerName);
      System.out.println("House Address: " + address);
      System.out.println("House Value: " + houseValue);
      System.out.println("Year of Valuation: " + yearOfValuation);
   }
   public double getValue()
   {
      return houseValue;
   }

   public int getYear()
   {
      return yearOfValuation;
   }
}


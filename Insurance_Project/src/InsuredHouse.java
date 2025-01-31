/*
 * Class Name:    InsuredHouse
 *
 * Author:        Julie Main
 * Creation Date: Monday, March 27 2006, 15:47 
 * Last Modified: Monday, March 27 2006, 20:44
 * 
 */

import java.util.*;

public class InsuredHouse extends House implements Insured
{
   private double contentsEstimate;
   private int ownerAge;

   public InsuredHouse(String owner, int age, String address, 
                       double houseValue, int year, double contents)
   {
      super(owner, address, houseValue, year);
      contentsEstimate = contents;
      ownerAge = age;
   }

   public double getInsuranceValue(int year)
   {
      int yearsSinceValuation = year - getYear();
      double insuranceValue = getValue();
      for (int i = 0; i < yearsSinceValuation; ++i)
      {
         insuranceValue *= 1.05;
      }
      insuranceValue += contentsEstimate;
      return insuranceValue;
   }

   public double getInsurancePremium(int year)
   {
      double premium = 0.005 * getInsuranceValue(year);
      if (ownerAge >= 65)
      {
         premium *= 0.9;
      }
      return premium;
   }

   public void outputPolicyDetails(int year)
   {
      displayDetails();
      System.out.println("Insurance value: " + getInsuranceValue(year));
      System.out.println("Insurance premium: " +
      getInsurancePremium(year));
   }
}


/*
 * Class Name:    IncomeProtection
 *
 * Author:        Julie Main
 * Creation Date: Monday, March 27 2006, 15:58 
 * Last Modified: Monday, March 27 2006, 20:45
 * 
 */

import java.util.*;

public class IncomeProtection implements Insured
{
   private String client;
   private int clientAge;
   private double currentIncome;

   public IncomeProtection(String client, int age, double income)
   {
      this.client = client;
      this.clientAge = age;
      this.currentIncome = income;
   }

   public double getInsuranceValue(int year)
   {
      int yearsToRetirement = 65 - clientAge;
      if (yearsToRetirement <= 0)
      {
         return 0;
      }
      else
      {
         return yearsToRetirement * currentIncome;
      }
   }

   public double getInsurancePremium(int year)
   {
      return getInsuranceValue(year) * 0.0001;
   }

   public void outputPolicyDetails(int year)
   {
      System.out.println("Income Protection Client: " + client);
      System.out.println("Client's age: " + clientAge);
      System.out.println("Curent Income: " + currentIncome);
      System.out.println("Insurance value: " + getInsuranceValue(year));
      System.out.println("Insurance premium: " + getInsurancePremium(year));
   }
}


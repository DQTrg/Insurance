/*
 * Class Name:    InsuranceCompany
 *
 * Author:        Julie Main
 * Creation Date: Monday, March 27 2006, 15:29 
 * Last Modified: Monday, March 27 2006, 20:45
 * 
 */

import java.util.*;

public class InsuranceCompany
{
   public static void main(String[] args)
   {
      Insured[] policies = new Insured[3];
      policies[0] = new InsuredCar("Holden", "Astra", "IPJ001", 2002, 
                                   22000, "Daisy", 2, 25);
      policies[1] = new IncomeProtection("Daisy", 25, 35000);
      policies[2] = new InsuredHouse("Daisy", 25, 
                          "1 High St, New Town", 300000, 2000, 25000);

      double insuredWorth = 0;
      double totalPremiums = 0;

      for (int i = 0; i < policies.length; ++i)
      {
         policies[i].outputPolicyDetails(2006);
         insuredWorth += policies[i].getInsuranceValue(2006);
         totalPremiums += policies[i].getInsurancePremium(2006);
         System.out.println();
      }
      System.out.println("Total insurance worth: " + insuredWorth);
      System.out.println("Total premiums paid: " + totalPremiums);
   }
}


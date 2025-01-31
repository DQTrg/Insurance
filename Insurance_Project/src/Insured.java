/*
 * Class Name:    Insured
 *
 * Author:        Julie Main
 * Creation Date: Monday, March 27 2006, 15:02 
 * Last Modified: Monday, March 27 2006, 20:42
 * 
 */

import java.util.*;

public interface Insured
{
   double getInsuranceValue(int year);
   double getInsurancePremium(int year);
   void outputPolicyDetails(int year);
}


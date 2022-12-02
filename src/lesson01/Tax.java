package lesson01;

public class Tax {
  double grossIncome;
  double tax;
  String state;
  int dependents;
  Tax(double v) {
	  grossIncome = v;
  }
  public double calcTax() {
	  if (grossIncome<50001) {
		  tax = 0.06 * grossIncome;
	  } 
	  else {
		  tax = 0.08 * grossIncome;
	  }
	return tax;
  }
  /* int taxCode = someObject.getTaxCode(grossIncome);
     switch(taxCode) { 
       case 0: 
         System.out.ptintln("Tax Exempt");
         break;
       case 1: 
         System.out.ptintln("Low Tax Bracket");
         break;
       case 2:        
         System.out.ptintln("High Tax Bracket");
         break;
       default:         
         System.out.ptintln("Wrong Tax Bracket");
     }
     calcLoanPayment(2000,60,"NY"}
   */
}

package lesson02cmd;
//import Tax;
public class TestTax {

	public static void main(String[] args) {
      System.out.println("TestTax with args[] + "
      		+ "arguments are in Run->Run Configuration->Arguments");
 // arguments are in Run->Run Configuration->Arguments
      double gi = Double.parseDouble(args[0]);
      String st = args[1];
      int dep = Integer.parseInt(args[2]);
      
      TaxPropr ct1 = new TaxPropr();
      ct1.grossIncome = gi;
      ct1.state = st;
      ct1.dep = dep;
      double yourTax = ct1.calcTax();
      ct1.mydata();
      System.out.println("Your tax is " + yourTax);
      Tax ct = new Tax(gi, st, dep);
      ct.mydata();
      System.out.println("far=33->"+Cfinal.convertFC(33));
      //Cfinal.convertFC(10);
      Homework.assignment();
	}

}

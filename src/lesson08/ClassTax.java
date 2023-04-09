package lesson08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassTax  {
  TaxS taxS = new TaxS();
  double taxCalc=0;
  FileOutputStream fOut = null;
  ObjectOutputStream oOut = null;
  
  ClassTax() {
	 System.out.print("ClassTax;");
	 taxS.gross = 40000;
	 taxS.dependents =2;
	 taxS.state = "New Jersy";
	 taxS.taxCalc=taxS.calcTax();
	 double var1 = taxS.taxCalc;
	 System.out.println(
	 "Tax for $40000 two dependents in New Jersy is "+var1
			 );
	 try {
	 //"C:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08"
		fOut = new FileOutputStream (
	   "C:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08\\NewJersyTax.ser"
				);
		oOut = new ObjectOutputStream(fOut);
		oOut.writeObject(taxS);
	 } catch (IOException e) {
		 e.printStackTrace();
	 } finally {
		 try {
			 oOut.close();
			 fOut.close();
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
  }
  
}

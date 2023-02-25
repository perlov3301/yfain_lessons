package lesson06;

public class CbikeOrder {
	String wrongParameter;
	static int MAX1 = 10;
   static void validateOrder(String bikeModel, int q)
     throws CcustomException {
	   // perform some data validation. If
	   // the quantity is too match or model is invalid
	   if (q> MAX1) {
		   
		   throw new CcustomException("Can not ship "+
				   q+" bikes of the model "+bikeModel,new ShippingErrorInfo());
	   }
   }
}

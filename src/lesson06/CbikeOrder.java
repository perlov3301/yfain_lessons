package lesson06;

public class CbikeOrder {
   static void validateOrder(String bikeModel, int q)
     throws CcustomException {
	   // perform some data validation. If 
	   // the quantity is too match or model is invalid
	   throw new CcustomException("Can not ship"+
	   q+" bikes of the model "+bikeModel);
   }
}

package lesson06;

public class CcustomException
  extends Exception{
	// declare an application-specific property
	ShippingErrorInfo shippingErrorInfo;
	
   CcustomException (String msgText,
		   ShippingErrorInfo shippingErrorInfo) {
	   super(msgText);
	   this.shippingErrorInfo = shippingErrorInfo;
   }
}

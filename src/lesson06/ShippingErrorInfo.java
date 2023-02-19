package lesson06;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShippingErrorInfo 
 {
	JLabel l;
	JTextField f;
	String messageModel = "Model is wrong";
	String messageQuantity = "Too many Bikes";
   ShippingErrorInfo(){
	   System.out.println("ShippingErrorInfo");
	   CgridbagListener instance = new CgridbagListener();
	   try {
		  l = instance.labelP;
		  l.setForeground(Color.red);
		  l.setText("see Notice");
		  f= instance.fieldInfo;
		  f.setText("");
	   } catch (Exception e) {
		   
	   }
   }
}

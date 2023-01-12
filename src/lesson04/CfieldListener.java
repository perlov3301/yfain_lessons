package lesson04;

import java.awt.*;
import javax.swing.*;

public class CfieldListener {
   JFrame frame ;
   JPanel windowContent;
   CgridKeysPanelL keys;
   JTextField field;
   // field.setBounds(50,150, 200,30); 
   CfieldListenerEngine fieldEngine;
   void createAndShowGUI(String str) {
	   frame = new JFrame(str);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setContentPane(windowContent);
	   frame.pack();
	   frame.setLocationRelativeTo(null);
	   frame.setVisible(true);
   }
   public String getDisplayValue1(){
	  String fieldvalue = field.getText();
	  return fieldvalue; 
   }
   
   public void setDisplayValue1(String value) {
	   field.setText(value);
   }
   
   CfieldListener(){
	   System.out.println("CfieldListener");
	   windowContent = new JPanel();
	   BoxLayout boxl = new BoxLayout(windowContent, BoxLayout.Y_AXIS);
	   windowContent.setLayout(boxl);
	   fieldEngine = new CfieldListenerEngine(this);
	   keys = new CgridKeysPanelL(fieldEngine);
	   windowContent.add(keys);
	   field = new JTextField();
	 // field.addActionListener(fieldEngine);;
	   windowContent.add(field);
	   javax.swing.SwingUtilities.invokeLater(new Runnable() {
		   public void run() {
			   createAndShowGUI("fieldActionListener");
		   }
	   });
//	   JFrame frame = new JFrame("CfieldListener");
//	   frame.setContentPane(windowContent);
//	   frame.pack();
//	   frame.setVisible(true);
   }
}

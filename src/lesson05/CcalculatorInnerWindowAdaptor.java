package lesson05;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import lesson04.CboxListenerEngine;
import lesson04.CgridKeysPanelL;
import lesson04.CgridbagPanelFieldS;
public class CcalculatorInnerWindowAdaptor  {
	 JFrame frame;
	   JPanel panel;
	   CgridKeysPanelL keys;
	   CgridbagPanelFieldS field;
	   CboxListenerEngine boxEngine;
   CcalculatorInnerWindowAdaptor(){
	  
	  
   }//constructor
   void createAndShowGUI(String str) {
	   frame = new JFrame(str);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setContentPane(panel);
	   frame.pack();
	 //  frame.setLocationRelativeTo(null);
	   frame.setVisible(true);
	   frame.addWindowListener(
			   new java.awt.event.WindowAdapter() {
				   public void windowClosing(WindowEvent e) {
					   System.exit(0);
				   }
			   });
   }
}

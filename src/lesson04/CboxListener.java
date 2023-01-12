package lesson04;
import java.awt.*;
import javax.swing.*;

public class CboxListener {
   JFrame frame;
   JPanel windowContent;
   CgridKeysPanelL keys;
   CgridbagPanelFieldS field;
   CboxListenerEngine boxEngine;
   
   void createAndShowGUI(String str) {
	   frame = new JFrame(str);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setContentPane(windowContent);
	   frame.pack();
	   frame.setLocationRelativeTo(null);
	   frame.setVisible(true);
   }
   public String getDisplayValue1() {
	   String fieldValue = CgridbagPanelFieldS.getFieldValue();
	   return fieldValue;
   }
   void setDisplayValue1(String value) {
	   CgridbagPanelFieldS.setFieldValue(value);
   }
   CboxListener() {
	   System.out.println("CboxListener Calc");
	   windowContent = new JPanel();
	   BoxLayout boxL = new BoxLayout(windowContent, BoxLayout.Y_AXIS);
	   windowContent.setLayout(boxL);
	   boxEngine = new CboxListenerEngine(this);
	   keys = new CgridKeysPanelL(boxEngine);
	   windowContent.add(keys);
	   field = new CgridbagPanelFieldS();
	   windowContent.add(field);
	   javax.swing.SwingUtilities.invokeLater(new Runnable() {
		   public void run() {
			   createAndShowGUI("CboxListener with CgridbagPanelField");
		   }
	   });
	   
   }
}

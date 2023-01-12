package lesson04;
import java.awt.*;
import javax.swing.*;

public class CgridbagListener {
   JFrame frame;
   JPanel windowContent;
   CgridKeysPanelL keys;
   CgridbagPanelFieldS field;
   CgridbagListenerEngine gridbagEngine;
   
   void createAndShowGUI(String str) {
	   frame = new JFrame(str);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setContentPane(windowContent);
	   frame.pack();
	   frame.setLocationRelativeTo(null);
	   frame.setVisible(true);
   }
   String getDisplayValue1() {
	   String fieldValue = CgridbagPanelFieldS.getFieldValue();
	   return fieldValue;
   }
   void setDisplayValue1(String value) {
	   CgridbagPanelFieldS.setFieldValue(value);
   }
   CgridbagListener() {
	   System.out.println("CgridbagListener Calc HomeWork");
	   windowContent = new JPanel();
	   GridBagLayout gb = new GridBagLayout();
	   windowContent.setLayout(gb);
	   gridbagEngine = new CgridbagListenerEngine(this);
	   keys = new CgridKeysPanelL(gridbagEngine);
	   windowContent.add(keys);
	   field = new CgridbagPanelFieldS();
	   windowContent.add(field);
	   javax.swing.SwingUtilities.invokeLater(new Runnable() {
		   public void run() {
			   createAndShowGUI("CgridbagListener with CgridbagPanelField");
		   }
	   });
   }
}

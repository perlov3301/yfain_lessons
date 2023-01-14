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
	   GridBagConstraints constr = new GridBagConstraints();
	   // constr.fill =  constr.BOTH;// horiz&verti
	   constr.fill = GridBagConstraints.HORIZONTAL;
	   constr.weightx = 1.0;// proportion of horizontal space
	   constr.weighty = 1.0;// proportion of vertical space
	   // prepare set of constraints for displayField
	   constr.gridx = 0; // x number(coordinate) of the cell
	   constr.gridy = 0; // y coordinate of the cell
	   constr.gridheight = 1;// the same height as height of others
	   constr.gridwidth = 6; // is wide as 6 others
	   constr.anchor = constr.CENTER; // position within the cell
	   field = new CgridbagPanelFieldS();
	   windowContent.add(field);
	   
	   gridbagEngine = new CgridbagListenerEngine(this);
	   keys = new CgridKeysPanelL(gridbagEngine);
	   
	   windowContent.add(keys);
	   
	   javax.swing.SwingUtilities.invokeLater(new Runnable() {
		   public void run() {
			   createAndShowGUI("CgridbagListener Homework CgridbagPanelField");
		   }
	   });
   }
}

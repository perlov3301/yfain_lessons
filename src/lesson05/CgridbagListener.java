package lesson05;

import java.awt.*;
import javax.swing.*;
import java.awt.event.WindowEvent;

public class CgridbagListener {
   private JFrame frame;
   CgridKeysPanelL keys;
   JButton button;
   CgridbagListener engine;
   JTextField field;
   CswingAdapt mw;
   
   void createAndShowGUI(String str) {
		 // create and set up the window.
		 frame = new JFrame(str);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // set up the content pane.
		 addComponentsToPane(frame.getContentPane());
		 //display the window.
		 frame.pack();
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
   }
   void addComponentsToPane(Container pane) {
	   pane.setLayout(new GridBagLayout());
	   CgridbagListenerEngine engine = new CgridbagListenerEngine(this);
	   GridBagConstraints c = new GridBagConstraints();
	   c.fill = GridBagConstraints.HORIZONTAL;
	   c.weightx = 0.5;
	   
	   button = new JButton(" + ");
	   c.gridx = 0;
	   c.gridy = 0;
	   c.insets = new Insets(3,3,3,3);
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   button = new JButton(" - ");
	   c.gridx = 1;
	   c.gridy = 0;
	   c.insets = new Insets(3,3,3,3);
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   button = new JButton(" = ");
	   c.ipady = 30;
	   c.gridx = 2;
	   c.gridy = 0;
	   c.insets = new Insets(3,3,3,3);
	   button.addActionListener(engine);
	   pane.add(button, c);
	   c.ipady = 0;
	   
	   field = new JTextField("");
	   c.gridx = 0;
	   c.gridy = 1;
	   c.gridwidth = 3;
	   pane.add(field, c);
	   
	   keys = new CgridKeysPanelL(engine);
	   c.gridx = 0;
	   c.gridy = 2;
	   c.gridwidth = 3;
	   pane.add(keys, c);
   }
   String getDisplayValue1() {
	   String fieldValue = field.getText();
	   return fieldValue;
   }
   void setDislayValue1(String value) {
	   field.setText(value);
   }
   CgridbagListener() {
	   System.out.println("HomeWork");
	   mw = new CswingAdapt();
	   this.addWindowListener(mw);
	   SwingUtilities.invokeLater(new Runnable() {
		   public void run() {
			   createAndShowGUI("HomeWork");
		   }
	   });
   }
}

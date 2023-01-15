package lesson04;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CgridbagDemoCustom {
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	JButton button;
	CgridKeysPanelL keys;
	private JTextField field;
	 void addComponentsToPane(Container pane) {
	
		if (RIGHT_TO_LEFT) { pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		pane.setLayout(new GridBagLayout());
		CgridbagCustomEngine engine = new CgridbagCustomEngine(this);
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) { // natural height, maximum width
			c.fill = GridBagConstraints.HORIZONTAL;
		}
		if (shouldWeightX) { c.weightx = 0.5; }
		
			button = new JButton("Button 1");
			//c.fill = GridBagConstraints.HORIZONTAL;
			c.gridx = 0;
			c.gridy = 0;
			c.insets = new Insets(3,3,3,3); //  padding
			button.addActionListener(engine);
			pane.add(button, c);
			
			button = new JButton("Button 2");
			//c.fill = GridBagConstraints.HORIZONTAL;
			// c.weightx = 0.5;
			c.gridx = 1;
			c.gridy = 0;
			button.addActionListener(engine);
			pane.add(button, c);
			
			button = new JButton("Button 3");
			//c.fill = GridBagConstraints.HORIZONTAL;
			//c.weightx = 0.5;
			c.gridx = 2;
			c.gridy = 0;
			button.addActionListener(engine);
			pane.add(button, c);
			
			button = new JButton("   =   ");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.ipady = 40; // make this component tall
			c.insets = new Insets(3,3,3,3); // top padding
		//	c.weightx = 0.;
			//c.weighty = 1;
            //c.gridheight = 2;
			c.gridwidth = 3;
			c.gridx = 0;
			c.gridy = 1;
			button.addActionListener(engine);
			pane.add(button,c);
			
			button = new JButton("  add  ");
			//c.fill = GridBagConstraints.HORIZONTAL;
			c.ipady = 0;// reset to default
			//c.weighty = 1; // request any extra vertical space
			c.anchor = GridBagConstraints.PAGE_END; // bottom of space
			c.insets = new Insets(3,3,3,3); // top padding
			c.gridx = 1; // aligned with button 2
			c.gridy = 2;
			c.gridwidth = 2; // to columns  wide
			button.addActionListener(engine);
			pane.add(button, c);
			
			field = new JTextField("");
			c.gridx = 0;
			c.gridy = 3;
			c.gridwidth = 3;
			pane.add(field, c);
			
			keys = new CgridKeysPanelL(engine);
			c.gridx = 0;
			c.gridy = 4;
			c.gridwidth = 3;
			pane.add(keys, c);
	}
	 String getDisplayValue1() {
		 String fieldValue = field.getText();
		 return fieldValue;
	 }
	 void setDisplayValue1(String value) {
		 field.setText(value);
	 }
	/**
	 * Create the GUI and show it. For thread safety,
	 * this method should be invoked from the
	 * event-dispatching thread.
	 */
	 private  void createAndShowGUI() {
		 // create and set up the window.
		 JFrame frame = new JFrame("GridBagLayoutDemo custom");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // set up the content pane.
		 addComponentsToPane(frame.getContentPane());
		 //display the window.
		 frame.pack();
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
	 }
	 CgridbagDemoCustom() {
		 System.out.println("CgridbagDemoCustom");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {
               createAndShowGUI();				
			}});
	 }
// end of class
}

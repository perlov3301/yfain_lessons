package lesson04;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CgridbagDemoCustom {
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	
	static void addComponentsToPane(Container pane) {
		JButton button;
		if (RIGHT_TO_LEFT) { pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		pane.setLayout(new GridBagLayout());
		
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
			pane.add(button, c);
			
			button = new JButton("Button 2");
			//c.fill = GridBagConstraints.HORIZONTAL;
			// c.weightx = 0.5;
			c.gridx = 1;
			c.gridy = 0;
			pane.add(button, c);
			
			button = new JButton("Button 3");
			//c.fill = GridBagConstraints.HORIZONTAL;
			//c.weightx = 0.5;
			c.gridx = 2;
			c.gridy = 0;
			pane.add(button, c);
			
			button = new JButton("Long-Named Button 4");
			c.fill = GridBagConstraints.HORIZONTAL;
			c.ipady = 40; // make this component tall
			c.insets = new Insets(3,3,3,3); // top padding
		//	c.weightx = 0.;
			//c.weighty = 1;
            //c.gridheight = 2;
			c.gridwidth = 3;
			c.gridx = 0;
			c.gridy = 1;
			pane.add(button,c);
			
			button = new JButton("5");
			//c.fill = GridBagConstraints.HORIZONTAL;
			c.ipady = 0;// reset to default
			//c.weighty = 1; // request any extra vertical space
			c.anchor = GridBagConstraints.PAGE_END; // bottom of space
			c.insets = new Insets(3,3,3,3); // top padding
			c.gridx = 1; // aligned with button 2
			c.gridy = 2;
			c.gridwidth = 2; // to columns  wide
			pane.add(button, c);
	}
	/**
	 * Create the GUI and show it. For thread safety,
	 * this method should be invoked from the
	 * event-dispatching thread.
	 */
	 private static void createAndShowGUI() {
		 // create and set up the window.
		 JFrame frame = new JFrame("GridBagLayoutDemo custom");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // set up the content pane.
		 addComponentsToPane(frame.getContentPane());
		 //display the window.
		 frame.pack();
		// frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
	 }
	 CgridbagDemoCustom() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {
               createAndShowGUI();				
			}});
	 }
// end of class
}

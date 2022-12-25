package lesson04;

import java.awt.*;
import javax.swing.*;

public class CborderDemoContainer  {
	static boolean RIGHT_TO_LEFT = false;
	static void addComponentsToPane(Container pane) {
		if (!(pane.getLayout() instanceof BorderLayout)) {
			pane.add(new JLabel("Container doesn't use BorderLayout"));
		}
		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(
				java.awt.ComponentOrientation.RIGHT_TO_LEFT);
		}
		JButton button = new JButton("Button 1 (Page_START");
		pane.add(button, BorderLayout.PAGE_START);
		//Make the center component big
		button = new JButton("Button 2 (CENTER)");
		button.setPreferredSize(new Dimension(200, 100));
		pane.add(button, BorderLayout.CENTER);
		
		button = new JButton("Button 3 (Line_START)");
		pane.add(button, BorderLayout.LINE_START);
		
		button = new JButton("Long-Named Button 4 (PAGE_END)");
		pane.add(button, BorderLayout.PAGE_END);
		
		button = new JButton("5 (LINE_END)");
		pane.add(button, BorderLayout.LINE_END);
		// create GUI. For safety, this method should be 
		// invoked from the event dispatch thread
	}
	private static void createAndShowGUI() {
		// create and set up the window
		JFrame frame = new JFrame("BorderLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set up the content pane
		addComponentsToPane(frame.getContentPane());
		//use the content pane's default BorderLayout
		frame.pack();
		frame.setVisible(true);
	}
	CborderDemoContainer() {
	   // schedule a job for the event dispatch trhread:
	   // creating and showing this app's GUI
		javax.swing.SwingUtilities.invokeLater(
		    new Runnable() {
		    	public void run() {
		    		createAndShowGUI();
		    	}
		      });
	}
}

package lesson04;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CborderCalcDemo {
	static boolean RIGHT_TO_LEFT = false;
	static void addComponentsToPane(Container pane) {
		if (!(pane.getLayout() instanceof BorderLayout)) {
			pane.add(new JLabel("Container doesn't use BorderLayout"));
		}
		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(
				java.awt.ComponentOrientation.RIGHT_TO_LEFT);
		}
		pane.add(new CgridFieldsPanel(), BorderLayout.NORTH);
		pane.add(new CgridKeysPanel(), BorderLayout.CENTER);
		
	}
	private static void createAndShowGUI() {
		// create and set up the window
		JFrame frame = new JFrame("BorderLayout Calc Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set up the content pane
		addComponentsToPane(frame.getContentPane());
		//use the content pane's default BorderLayout
		frame.pack();
		 frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	CborderCalcDemo() {
		System.out.println("CborderCalcDemo frame");
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

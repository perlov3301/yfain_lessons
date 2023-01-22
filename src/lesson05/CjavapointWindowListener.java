package lesson05;

import java.awt.Frame;
import java.awt.event.*;

public class CjavapointWindowListener extends Frame implements
 WindowListener{
	CjavapointWindowListener(){
		addWindowListener(this);
		setSize(404, 404);
		setLayout(null);
		setVisible(true);
	}

	
	public void windowOpened(WindowEvent e) {
		System.out.println("CjavapointWindowListener is opened");
		
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("CjavapointWindowListener is closing");
		dispose();
		
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("CjavapointWindowListener is closed");
		
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("CjavapointWindowListener is iconified");
		
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("CjavapointWindowListener is deiconified");
		
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("CjavapointWindowListener is activated");
		
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("CjavapointWindowListener is deactivated");
		
	}

}

package lesson05;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CwindowListener implements WindowListener{
	CgridbagListener parent;
	CwindowListener(CgridbagListener parent) {
		this.parent = parent;
	}

	public void windowOpened(WindowEvent e) {
	   System.out.println("CwindowListener is opened");
		
	}

	public void windowClosing(WindowEvent e) {
		 System.out.println("CwindowListener is closing");
		 //JFrame f= parent.frame;
		 int a = JOptionPane.showConfirmDialog(parent.frame, "are You sure");
		 if(a == JOptionPane.YES_OPTION) {
			parent.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 }
		
	}

	public void windowClosed(WindowEvent e) {
		 System.out.println("CwindowListener is closed");
		
	}

	public void windowIconified(WindowEvent e) {
		 System.out.println("CwindowListener is iconified");
		
	}

	public void windowDeiconified(WindowEvent e) {
		 System.out.println("CwindowListener is deiconified");
		
	}

	public void windowActivated(WindowEvent e) {
		 System.out.println("CwindowListener is activated");
		
	}

	public void windowDeactivated(WindowEvent e) {
		 System.out.println("CwindowListener is deactivated");
		
	}

}

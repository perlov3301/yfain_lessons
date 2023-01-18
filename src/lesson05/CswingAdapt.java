package lesson05;
import java.awt.event.*;

class CswingAdapt extends java.awt.event.WindowAdapter {
	/*    interface WindowListener include methods:
	 windowActivated(WindowEvent)
	 windowClosed(WindowEvent)
	 windowClosing(WindowEvent)
	 windowDeactivated(WindowEvent)
	 windowDeiconified(WindowEvent)
	 windowIconified(WindowEvent)
	 windowOpened(WindowEvent)
	 */
	// WindowAdapter is trick to decrease amount of code
	// overriding windowClosing method only
	public void windowClosing(WindowEvent e) {
		System.out.println("CswingAdapt windowClosing");
	}
	CswingAdapt() {
		
	}

}

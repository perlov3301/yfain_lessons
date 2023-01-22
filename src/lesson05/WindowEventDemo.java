package lesson05;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WindowEventDemo extends JFrame 
  implements WindowListener, WindowFocusListener,
             WindowStateListener {
	static WindowEventDemo frame = new WindowEventDemo("WindowEventDemo");
	JTextArea display;
	WindowEventDemo(String name){
		super(name);
		System.out.println("WindowEventDemo");

	}
	private void addComponentsToPane() {
		display = new JTextArea();
		display.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(display);
		scrollPane.setPreferredSize(new Dimension(500, 450));
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		addWindowListener(this);
		addWindowFocusListener(this);
		addWindowStateListener(this);
		
		checkWM();
	}
	String converStateToString(int state) {
		if (state == Frame.NORMAL) { return "NORMAL";}
		String strState = " ";
		if ((state&Frame.ICONIFIED) != 0) { strState += "ICONIFIED"; }
		if ((state&Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH) {
			strState += "MAXIMIZED_BOTH";
		} else {
			if ((state & Frame.MAXIMIZED_VERT) != 0) {
				strState += "MAXIMIZED_VERT";
			}
		if ((state & Frame.MAXIMIZED_HORIZ) != 0) {
			strState += "MAXIMIZED_HORIZ";
		}
		if(" ".equals(strState)) { strState = "UNKNOWN"; }
		}
		return strState.trim(); 
	}
		
    void displayMessage(String msg) {
    	display.append(msg + "\r\n");
    }
    void displayStateMessage(String prefix, WindowEvent e) {
    	int state = e.getNewState();
    	int oldState = e.getOldState();
    	String msg = prefix 
    			+ "\r\n" + " " 
    			+ "New state: "
    		    + converStateToString(state)
    		    + "\r\n" + " "
    		    + "Old state: ="
    		    + converStateToString(oldState);
    }
	void checkWM() {
		Toolkit tk = frame.getToolkit();
		if(!(tk.isFrameStateSupported(Frame.ICONIFIED))) {
			displayMessage("Your window Manager does'nt support");
		}
	}
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
    
}

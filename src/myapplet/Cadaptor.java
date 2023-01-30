package myapplet;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cadaptor extends WindowAdapter {
	CgridbagListener parent;

	Cadaptor(CgridbagListener parent) {
		this.parent = parent;
	}
   public void windowClosing(WindowEvent e) {
	   //String s = JOptionPane.showInputDialog(parent, e);
	   
	   System.out.println("Cadaptor: the frame is closing ");
	   int a = JOptionPane.showConfirmDialog(parent.frame, "are You sure");
		 if(a == JOptionPane.YES_OPTION) {
			parent.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 }
	   
   }
//	public void windowDeactivated(WindowEvent e) {
//		 System.out.println("Cadaptor: CgridbagListener is deactivated");
//		
//	}
}

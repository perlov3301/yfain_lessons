package lesson04;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CbuttonListener {
   JFrame frame;
   JPanel windowContent;
   JButton button0 ;
   JButton button1;
   JButton button2;
   JButton button3;
   JLabel label;
   JTextField field;
   CbuttonListenerEngine buttonEngine;
   void createAndShowGUI(String str) {
	   frame = new JFrame(str);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setContentPane(windowContent);
	   frame.pack();
	   frame.setVisible(true);
   }
   JButton createB(String s) {
	   JButton jb = new JButton(s);
	   jb.addActionListener(buttonEngine);
	   jb.setAlignmentX(windowContent.CENTER_ALIGNMENT);
//	   windowContent.add(jb);
	   return jb;
   }
   CbuttonListener(){
	   System.out.println("CbuttonListener");
	   windowContent = new JPanel();
		BoxLayout boxl = new BoxLayout(windowContent, BoxLayout.Y_AXIS);
	    windowContent.setLayout(boxl);
	    buttonEngine = new CbuttonListenerEngine(this); 
	    
	    windowContent.add(createB("button0"));
	    windowContent.add(createB("button1"));
	    windowContent.add(createB("button2"));
	    windowContent.add(createB("button3"));

	    label = new JLabel("label");
//	    label.setBounds(100, 100, 100, 20);
	    windowContent.add(label);
	    
	    field = new JTextField("field");
	    // field.setBounds(100, 100, 100, 100);
	    // field.setBounds(Rectangle);
	    windowContent.add(field);
	   javax.swing.SwingUtilities.invokeLater(new Runnable() {
		   public void run() {
			   createAndShowGUI("buttonActionListener");
		   }
	   });
   }
   
   
}

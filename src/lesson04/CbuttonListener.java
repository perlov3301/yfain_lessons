package lesson04;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class CbuttonListener {
	ClistenerEngine calcEngine;;
	
   JButton button0 = new JButton("button0");
   JButton button1 = new JButton("button1");
   JButton button2 = new JButton("button2");
   CbuttonListener(){
	   System.out.println("CbuttonListener");
	   calcEngine = new ClistenerEngine(this);
	   JPanel windowContent = new JPanel();
		GridLayout gl = new GridLayout(3,1);
	    windowContent.setLayout(gl);
	    windowContent.add(button0);
	    windowContent.add(button1);
	    windowContent.add(button2);
	   button0.addActionListener(calcEngine);
	   button1.addActionListener(calcEngine);
	   button2.addActionListener(calcEngine);

	   JFrame frame = new JFrame("test of  buttonActionListener");
	   frame.setContentPane(windowContent);
	   frame.setSize(300, 300);
	   frame.setVisible(true);
   }
   
   
}

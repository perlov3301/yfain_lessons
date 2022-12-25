package lesson04;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CgridFieldsPanel extends JPanel {
   CgridFieldsPanel(){
	   RoundBtn vbtnR = new RoundBtn(10);
	   
		   System.out.println("Cfield Panel");
		// 1.create a panel
	     //  JPanel windowContent = new JPanel();
	   	// 2. set  a layout manager for this panel
	   	// FlowLayout f1 = new FlowLayout();
	       GridLayout gl = new GridLayout(4,2);
	   	this.setLayout(gl);
	   	// 3. create controls in memory
	   	JLabel label1 = new JLabel("   Number 1:");
	   	JTextField field1 = new JTextField(10);
	   	JLabel label2 = new JLabel("   Number 2:");
	   	JTextField field2 = new JTextField(10);
	   	JLabel label3 = new JLabel("   Sum:");
	   	JTextField result = new JTextField(10);
	   	JButton go = new JButton("Add");
	   	//go.setBounds(60,80,100,30);
	   	go.setBorder(new RoundBtn(10));
	   	// 4. Add controls to the panel
	   	this.add(label1);
	   	this.add(field1);
	   	this.add(label2);
	   	this.add(field2);
	   	this.add(label3);
	   	this.add(result);
	   	this.add(go);
   }
}

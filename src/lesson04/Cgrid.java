package lesson04;
import java.awt.GridLayout;
import javax.swing.*;

public class Cgrid {
	RoundBtn vbtnR = new RoundBtn(10);
   Cgrid() {
	   System.out.println("Cgrid jframe");
	// 1.create a panel
       JPanel windowContent = new JPanel();
   	// 2. set  a layout manager for this panel
   	// FlowLayout f1 = new FlowLayout();
       GridLayout gl = new GridLayout(4,2);
   	windowContent.setLayout(gl);
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
   	windowContent.add(label1);
   	windowContent.add(field1);
   	windowContent.add(label2);
   	windowContent.add(field2);
   	windowContent.add(label3);
   	windowContent.add(result);
   	windowContent.add(go);
   	// 5. Create the frame and add panel to it
   	JFrame frame = new JFrame("gridLayout Calculator");
   	// 6. Add the panel to top-level container
   	frame.setContentPane(windowContent);
   	// set the size and make the window visible
   	frame.setSize(400, 150);
   	frame.setResizable(false);
   	frame.setVisible(true);
	    
   }
}

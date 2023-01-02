package lesson04;
import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalculatorGrid {
   SimpleCalculatorGrid() {
	   JPanel windowContent = new JPanel();
	   // set the layout manager for the panel
	   GridLayout gl = new GridLayout(4,2);
	   windowContent.setLayout(gl);
	   
	   JLabel label1 = new JLabel("  Number 1:");
	   JTextField field1 = new JTextField(10);
	   JLabel label2 = new JLabel("  Number 2:");
	   JTextField field2 = new JTextField(10);
	   JLabel label3 = new JLabel("  Sum:");
	   JTextField result = new JTextField(10);
	   JButton go = new JButton("Add");
	   // Add controls to the panel
	   windowContent.add(label1);
	   windowContent.add(field1);
	   windowContent.add(label2);
	   windowContent.add(field2);  
	   windowContent.add(label3);
	   windowContent.add(result);
	   go.setBorder(new RoundBtn(10));
	   windowContent.add(go);
	   
	   JFrame frame = new JFrame("simpleCalculatorGrid");
	   frame.setContentPane(windowContent);
	   frame.setSize(380, 220);
	   frame.setVisible(true);
   }
}

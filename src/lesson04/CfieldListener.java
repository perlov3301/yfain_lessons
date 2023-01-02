package lesson04;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CfieldListener {
   ClistenerEngine  calcEngine = new ClistenerEngine(this);
   private JLabel label1 = new JLabel("Number 1");
   private JTextField displayField1 = new JTextField(10);
   private JLabel label2 = new JLabel("Number 2");
   private JTextField displayField2 = new JTextField(10);
   private JLabel label3 = new JLabel("Sum");
   private JTextField result = new JTextField(10);
   JButton go = new JButton("Add");
   JButton reset = new JButton("Reset");

   // field.setBounds(50,150, 200,30); 
   public String getDisplayValue1(){
	   String fieldvalue = displayField1.getText();
	  return fieldvalue; 
   }
   public String getDisplayValue2(){
	   String fieldvalue = displayField2.getText();
	  return fieldvalue; 
   }
   
   public void setDisplayValue1(String value) {
	   displayField1.setText(value);
   }
   public void setDisplayValue2(String value) {
	   displayField2.setText(value);
   }
   public void setDisplayValueResult(String value) {
	   result.setText(value);
   }
   CfieldListener(){
	   System.out.println("CfieldListener");
	   RoundBtn vbtnR = new RoundBtn(10);
	   JPanel windowContent = new JPanel();
	   GridLayout gl = new GridLayout(4,2);
	   windowContent.setLayout(gl);
	   
	   windowContent.add(label1);
	   windowContent.add(displayField1);
	   windowContent.add(label2);
	   windowContent.add(displayField2);
	   windowContent.add(label3);
	   windowContent.add(result);
	   	go.setBorder(new RoundBtn(10));
	   windowContent.add(go);
	   	reset.setBorder(new RoundBtn(10));
	   windowContent.add(reset);
	   displayField1.addActionListener(calcEngine);
	   displayField2.addActionListener(calcEngine);
	   result.addActionListener(calcEngine);
	   JFrame frame = new JFrame("test of fieldListener");
	   frame.setContentPane(windowContent);
	   frame.setSize(330,220);
	   frame.setVisible(true);
   }
}

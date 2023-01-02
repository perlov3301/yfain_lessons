package lesson04;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Calculator {
// Declare all calculator's components.
	JPanel windowContent;
	private JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JPanel pl;
	public void setDisplayValue(String val) {
		displayField.setText(val);
	}
	public String getDisplayValue() {
		return displayField.getText();
	}
	Calculator(){
		windowContent = new JPanel();
		// set the layout manager for panel
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		// create the display at north area of the window
		displayField = new JTextField(30);
		windowContent.add("North", displayField);
		// create buttons that takes label as parameter
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
		// create a Panel included buttons
		pl = new JPanel();
		GridLayout gl =  new GridLayout(4,3);
		pl.setLayout(gl);
		pl.add(button1);
		pl.add(button2);
		pl.add(button3);
		pl.add(button4);
		pl.add(button5);
		pl.add(button6);
		pl.add(button7);
		pl.add(button8);
		pl.add(button9);
		pl.add(button0);
		pl.add(buttonPoint);
		pl.add(buttonEqual);
		
		CalculatorEngine calcEngine = new CalculatorEngine(this);
		button0.addActionListener(calcEngine);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);
		button5.addActionListener(calcEngine);
		button6.addActionListener(calcEngine);
		button7.addActionListener(calcEngine);
		button8.addActionListener(calcEngine);
		button9.addActionListener(calcEngine);
		buttonPoint.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);

		windowContent.add("Center", pl);
		JFrame frame = new JFrame("Calculator");
//		frame.setSize(400, 200);
		frame.setContentPane(windowContent);
		// set the size of the window to accommodate controls
		frame.pack();
		frame.setVisible(true);
	}
}

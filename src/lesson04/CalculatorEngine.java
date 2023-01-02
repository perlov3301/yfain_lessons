package lesson04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 class CalculatorEngine implements ActionListener {
	 Calculator parent; // reference to the Calculator
	// constructor stores the reference to window 
   CalculatorEngine(Calculator parent){
	   this.parent = parent;
   }
	
	public void actionPerformed(ActionEvent e) {
		// get source of this action
		JButton clickButton=(JButton)  e.getSource();
		// the existing text from the Calculator's Field
		String dispFieldText = parent.getDisplayValue();
		// get the button's Label
		String clickedButtonLabel = clickButton.getText();
		//add the button's Label to existing Text
		parent.setDisplayValue(dispFieldText+clickedButtonLabel);
		
//		JOptionPane.showConfirmDialog(null, 
//			"You pressed " + clickedButtonLabel,
//			"Just a test ", JOptionPane.PLAIN_MESSAGE);
	}
}

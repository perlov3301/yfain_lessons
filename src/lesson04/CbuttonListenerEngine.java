package lesson04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CbuttonListenerEngine   
   implements ActionListener {
	
	CbuttonListener parent;
	CbuttonListenerEngine(CbuttonListener parent) {
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton clickButton = (JButton) e.getSource();
		String btxt = clickButton.getText();
		System.out.println("clicked  "+btxt);
		parent.label.setText(btxt);
		parent.field.setText(btxt);
		if (e.getSource() == parent.button0) {
			parent.label.setText("button0");
			parent.field.setText("button0");
		}
	}

}

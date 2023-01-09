package lesson04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CfieldListenerEngine implements ActionListener {
	CfieldListener parent;
	 CfieldListenerEngine(CfieldListener parent){
		  this.parent = parent;
	   }
		
		public void actionPerformed(ActionEvent e) {
			// get source of this action
			JButton clickButton=(JButton)  e.getSource();
			String fieldText = parent.getDisplayValue1();
			// button's label
			String buttonLabel = clickButton.getText();
			buttonLabel = buttonLabel.replaceAll("\\s", "");
			// add to existing Text
			String vset = fieldText + buttonLabel;
			parent.setDisplayValue1(vset);
			System.out.println("recent:"+fieldText+" click:"+buttonLabel+"="+ vset);
		}
}

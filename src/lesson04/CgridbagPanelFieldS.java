package lesson04;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CgridbagPanelFieldS extends JPanel {
	static JTextField displayField;
	static String getFieldValue() {
		return displayField.getText();
	}
	static void setFieldValue(String value) {
		displayField.setText(value);
	}
  CgridbagPanelFieldS() {
	  System.out.println("CgridBagPanelS get set");
		GridBagLayout gb = new GridBagLayout();
		this.setLayout(gb);
		// create an instance of the GridBagConstraints and repeat
		// this line for each component that you'd like to add 
		GridBagConstraints constr = new GridBagConstraints();
		// prepare set of constraints for displyField
		constr.gridx=0;// x number(coordinate) of the cell
		constr.gridy=0;// y number of the cell
		constr.gridheight = 1;// the same height height as others
		constr.gridwidth = 6;// is as wide as 6 others
		// fill all space in the cell
		constr.fill = constr.BOTH;// fill all space within
		constr.weightx = 1.0;// proportion of horizontal space 
		constr.weighty = 1.0;// proportion of vertical space
		constr.anchor = constr.CENTER;//position within the cell
		
		displayField = new JTextField();
		gb.setConstraints(displayField,constr);	//assign set constraints 
		this.add(displayField);
  }
}

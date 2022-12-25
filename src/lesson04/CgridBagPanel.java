package lesson04;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CgridBagPanel extends JPanel  {
	
	CgridBagPanel(){
		System.out.println("CgridBagContstraints jpanel");
		GridBagLayout gb = new GridBagLayout();
		this.setLayout(gb);
		
		GridBagConstraints constr = new GridBagConstraints();
		// prepare set constraints for displyField
		constr.gridx=0;// x number(coordinate) of the cell
		constr.gridy=0;// y number of the cell
		// this cell has the same height height as others
		constr.gridheight = 1;
		// this cell is as wide as 6 others
		constr.gridwidth = 6;
		// fill all space in the cell
		constr.fill = constr.BOTH;
		// proportion of horizontal space taken by the component
		constr.weightx = 1.0;
		// proportion of vertical space taken by the component
		constr.weighty = 1.0;
		// position of the component within the cell
		constr.anchor = constr.CENTER;
		
		JTextField displayField = new JTextField();
		//set constraints for textField=assign
		gb.setConstraints(displayField,constr);
		this.add(displayField);
	}

}

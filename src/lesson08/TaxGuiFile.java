package lesson08;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TaxGuiFile extends JFrame 
  implements ActionListener  {
  JLabel lblGrIncome;
  JTextField txtGrossIncome = new JTextField(15);
  JLabel lblDependents = new JLabel("Number of Dependents:");
  JTextField txtDependents = new JTextField(2);
  JLabel lblState = new JLabel("State: ");
  
  // define a data model for the ComboBox chState
  Vector states = new Vector(50);
  
  // create a combo_box to get data from the model
  JComboBox chState = new JComboBox(states);
  JLabel lblTax = new JLabel("State Tax: ");
  JTextField txtStateTax = new JTextField(10);
  JButton bGo = new JButton("Go");
  JButton bReset = new JButton("Reset");
  
  TaxGuiFile(){
	  lblGrIncome = new JLabel("Gross Income: ");
	  this.setTitle("TaxGuiFile");
	  GridLayout gr = new GridLayout(5,2,1,1);
	  setLayout(gr);
	  
	  add(lblGrIncome);
	  add(txtGrossIncome);
	  add(lblDependents);
	  add(txtDependents);
	  add(lblState);
	  add(chState);
	  add(lblTax);
	  add(txtStateTax);
	  add(bGo);
	  add(bReset);
	   
	  populateStates();
	  chState.setSelectedIndex(0);
	  txtStateTax.setEditable(false);
	  
	  bGo.addActionListener(this);
	  bReset.addActionListener(this);
	  
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// define, instanjtiate and register a WindowAdapter
	// to process windowClosing Event of this frame
	  /**
	   this.addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent e) {
			  System.out.println("by by");
			  System.exit(0);
		  }});
	   */
	  
	  pack();
	  setLocationRelativeTo(null);
	  setVisible(true);
  }
 // the code below will read file states.txt and //
 // populate the dropdown chStates
private void populateStates() {
	states.add("Select State");
	FileInputStream myFile = null;
	File file = null;
	InputStreamReader inputStreamReader;
	BufferedReader reader= null;
	try {
		file = MyFile.filestates();
		myFile = new FileInputStream(file);
		inputStreamReader = 
				new InputStreamReader(myFile, "UTF8");
		reader = new BufferedReader(inputStreamReader);
		String nextLine;
		boolean eof = false;
		while (!eof) {
			nextLine = reader.readLine();
			if (nextLine == null) {
				eof = true;
			} else { // populate the model
				states.add(nextLine);
			}
		}
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	} catch (IOException e2) {
		e2.printStackTrace();
		txtStateTax.setText("Can't read states.txt");
	}
	finally {
		if (myFile!=null) {
			try {
                reader.close();
				myFile.close();
			} catch(Exception e3) {
				e3.printStackTrace();
			}
		}
	}
}
@Override
public void actionPerformed(ActionEvent evt) {
  Object source = evt.getSource();	
  if (source == bGo) {
	  try {
		  int grossInc = Integer.parseInt(txtGrossIncome.getText());
		  int dependents = Integer.parseInt(txtDependents.getText());
		  String state = (String)chState.getSelectedItem();
		  Tax tax = new Tax(dependents, state, grossInc);
		  String sTax = Double.toString(tax.calcTax());
		  txtStateTax.setText(sTax);
	  } catch (NumberFormatException e1) {
		  txtStateTax.setText("non-numerical Data");
	  } catch (Exception e1) {
		  txtStateTax.setText(e1.getMessage());
	  }
  } else if (source == bReset) {
	  txtGrossIncome.setText("");
	  txtDependents.setText("");
	  chState.setSelectedIndex(0);
	  txtStateTax.setText("");
  }

}
  
}

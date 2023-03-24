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

public class TaxGuiWithR extends JFrame 
  implements ActionListener{
   JLabel lblGrIncome;
   JTextField txtGrossIncome = new JTextField(15);
   JLabel lblDependents = new JLabel("Number of Dependets");
   JTextField txtDependents= new JTextField(2);
   JLabel lblState = new JLabel("State: ");
   // data model
   Vector states = new Vector(50);
   // get data from model
   JComboBox chState = new JComboBox(states);
   
   JLabel lblTax = new JLabel("State Tax: ");
   JTextField txtStateTax = new JTextField(10);
   JButton bGo = new JButton("Go");
   JButton bReset = new JButton("Reset");
   
   
   
   TaxGuiWithR(){
	   lblGrIncome = new JLabel("Gross Income: ");
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
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setSize(400, 150);
	   this.setVisible(true);
   }
   private void populateStates() {
	   states.add("Select State");
	   File file = null;
	   try {
		   file = MyFile.filestates();
	   } catch(FileNotFoundException e1) {
		   e1.printStackTrace();
	   }
	   try ( FileInputStream myFile = new FileInputStream(file);
			 InputStreamReader inputStreamReader =
					 new InputStreamReader(myFile, "UTF8");
			 BufferedReader reader = new BufferedReader(inputStreamReader);
			   ) {
		   String nextLine;
		   boolean eof = false;
	   } catch (FileNotFoundException e1) {
		   
	   } catch (IOException e2) {
		   
	   }
   }
@Override
public void actionPerformed(ActionEvent evt) {
  Object source = evt.getSource();	
  if (source == bGo) { // the button 'Go' is processing
	  try {
		  int grossInc = Integer.parseInt(txtGrossIncome.getText());
		  int dependents = Integer.parseInt(txtDependents.getText());
		  String state = (String)chState.getSelectedItem();
		  Tax tax = new Tax(dependents,state,grossInc);
		  String sTax = Double.toString(tax.calcTax());
		  txtStateTax.setText(sTax);
	  } catch (NumberFormatException e) {
		  txtStateTax.setText("Non-numerical Data");
	  } catch (Exception e) {
		  txtStateTax.setText(e.getMessage());
	  }
	 
  }
  else if (source == bReset) {// the button 'Reset' processing
	  txtGrossIncome.setText("");
	  txtDependents.setText("");
	  chState.setSelectedIndex(0);
	  txtStateTax.setText("");
  }
}
}

package lesson06;
import java.awt.*;
import javax.swing.*;

public class CgridbagListener {
   private JFrame frame;
   CgridKeysPanelL keys;
   JButton button;
   CgridbagListener engine;
   JTextField fieldmodel;
   JTextField fieldquantity;
   JTextField fieldInfo;
   JLabel labelP;
   JLabel labelM;
   JLabel labelQ;
   JLabel labelInfo;
   Insets ins = new Insets(4,8,4,8);
   
   void createAndShowGUI(String str) {
		 // create and set up the window.
		 frame = new JFrame(str);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // set up the content pane.
		 addComponentsToPane(frame.getContentPane());
		 //display the window.
		 frame.pack();
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
   }
   void addComponentsToPane(Container pane) {
	   pane.setLayout(new GridBagLayout());
	   CgridbagListenerEngine engine = new CgridbagListenerEngine(this);
	   GridBagConstraints c = new GridBagConstraints();
	   c.fill = GridBagConstraints.HORIZONTAL;
	   c.weightx = 0.5;
// Insets(int top, int left, int bottom, int right)
	   labelP = new JLabel("popular:");
	   c.gridx = 0;
	   c.gridy = 0;
	   c.insets = ins;
	   pane.add(labelP, c);
	   
	   button = new JButton(" model1");
	   c.gridx = 1;
	   c.gridy = 0;
	   c.insets = ins;
	   c.gridwidth = 2;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   button = new JButton(" model2 ");
	   c.gridx = 3;
	   c.gridy = 0;
	   c.insets = ins;
	   c.gridwidth = 2;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   button = new JButton(" model3 ");
	   c.gridx = 5;
	   c.gridy = 0;
	   c.insets = ins;
	   c.gridwidth = 2;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   labelM = new JLabel("awaiting");
	   //labelM.setForeground(Color.yellow);
	   c.gridx = 0;
	   c.gridy = 1;
//	   c.gridwidth=2;
       pane.add(labelM,c);	
       
	   fieldmodel = new JTextField("");
	   c.gridx =1;
	   c.gridy = 1;
	   c.gridwidth = 3;
	   pane.add(fieldmodel, c);
	   
	   button = new JButton("add model");
	   c.ipady = 20;
	   c.gridx = 4;
	   c.gridy = 1;
	   c.gridwidth = 2;
	   c.insets = ins;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   c.ipady = 0;
	   
	   button = new JButton("reset model");
	   c.gridx = 6;
	   c.gridy = 1;
	   c.insets = ins;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   labelQ = new JLabel("awaiting");
	   c.gridx = 0;
	   c.gridy = 2;
       pane.add(labelQ,c);	
       
	   fieldquantity = new JTextField("");
	   c.gridx = 1;
	   c.gridy = 2;
	   c.gridwidth = 3;
	   pane.add(fieldquantity, c);
	   
	   button = new JButton("add quantity");
	   c.ipady = 20;
	   c.gridx = 4;
	   c.gridy = 2;
	   c.gridwidth = 2;
	   c.insets = ins;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   c.ipady = 0;
	   
	   button = new JButton("reset quantity");
	   c.gridx = 6;
	   c.gridy = 2;
	   c.insets = ins;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   labelInfo= new JLabel("Notice         ");
	   //labelInfo.setForeground(Color.yellow);
	   c.gridx = 0;
	   c.gridy = 3;
	   c.gridwidth = 2;
	   c.insets = ins;
       pane.add(labelInfo,c);	
       
       fieldInfo = new JTextField("there is no Notice");
	   c.gridx = 2;
	   c.gridy = 3;
	   c.gridwidth = 5;
	   c.insets = ins;
	   pane.add(fieldInfo, c);
	   
//	   keys = new CgridKeysPanelL(engine);
//	   c.gridx = 0;
//	   c.gridy = 2;
//	   c.gridwidth = 3;
//	   pane.add(keys, c);
   }
   String getDisplayValueM() {
	   String fieldValue = fieldmodel.getText();
	   return fieldValue;
   }
   String getDisplayValueQ() {
	   String fieldValue = fieldquantity.getText();
	   return fieldValue;
   }
   void setDislayValueM(String value) {
	   fieldmodel.setText(value);
   }
   void setDislayValueQ(String value) {
	   fieldquantity.setText(value);
   }
   void setLabelMAdded() {
	   labelM.setText("added");
   }
   void setLabelQAdded() {
	   labelQ.setText("added");
   }
   CgridbagListener() {
	   System.out.println("HomeWork");
	   SwingUtilities.invokeLater(new Runnable() {
		   public void run() {
			   createAndShowGUI("HomeWork");
		   }
	   });
   }
}

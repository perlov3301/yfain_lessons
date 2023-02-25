package lesson06;
import java.awt.*;
import javax.swing.*;

public class CgridbagListener {
   private JFrame frame;
   CgridKeysPanelL keys;
   JButton button;
   CgridbagListenerEngine engine;
   JTextField fieldmodel;
   JTextField fieldquantity;
   static JTextField fieldInfo;
   JLabel label;
   static JLabel labelP;
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
	   engine = new CgridbagListenerEngine(this);
	   GridBagConstraints c = new GridBagConstraints();
	   c.fill = GridBagConstraints.HORIZONTAL;
	  // c.weightx = 1;
// Insets(int top, int left, int bottom, int right)
	   labelP = new JLabel("place the Order");
	   c.gridx = 2;
	   c.gridy = 0;
	   c.gridwidth=2;
	   c.insets = ins;
	   pane.add(labelP, c);
	  
	   button = new JButton(" Order ");
	   c.gridx = 4;
	   c.gridy = 0;
	   c.insets = ins;
	   c.gridwidth = 2;
	   c.ipady=10;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   c.ipady=0;
	   
	   button = new JButton("reset Order");
	   c.gridx= 6;
	   c.gridy= 0;
	   c.gridwidth = 2;
	   c.insets= ins;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   labelM = new JLabel("awaiting");
	   c.gridx = 0;
	   c.gridy = 1;
	   c.gridwidth=2;
	   c.insets = ins;
       pane.add(labelM,c);	
       
	   fieldmodel = new JTextField("");
	   c.gridx =2;
	   c.gridy = 1;
	   c.gridwidth = 2;
	   c.insets = ins;
	   pane.add(fieldmodel, c);
	   
	   button = new JButton("add model");
	   c.gridx = 4;
	   c.gridy = 1;
	   c.gridwidth = 2;
	   c.insets = ins;
	   c.ipady = 10;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   c.ipady = 0;
	   
	   button = new JButton("reset model");
	   c.gridx = 6;
	   c.gridy = 1;
	   c.insets = ins;
	   c.gridwidth=2;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   labelQ = new JLabel("awaiting");
	   c.gridx = 0;
	   c.gridy = 2;
	   c.insets= ins;
	   c.gridwidth=2;
       pane.add(labelQ,c);	
       
	   fieldquantity = new JTextField("");
	   c.gridx = 2;
	   c.gridy = 2;
	   c.gridwidth = 2;
	   c.insets= ins;
	   pane.add(fieldquantity, c);
	   
	   button = new JButton("add quantity");
	   c.gridx = 4;
	   c.gridy = 2;
	   c.gridwidth = 2;
	   c.insets = ins;
	   c.ipady = 10;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   c.ipady = 0;
	   
	   button = new JButton("reset quantity");
	   c.gridx = 6;
	   c.gridy = 2;
	   c.insets = ins;
	   c.gridwidth=2;
	   button.addActionListener(engine);
	   pane.add(button, c);
	   
	   labelInfo= new JLabel("Notice");
	   c.gridx = 0;
	   c.gridy = 3;
	   c.gridwidth = 2;
	   c.insets = ins;
       pane.add(labelInfo,c);	
       
       fieldInfo = new JTextField("there is no Notice       ");
	   c.gridx = 2;
	   c.gridy = 3;
	   c.gridwidth = 6;
	   c.insets = ins;
	   pane.add(fieldInfo, c);
	   
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
   static void setLabelP(String s) {
	   try {
		    labelP.setForeground(Color.red);
		    labelP.setText(s);
			labelP.setText("see Notice");
			fieldInfo.setText(s);
			System.out.println("too many Bikes");
	   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

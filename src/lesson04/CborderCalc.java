package lesson04;
import java.awt.*;
import javax.swing.*;

public class CborderCalc {
	
	CborderCalc() {
	  JFrame frame = new JFrame ("BorderLayout Frame");
	  frame.setSize(400,400);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setLocationRelativeTo(null);
	  
	  JPanel mainPanel = new JPanel();
	  mainPanel.setLayout(new BorderLayout());
	  
	  CgridFieldsPanel pfields = new CgridFieldsPanel();
	  mainPanel.add(pfields, BorderLayout.NORTH);
	  
	  CgridKeysPanel pkeys = new CgridKeysPanel();
	  mainPanel.add(pkeys,BorderLayout.CENTER);
	  
	  frame.add(mainPanel);
	  frame.setVisible(true);
	  
	}
}

package lesson06;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CgridbagListenerEngine implements ActionListener {
	CgridbagListener parent;
	private String sM, sQ;
	private int iQ=0;
	private int signM = -1;
	private int signQ = -1;
	CgridbagListenerEngine(CgridbagListener parent) {
		this.parent = parent;
	}
	public void actionPerformed(ActionEvent e) {
		// get button sign
		JButton clickButton = (JButton) e.getSource();
		String buttonL = clickButton.getText();
		buttonL = buttonL.toLowerCase();
		String buttonT = buttonL.replaceAll("\\s", "");
		if(buttonT.equals("model1") 
		 | buttonT.equals("model2")
		 | buttonT.equals("model3")) {
			parent.setDislayValueM(buttonT);
			signM =1;
		} else 
			if(buttonT.equals("resetmodel")) {
			signM = 0;
			parent.setDislayValueM("");
			parent.labelM.setForeground(Color.YELLOW);
			parent.labelM.setText("waiting");
		} else
			if (buttonT.equals("resetquantity")) {
			parent.setDislayValueQ("");
			parent.labelQ.setForeground(Color.YELLOW);
			parent.labelQ.setText("waiting");
			signQ = 0;
		} else 
		    if (buttonT.equals("addmodel")){
			sM = parent.getDisplayValueM();
			parent.labelM.setForeground(Color.GREEN);
			parent.labelM.setText("added");;
		} else
			if (buttonT.equals("addquantity")) {
				sQ = parent.getDisplayValueQ();
				try {
					iQ = Integer.parseInt(sQ);
					parent.labelQ.setForeground(Color.GREEN);
					//parent.labelQ.setText("added");
				} catch (NumberFormatException ne) {
					System.out.println("CgridbagListenerEngine: " + ne.getMessage());
					ne.getMessage();
					parent.labelInfo.setForeground(Color.RED);
					parent.labelInfo.setText("correct please");
					parent.fieldInfo.setText("Quantity must be a Number");
				}
				if (iQ>0) {parent.labelQ.setText("added");}
			}
	}

}

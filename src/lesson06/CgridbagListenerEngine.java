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
	private void setMok() {
		parent.labelM.setForeground(Color.black);
		parent.labelM.setText("awaiting");
		parent.fieldInfo.setText("there is no Notice");
		parent.fieldmodel.setText("");
	}
	private void setQok() {
		parent.labelQ.setForeground(Color.black);
		parent.labelQ.setText("awaiting");
		parent.fieldInfo.setText("there is no Notice");
		parent.fieldquantity.setText("");
	}
	public void actionPerformed(ActionEvent e) {
		// get button sign
		JButton clickButton = (JButton) e.getSource();
		String buttonL = clickButton.getText();
		buttonL = buttonL.toLowerCase();
		String buttonT = buttonL.replaceAll("\\s", "");
		if(buttonT.equals("order")) {
			if(signM==1 && signQ==1) {
				
			}else {
				
			}
		} else 
			if (buttonT.equals("resetorder")) {
				setMok();
				setQok();
				signM= -1;
				signQ= -1;
			}
			else
			if(buttonT.equals("resetmodel")) {
			signM = -1;
			parent.setDislayValueM("");
			setMok();
		} else
			if (buttonT.equals("resetquantity")) {
			parent.setDislayValueQ("");
			setQok();
			signQ = -1;
		} else 
		    if (buttonT.equals("addmodel")){
			sM = parent.getDisplayValueM();
			String sMm = sM.replaceAll("\\s", "");
			if (sMm.equals(null) | sMm.isEmpty()) {
				parent.labelM.setForeground(Color.RED);
				parent.labelM.setText("see Notice");
				parent.fieldInfo.setText("fill the Field for Model,please");
				signM= -1;
			} else {
				setMok();
				parent.labelM.setForeground(Color.GREEN);
				parent.labelM.setText("added");
				signM= 1;
			}
		} else
			if (buttonT.equals("addquantity")) {
				sQ = parent.getDisplayValueQ();
				try {
					iQ = Integer.parseInt(sQ);
					if (iQ>0) {
						setQok();
						parent.labelQ.setForeground(Color.GREEN);
						parent.labelQ.setText("added");
						signQ=1;
					} else {
						parent.labelQ.setForeground(Color.RED);
						parent.labelQ.setText("see Notice");
						parent.fieldInfo.setText("Quantity must be biger than 0");
						signQ=0;
					}
				} catch (NumberFormatException ne) {
					//System.out.println("CgridbagListenerEngine: " + ne.getMessage().toString());
					//ne.printStackTrace();
					parent.labelQ.setForeground(Color.RED);
					parent.labelQ.setText("see Notice");
					parent.fieldInfo.setText("Quantity must be a Number");
					signQ=-1;
				}
			
			}
	}

}

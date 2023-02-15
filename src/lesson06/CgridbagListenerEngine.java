package lesson06;
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
			parent.labelM.setText("waiting");
		} else
			if (buttonT.equals("resetquantity")) {
			parent.setDislayValueQ("");
			parent.labelQ.setText("waiting");
			signQ = 0;
		} else 
		    if (buttonT.equals("addmodel")){
			sM = parent.getDisplayValueM();
			parent.labelM.setText("added");;
		} else
			if (buttonT.equals("addquantity")) {
				sQ = parent.getDisplayValueQ();
				iQ = Integer.parseInt(sQ);
				if (iQ>0) {parent.labelQ.setText("added");}
			}
	}

}

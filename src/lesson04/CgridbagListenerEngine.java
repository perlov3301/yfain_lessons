package lesson04;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CgridbagListenerEngine implements ActionListener {
	CgridbagListener parent;
	private String s1, s2;
	private double d1, d2;
	CgridbagListenerEngine(CgridbagListener parent) {
		this.parent = parent;
	}
	public void actionPerformed(ActionEvent e) {
		// get button sign
		JButton clickButton = (JButton) e.getSource();
		String buttonL = clickButton.getText();
		String buttonT = buttonL.replaceAll("\\s", "");
		if(buttonT.equals("add")) {
			s1 = parent.getDisplayValue1();
			d1 = Double.parseDouble(s1);
			parent.setDislayValue1("");
		} else if (buttonT.equals("=")) {
			s2 = parent.getDisplayValue1();
			d2 = Double.parseDouble(s2);
			double a = d1 + d2;
			String
		}
	}

}

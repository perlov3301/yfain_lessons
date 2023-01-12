package lesson04;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CgridbagListenerEngine implements ActionListener {
	CgridbagListener parent;
	CgridbagListenerEngine(CgridbagListener parent) {
		this.parent = parent;
	}
	public void actionPerformed(ActionEvent e) {
		JButton clickButton = (JButton) e.getSource();
		String fieldText = parent.getDisplayValue1();
		String buttonLabel = clickButton.getText();
		buttonLabel = buttonLabel.replaceAll("\\s", "");
		// add text within button to existing FieldText
		String vset = fieldText + buttonLabel;
		parent.setDisplayValue1(vset);
		System.out.println("recent:"+fieldText+" click:"+buttonLabel+"="+ vset);
	}

}

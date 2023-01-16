package lesson04;
import java.awt.event.*;
import javax.swing.JButton;

public class CgridbagCustomEngine implements ActionListener {
	CgridbagDemoCustom parent;
	private String s1, s2;
	private double d1, d2;
	private double a2;
	CgridbagCustomEngine(CgridbagDemoCustom parent){
		this.parent = parent;
	}
    void fadd() {
    	
    }
    void feq() {
    	
    }
	public void actionPerformed(ActionEvent e) {
		JButton clickButton = (JButton) e.getSource();
		String buttonL = clickButton.getText();
		String buttonT = buttonL.replaceAll("\\s", "");
		System.out.println("cgridbagCustomEngine buttonT:" + buttonT);
        if(buttonT.equals("add")) {
        	s1 = parent.getDisplayValue1();
        	d1 = Double.parseDouble(s1);
        	parent.setDisplayValue1("");
        } else if(buttonT.equals("=")) {
        	s2 = parent.getDisplayValue1();
        	d2 = Double.parseDouble(s2);
        	double a = d1+d2;
        	String s = String.valueOf(a);
        	parent.setDisplayValue1(s);
        } else {
        	String fieldT = parent.getDisplayValue1();
    		//buttonT = buttonT.replaceAll("\\s", "");
    		// add new text to field
    		String vset = fieldT + buttonT;
    		parent.setDisplayValue1(vset);
    		//System.out.println("CgridCustomEngine new TextField:" + vset);
        }
	}

}

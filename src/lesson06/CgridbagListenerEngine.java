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
	private String sModel;
	private String sTrim;
	private int iQuantity;
	String getModel() {
		return sModel;
	}
	int getQuantity() {
		return iQuantity;
	}
	private static String trimBoth(final String s) {
	    final StringBuilder sb = new StringBuilder(s);
	    while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0)))
	        sb.deleteCharAt(0); // delete from the beginning
	    while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1)))
	        sb.deleteCharAt(sb.length() - 1); // delete from the end
	    return sb.toString();
	}
	private static String trimZeroBegin(final String s) {
		final StringBuilder sb = new StringBuilder(s);
		while (sb.length()> 0 && sb.substring(0,1)=="0") {
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
	private static String trimBegin(final String s) {
		final StringBuilder sb = new StringBuilder(s);
		while (sb.length()> 0 && Character.isWhitespace(sb.charAt(0))) {
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
	private static String trimEnd(final String s) {
		final StringBuilder sb = new StringBuilder(s);
		while(sb.length()> 0 && Character.isWhitespace(sb.length()-1)) {
			sb.deleteCharAt(sb.length()-1);
		}
		return sb.toString();
	}
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
	private void setOok() {
		parent.labelP.setForeground(Color.black);
		parent.labelP.setText("place the Order");
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// get button sign
		JButton clickButton = (JButton) e.getSource();
		String buttonL = clickButton.getText();
		buttonL = buttonL.toLowerCase();
		String buttonT = buttonL.replaceAll("\\s", "");
		
		if(buttonT.equals("order")) {
			if(signM==1 && signQ==1) {
				parent.labelP.setForeground(Color.green);
				parent.labelP.setText("Order was placed");
			}else if(signM!= 1) {
				parent.fieldInfo.setText("add Name of Model,please");
				parent.labelP.setForeground(Color.red);
				parent.labelP.setText("see the Notice");
			} else if(signQ!= 1) {
				parent.fieldInfo.setText("add quantity of Bikes, please");
			}
		} else 
			if (buttonT.equals("resetorder")) {
				setMok();
				setQok();
				setOok();
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
			setOok();
			signQ = -1;
		} else 
		    if (buttonT.equals("addmodel")){
			sM = parent.getDisplayValueM();
			String sMm = sM.replaceAll("\\s", "");
			//String sMm = sM.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
			sTrim = trimBoth(sM);
			if (sMm.equals(null) | sMm.isEmpty()) {
				parent.labelM.setForeground(Color.RED);
				parent.labelM.setText("see Notice");
				parent.fieldInfo.setText("fill the Field for Model,please");
				signM= -1;
			} else {
			    setMok();//s.replaceAll("^\\s+", "").replaceAll("\\s+$", "")
				setOok();
				parent.labelM.setForeground(Color.GREEN);
				parent.labelM.setText("added");
				parent.fieldmodel.setText(sTrim);
				sModel = sTrim;
				signM= 1;
			}
		} else
			if (buttonT.equals("addquantity")) {
				sQ = parent.getDisplayValueQ();
				sTrim = trimBoth(sQ);
				sTrim = trimZeroBegin(sTrim);
				try {
					iQ = Integer.parseInt(sTrim);
					if (iQ>0) {
						//setQok();
						parent.labelQ.setForeground(Color.GREEN);
						parent.labelQ.setText("added");
						iQuantity = iQ;
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

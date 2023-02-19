package lesson06;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

class OrderWindow extends JFrame {

	OrderWindow() {
		// TODO Auto-generated constructor stub
	}
	void actionPerformed(ActionEvent e) {
// the user clicked on the "validate" button
       try {
    	   CbikeOrder.validateOrder("Model-123", 30);
    	   // next lines will be skipped in case of exception
       } catch(CcustomException ev) {
    	   txtResult.setText(ev.getMessage());
       }
	} 


}

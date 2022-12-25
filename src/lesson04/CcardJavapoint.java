package lesson04;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CcardJavapoint extends JFrame 
  implements ActionListener{
	RoundBtn roundB = new RoundBtn(30);
	CardLayout card;
	JButton b1, b2, b3;
	Container c;
	  CcardJavapoint(){
		  c = getContentPane();
		  // create cardlayout object 40x30
		  card = new CardLayout(40, 30);
		  c.setLayout(card);
		  b1=new JButton("Apple");
		  b1.setBorder(roundB);
		  b2=new JButton("Boy");
		  b2.setBorder(roundB);
		  b3=new JButton("Cat");
		  b3.setBorder(roundB);
		  b1.addActionListener(this);
		  b2.addActionListener(this);
		  b3.addActionListener(this);
		  
		  c.add("a", b1);
		  c.add("b", b2);
		  c.add("c", b3);
		  this.setSize(400, 400);
		  this.setVisible(true);
		  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  }

	public void actionPerformed(ActionEvent e) {
		card.next(c);
		
	}

}

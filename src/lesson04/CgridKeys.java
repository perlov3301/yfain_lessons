package lesson04;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CgridKeys {
   CgridKeys(){
	   JPanel windowContent = new JPanel();
	   GridLayout gl = new GridLayout(4, 3);
	   windowContent.setLayout(gl);
	   JButton n1 = new JButton("  1  ");
	   JButton n2 = new JButton("  2  ");
	   JButton n3 = new JButton("  3  ");
	   JButton n4 = new JButton("  4  ");
	   JButton n5 = new JButton("  5  ");
	   JButton n6 = new JButton("  6  ");
	   JButton n7 = new JButton("  7  ");
	   JButton n8 = new JButton("  8  ");
	   JButton n9 = new JButton("  9  ");
	   JButton n0 = new JButton("  0  ");
	   
	   windowContent.add(n1);
	   windowContent.add(n2);
	   windowContent.add(n3);
	   windowContent.add(n4);
	   windowContent.add(n5);
	   windowContent.add(n6);
	   windowContent.add(n7);
	   windowContent.add(n8);
	   windowContent.add(n9);
	   windowContent.add(n0);

	   JFrame frame = new JFrame("gridLayout of Keys");
	   frame.setContentPane(windowContent);
	   frame.setSize(400, 260);
	   frame.setVisible(true);
   }
}

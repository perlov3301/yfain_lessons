package lesson04;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CgridKeysPanel extends JPanel {
  CgridKeysPanel(){
	   System.out.println("gridKeys JPanel");
	   GridLayout gl = new GridLayout(4, 3);
	   this.setLayout(gl);
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
	   
	   this.add(n1);
	   this.add(n2);
	   this.add(n3);
	   this.add(n4);
	   this.add(n5);
	   this.add(n6);
	   this.add(n7);
	   this.add(n8);
	   this.add(n9);
	   this.add(n0);
  }
}

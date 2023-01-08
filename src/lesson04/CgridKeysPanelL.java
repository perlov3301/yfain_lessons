package lesson04;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CgridKeysPanelL extends JPanel{
	private ActionListener engine;
	CgridKeysPanelL(Object engine){
		   System.out.println("gridKeys JPanel Listener");
		   this.engine = (ActionListener) engine;
		   GridLayout gl = new GridLayout(4, 3);
		   this.setLayout(gl);
		   JButton n1 = new JButton("  1  ");
		   n1.addActionListener((ActionListener) engine);
		   JButton n2 = new JButton("  2  ");
		   n2.addActionListener((ActionListener) engine);
		   JButton n3 = new JButton("  3  ");
		   n3.addActionListener((ActionListener) engine);
		   JButton n4 = new JButton("  4  ");
		   n4.addActionListener((ActionListener) engine);
		   JButton n5 = new JButton("  5  ");
		   n5.addActionListener((ActionListener) engine);
		   JButton n6 = new JButton("  6  ");
		   n6.addActionListener((ActionListener) engine);
		   JButton n7 = new JButton("  7  ");
		   n7.addActionListener((ActionListener) engine);
		   JButton n8 = new JButton("  8  ");
		   n8.addActionListener((ActionListener) engine);
		   JButton n9 = new JButton("  9  ");
		   n9.addActionListener((ActionListener) engine);
		   JButton n0 = new JButton("  0  ");
		   n0.addActionListener((ActionListener) engine);
		   JButton p = new JButton("  .  ");
		   p.addActionListener((ActionListener) engine);
		   JButton eq = new JButton("  =  ");
		   eq.addActionListener((ActionListener) engine);
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
		   this.add(p);
		   this.add(eq);
	  }
}

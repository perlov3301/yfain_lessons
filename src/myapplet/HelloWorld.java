package myapplet;

import javax.swing.JApplet;
import java.awt.*;

public class HelloWorld extends JApplet {
   public void paint(Graphics g) {
//	   Font f=new Font("Vardana", Font.BOLD|Font.ITALIC, 50);
//	   g.setFont(f);
//	   g.setColor(Color.red);
//	   g.drawString("Hello World from an applet",150,150);
	   g.drawString("HelloWorld", 50, 100);
   }
}
///*
// <applet code="HelloWorld" width="900" height="350"></applet>
// */

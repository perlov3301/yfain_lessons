package lesson04;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.border.Border;
public class RoundBtn implements Border{
   private int r;
   RoundBtn(int r) {
	   this.r = r;
   }
public void paintBorder(Component c, Graphics g,
		int x, int y, int width, int height) {
	g.drawRoundRect(x, y, width-1, height-1, r, r);
}
public Insets getBorderInsets(Component c) {
	return new Insets(this.r-1, this.r+1,
			this.r, this.r);
}
public boolean isBorderOpaque() {
	// TODO Auto-generated method stub
	return true;
}
}

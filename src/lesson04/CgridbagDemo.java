package lesson04;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CgridbagDemo {
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	
	static void addComponentToPane(Container pane) {
		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		JButton button;
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		if (shouldFill) {
			// natural height, maximum width
			c.fill = GridBagConstraints.HORIZONTAL;
			button = new JButton("Button 1");
			if (shouldWeightX) {
				c.weightx = 0.5;
			}
		}
	}
	
	
}



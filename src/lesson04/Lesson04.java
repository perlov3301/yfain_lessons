package lesson04;
import javax.swing.*;

public class Lesson04 extends JFrame  {
	public Lesson04() {
		setSize(250, 300);
		setTitle("Lesson04");
		JButton myButton = new JButton("Click me");
        add(myButton);
		setVisible(true);
	}
	public static void main (String[] args) {
		System.out.println("Hello World from lesson04");

//		Lesson04 myHello = new Lesson04();
        Cflow csc = new Cflow();
 //       csc.mcalculator();
//        new Cgrid();
//        new CgridKeys();
//        new CborderDemoContainer();
//        new CborderCalc();
//        new CborderCalcDemo();
//        new CcardJavapoint();
//        new SimpleCalculatorGrid();
//        new Calculator();
//        new CbuttonListener();
//        new CfieldListener();
//        new CboxListener();
//        new CgridbagDemo();
        new CgridbagDemoCustom();
        new CgridbagListener();
	}

}

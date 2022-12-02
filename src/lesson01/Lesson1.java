package lesson01;
import java.util.ArrayList;
import java.util.List;

public class Lesson1 {

	public static void main(String[] args) {
		System.out.println("Hello World from lesson01");
		ArrayList <String> instances = new ArrayList<String>();
        Car car1 = new Car();
        instances.add("car1");
        Car car2 = new Car();
        instances.add("car2");
        car1.color = "blue";
        car2.color = "red";
        System.out.println("these cars have painted " + instances);
        System.out.println("the color of the car1 is " + car1.color);
        System.out.println("the color of the car2 is " + car2.color);
        car1.startEngine("car1");
        car2.startEngine("car2");
        
        JamesBondCar car3 = new JamesBondCar("Honda");
        car3.color = "black";
        car3.numberOfDoors = 4;
        car3.mycar();
        
        double grossIncome = 80000;
        Tax t = new Tax(grossIncome);
        t.dependents = 2;
        t.state = "NJ";
        double yourTax = t.calcTax();
        System.out.println("your tax in NJ is " + yourTax);
        
        // grossIncome = 40000;
        NJTax tnj = new NJTax(grossIncome);
        tnj.dependents = 0;
        tnj.state = "NJ";
        yourTax = tnj.calcTax();
        double totalTax = tnj.adjustedForStudents(yourTax);
        System.out.println("your Tax as student in NJ is " + totalTax);
	}

}

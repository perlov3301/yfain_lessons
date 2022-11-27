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
	}

}

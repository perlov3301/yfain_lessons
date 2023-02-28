package lesson07;

public class Cparamclasses {
   Box<Integer> integerBox;
   Cparamclasses(){
	   integerBox = new Box<>();
	   int i = 10;
	   integerBox.add(i);
   }
}

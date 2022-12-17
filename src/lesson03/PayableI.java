package lesson03;
// for implementing without superclass
//compile time: overload fun= diff parameters
	// runtime (Dynamic Method Dispatch): 
	// override method=diff content

public interface PayableI {
	final static int INCREASE_CAP = 20;
	boolean increasePay(int percent);
}

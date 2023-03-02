package lesson07;
// from Oracle Java tutorial
public class Box<T> {
	// T stands for "Type". Generic Box stores 
	// objects of any Type.The concrete Type will be
	// provided by the user of the Box.
	private T t;
	void add(T t) {
		this.t = t;
	}
	T get() {
		return t;
	}

}

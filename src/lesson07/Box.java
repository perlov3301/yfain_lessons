package lesson07;
// from Oracle Java tutorial
public class Box<T> {
	// T stands for "Type"
	private T t;
	void add(T t) {
		this.t = t;
	}
	T get() {
		return t;
	}

}

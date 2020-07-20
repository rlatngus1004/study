package chapter11;

public class Box01<T> {
	private T obj;
	public void set (T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
}

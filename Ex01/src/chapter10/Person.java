package chapter10;

public class Person {
	String id;

	public Person(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj!=null && obj instanceof Person) {
			return id.equals(((Person)obj).id);
		} else {
			return false;
		}
	}
			

}

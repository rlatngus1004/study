package chapter12;

public class Student {
	public Student(int number, String name) {
		super();
		this.Number = number;
		this.name = name;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int Number;
	private String name;

	@Override
	public int hashCode() {
		return Number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			return (stu.getName().equals(this.name)) &&
					(stu.getNumber() == this.Number);
		}else {
			return false;
		}
	}
}



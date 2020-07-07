package chapter04;

public class Car01 {
	String model = "아반떼";
	String color = "red";
	int length = 100;
	int speed = 0;
	
	{
		System.out.println("인스턴스가 만들어 지기전 생성됨");
	}
	
	public Car01() {}
	public Car01(String model) {
		this.model = model;
	}
	
	public Car01(String model, String color) {
		this(model);
		this.color = color;
	}
	
	public Car01(String model, String color, int length) {
		this(model,color);
		this.length = length;
			
	}
	
	//public void prt() 
	
	
	
}

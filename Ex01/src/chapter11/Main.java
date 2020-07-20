package chapter11;

public class Main {

	public static void main(String[] args) {
		AppleBox abox = new AppleBox();
		OrangeBox obox = new OrangeBox();
		
		abox.set(new Apple());
		obox.set(new Orange());
		
		Apple ap = abox.get();
		Orange or = obox.get();
		
		System.out.println(ap.toString());
		System.out.println(or.toString());
		
		Box abox2 = new Box();
		Box obox2 = new Box();
		
		abox2.set(new Apple());
		obox2.set(new Orange());
		
		Apple ap2 = (Apple)abox2.get();
		Orange or2 = (Orange)obox2.get();
		
		System.out.println(ap2);
		System.out.println(or2);
		
		Box01<Apple> abox3 = new Box01<>();
		Box01<Orange> obox3 = new Box01<>();
		
		abox3.set(new Apple());
		obox3.set(new Orange());
		
		//abox3.set("Apple");X
		
		Apple ap3 = abox3.get();
		Orange or3 = obox3.get();
		
		System.out.println(ap3);
		System.out.println(or3);
		
	} 

}

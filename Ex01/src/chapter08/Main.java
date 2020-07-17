package chapter08;

public class Main {
	//Animal a = new Animal(); 추상 클래스 인스턴스 생성 불가
	Dog d = new Dog();
	d.sound();
	Dog c = new Cat();
	c.sound();
	Animal animal = new Dog();
	animal.sound();
	animal = new Cat();
	animal.sound();
	
	method(new Dog());
	method(new cat());
}


package shapter06;

public class child extends parent {
	int age = 25;
	
	public void info() {//부모가 가진 메소드의 이름, 매개변수특징, 반환타입 일치하면 오버 라이드
		//System.out.println("이름 : "+this.name);
		super.info(); 
		System.out.println("나이 : "+this.age);
	}
	
}

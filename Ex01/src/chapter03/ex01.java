package chapter03;

public class ex01 {

	public static void main(String[] args) {
		//(string[] args)=메소드
		//();- 메소드, 사용법 = 이름을 호출
		hello();

		info("철수",25);
		info("공유",45);
		info("rlatngus","9789");
	}
	public static void info(String id, String pwd) {
		System.out.println("아이디 : "+id);
		System.out.println("패스워드 : "+pwd);
	}
	
	public static void info(String name,int age) {
		System.out.println("내 이름은 "+name);
		System.out.println("내 나이는 "+age+"살 입니다.");
	}
	public static void hello() {
		System.out.println("안녕하세요");
	}
	
	//메소드 오버로딩
	
	


}

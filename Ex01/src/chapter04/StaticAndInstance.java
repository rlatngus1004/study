package chapter04;

public class StaticAndInstance {
		static int field1;
		static void method1() {
			System.out.println("클래스 메소드");
		}
		
		int filed2;
		void method2() {
			System.out.println("인스턴트 메소드");
		}
		
		static void method3() {	
			System.out.println("클래스 메소드");
			field1 = 10;
			method1();
			//this.field2 = 20;  사용 안됨.
			//this.method2(); 역시 사용 안됨.
			}
		void method4() {
			System.out.println("인스턴스 메소드");
			field1 = 10;
			method1();
			this.filed2 = 20;
			this.method2();
		}
}

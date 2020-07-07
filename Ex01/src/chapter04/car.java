package chapter04;

public class car {
		//차량의 속성
		String color = "blue";
		int speed = 0;
		
		public car(String color) {//생성자 메소드)
			this.color = color;
		}	
		//차량의 기능
		public void forward() {
			speed++;
			System.out.println("전진 앞으로!");
		}
		public void backward() {
			speed--;
			System.out.println("후퇴!");
		}
}

package chapter09;

public class Main5 {

	public static void main(String[] args) {
		try {
			method();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			String data = e.getMessage(); // 예외 발생시 저장된 메세지 출력
			System.out.println(data);
			e.printStackTrace(); // 예외 위치 경로 추적
		}
	}

	private static void method() throws MyException {
		boolean run =true;
		if(run) {//어떤 조건일때 예외 발생
			throw new MyException("강제로 예외 발생");
		}
		
	}
	

}

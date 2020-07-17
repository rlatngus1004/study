package chapter09;

public class Main4 {

	public static void main(String[] args) throws NullPointerException { // 가상머신이 떠넘김.
		try {
			method();
		}catch (NullPointerException e) {
			System.out.println("예외발생");
		}
		
		
		

	}
	private static void method() throws NullPointerException{//발생한 예외를 던지겠다. 
		String Str = null;
		System.out.println(Str.toString());//예외가 발생
				
	}

}

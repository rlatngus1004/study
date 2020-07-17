package chapter09;

public class MyException extends Exception {
	public MyException() {} //빈생성자
	public MyException(String message) {//문자열 받는 생성자
		super(message);
	}
	
}

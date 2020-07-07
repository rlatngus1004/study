package chapter04;

public class Memberservice {
	
	String x = "hong";
	String y = "12345";
	
	public boolean login(String id, String password) {
		if (id.equals(x) && password.equals(y)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
	

}

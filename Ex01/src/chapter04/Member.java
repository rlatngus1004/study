package chapter04;

public class Member {
	String name;
	String id; 
	String password;
	String phone;
	
	public Member (String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	public void prt() {
		System.out.println("이름 : "+this.name);
		System.out.println("전화번호 : "+this.phone);
	}
	


}

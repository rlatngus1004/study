package chapter05;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String phone;
	
	public Member(String id, String pw, String name, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	

	public void prt() {
		System.out.println("***************************");
		System.out.println("이름 :"+this.name);
		System.out.println("전화번호 :"+this.phone);
		System.out.println("***************************");
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
}

package chapter05;

import java.util.Scanner;

public class Main {
	static Member m;//인스턴스 데이터 저장 공간
	static Scanner scan = new Scanner(System.in);
	static Member[] members = new Member[100];
	static int flag = -1; 

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.로그아웃");
			System.out.println("4.종료");
			System.out.print("선택> ");
			int Menu = scan.nextInt();
			scan.nextLine(); //버퍼에 남김 줄바꿈을 제거하는 용도
			switch(Menu) {
			case 1:
				Member m = Sign();
				for(int i = 0; i<members.length;  i++) {//배열의 내용물을 탐색
					if(members[i] == null) {//변수가 비었는가?
						members[i] = m; //가입 완료
						break;

					}
				}

				System.out.println("회원가입 완료");
				break;
			case 2:
				login();
				break;
			case 3:
				if (flag != -1) { 
					System.out.println("로그아웃 합니다.");
					flag = -1;
				} else { 
					System.out.println("로그인이 되어있지 않습니다.");
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false; //while 반복 종료, 메소드 마무리
				System.exit(0);	//프로그램 종료	
				break;
			default : System.out.println("잘못 입력하셨습니다."); 	
			}
		}			
	}


	private static void login() {
		if (flag != -1) {
			System.out.println("이미 로그인 하셨습니다.");
		} else {
			System.out.println("로그인");
			System.out.println("아이디 입력");
			String id = scan.nextLine();
			System.out.println("비밀번호 입력");
			String pwd = scan.nextLine();


			//저장된 인스턴스를 탐색!1
			for(int i=0; i<members.length; i++) {	
				if(members[i]!= null) {//i가 비어있지 않다면
					if(id.equals(members[i].getId()) && pwd.equals(members[i].getPw())) {
						System.out.println("로그인 성공");
						members[i].prt();	//인스턴스 들어가 있다. 
						flag = i;
					} 
					if(flag == -1) {
						System.out.println("로그인 실패");
					}
				}
			}
		}
	}

	private static Member Sign() {
		System.out.println("아이디를 입력하시요");
		String id = scan.nextLine();
		System.out.println("비밀번호를 입력하시요.");
		String pwd = scan.nextLine();
		System.out.println("이름을 입력하시요.");
		String name = scan.nextLine();
		System.out.println("전화번호를 입력하시요.");
		String phone = scan.nextLine();
		Member m = new Member(id,pwd,name,phone);
		return m;
	}

}


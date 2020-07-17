package chapter06;

public class View {
	public static int mainMenu() {
	System.out.println("성적 관리 프로그램");
	System.out.println("1. 성적입력");
	System.out.println("2. 성적조회");
	System.out.println("3. 석차조회");
	System.out.println("4. 종료");
	System.out.println("선택>");

	int number = Integer.parseInt(Main.scan.nextLine());
	return number;
	}

	public static int submenu() {
		System.out.println("-------성적 조회----------");
		System.out.println("1.개인별 성적 조회");
		System.out.println("2.과목별 성적 조회");
		System.out.println("3.이전 메뉴로 돌아가기");
		int number2 = Integer.parseInt(Main.scan.nextLine());
		return number2;
	}

	public static int subjectmenu() {
		System.out.println("조회하고자 하는 과목을 입력하세요.");
		System.out.println("국어");
		System.out.println("수학");
		System.out.println("영어");
		int subjectNo = Integer.parseInt(Main.scan.nextLine());
		return subjectNo;
	}

	public static Student inputStudent() {
		System.out.println("성적 정보를 입력하세요");
		System.out.print("학생 이름>");
		String name = Main.scan.nextLine();
		int[] scores = new int[3];
		System.out.print("국어 점수>");
		scores[0] = Main.scan.nextInt();
		System.out.print("영어 점수>");
		scores[1] = Main.scan.nextInt();
		System.out.print("수학 점수>");
		scores[2] = Main.scan.nextInt();
		
		Student stu = new Student(name,scores);
		return stu;
	}
	
	public static void subjectPrt(int subjectNo, int total, double avg) {
		String[] subjectName = new String[] {"국어","영어","수학"};
		System.out.printf("전체 %s 총점 : %d",subjectName[subjectNo-1],total);
		System.out.printf("전체 %s 평균 : %f",subjectName[subjectNo-1],avg);
	}
	
	static void wrong() {
		System.out.println("잘못 입력하셨습니다.");	
	}
}

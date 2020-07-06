import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/
		Scanner scan = new Scanner(System.in);
		int kor = 0,eng = 0,chi = 0,jap = 0,fra = 0;
		int total = 0;
		double avg = 0.0;
		boolean run = true;//프로그램 종료
		while(run) {

			//메뉴
			System.out.println("성적 프로그램");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.프로그램 종료");
			int selnum = scan.nextInt();
			switch(selnum) {
			case 1:	//성적 출력
				System.out.print("국어 점수를 입력하세요");
				kor = scan.nextInt();
				System.out.print("영어 점수를 입력하세요");
				eng = scan.nextInt();
				System.out.print("중국어 점수를 입력하세요");
				chi = scan.nextInt();
				System.out.print("일본어 점수를 입력하세요");
				jap = scan.nextInt();
				System.out.print("프랑스어 점수를 입력하세요");
				fra = scan.nextInt();
				break;
			case 2://성적 출력
				total = kor+eng+chi+jap+fra;
				avg = total/5;
				System.out.println("국어 점수 :" +kor);
				System.out.println("영어 점수 :" +eng);
				System.out.println("중국어 점수 :" +chi);
				System.out.println("일본어 점수 :" +jap);
				System.out.println("프랑스어어 점수 :" +fra);
				System.out.println("총 점수 :" +total);
				System.out.println("평균 점수 :" +avg);
				break;
			case 3:
				System.out.println("프로그램을 종요합니다.");
				run = false;
				break;
			default:
				System.out.println("1~3번 중에서 하나를 선택하시요.");
			}
		}	
	}
}


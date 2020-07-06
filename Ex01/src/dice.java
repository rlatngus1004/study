import java.util.Random;
import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		// 6번 문제
		for (int i =0;i<5;i++) { 
			for (int j =0;j<5;j++)
			 	System.out.print("*");
			System.out.print("\n");	
		}

		
		//7번 문제
		 int Y=0;
		 int Z=0;
		while(run) {
		    System.out.println("우리 은행 프로그램에 접속한걸 환영합니다 고갱님.");
		    System.out.println("1.계좌 조회");
		    System.out.println("2.계좌 예금");
		    System.out.println("3.계좌 출금");
		    System.out.println("4.종료");
		    int X=scan.nextInt();
		    switch (X) {
		    case 1:
		    System.out.println("계좌 잔액 :" +Y+"원");
		    break;
		    case 2:
		    System.out.println("예금할 금액을 입력 해 주세요.");
		    Z = scan.nextInt();
		    System.out.println("입급이 완료되었습니다.");
		    Y = Y+Z;
		    break;
		    case 3:
		    System.out.println("출금할 금액을 입력 해 주세요.");
		    Z = scan.nextInt();
		    Y = Y-Z;
		    break;
		    case 4:
			System.out.println("프로그램을 종요합니다.");
			System.exit(0);
		    }			
		}
	
	}

}

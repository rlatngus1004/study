package chapter03;

import java.util.Scanner;

public class ex02 {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run =true;
		int[] scores = null;
		
		while(run) {
			System.out.println("──────────────────────────────────────────────────");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트  | 4. 분석 | 5. 종료");
			System.out.println("──────────────────────────────────────────────────");
			System.out.print("선택>");

			int selectNo = s.nextInt();
			
			if(selectNo == 1) {
				scores = studentnum(s);
			}else if(selectNo == 2) { 
				scores = point(scores, s);
			}else if(selectNo == 3) {
				jumsu(scores);
			}else if(selectNo == 4) {
				ananlysis(scores);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");}

	private static void ananlysis(int[] scores) {
		int sum = 0;
		int max = 0;
		double avg = 0.0;
		for(int i=0;i<scores.length;i++) {
			sum +=scores[i];
		if(max < scores[i]) {
				max = scores[i];
			}
		}
		avg = sum/(double)scores.length;
		System.out.println("최고 점수: "+max);
		System.out.println("평균 점수: "+avg);
		
	}

	private static void jumsu(int[] scores) {
		int num = 0;
		for(int score:scores){
			System.out.println("scores["+(num++)+"]: "+score);
		}
		
	}

	private static int[] point(int[] scores,Scanner s) {
		for(int i=0;i<scores.length;i++) {
			System.out.print("scores["+i+"]>");
			scores[i] = s.nextInt();
			//sum +=scores[i];
			//if(max < scores[i]) {
			//	max = scores[i];
			}
		return scores;
	}
		

	private static int[] studentnum(Scanner s) {
		System.out.print("학생수>");
		int studentNo = s.nextInt();
		int[] scores = new int[studentNo];
		return scores;
	}
}







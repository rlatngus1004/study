package chapter02;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		//배열
		int [] jumsu;//선언
		jumsu = new int [5];//배열의 크기
		jumsu = new int [] {5,6,7,8,9};//배열의 자료
		System.out.println(+jumsu[1]);
		jumsu[0] = 3;//데이터 바꾸기
		System.out.println(+jumsu[0]);
		
		for(int i=0;i<5;i++) {
			System.out.println(+jumsu[i]);//데이터 나열하기(변수로배열 내 데이터 조정 가능)
		}//배열 내 데이터 숫자보다 더 많은 수치를 주면 오류 뜸!
		
		int [] x;
		x = new int [6];
		x = new int [] {78,85,72,95,86,90};	
		int sum = 0;
		for(int i=0;i<x.length;++i) {sum = sum+x[i];}//!!! 중요 !!! length는 배열의 길이
		System.out.println(+sum);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("학생수를 입력하세요 :");
		int student = Integer.parseInt(scan.nextLine());
		
		int[] scores = new int[student];
		
		for(int a=0;a<scores.length;++a) {
			System.out.print((a+1)+"번째 학생 점수를 입력하세요 : ");
			scores[a] = Integer.parseInt(scan.nextLine());
		}
		int total = 0;
		double avg = 0;
		for(int a=0;a<scores.length;++a) {total = total+scores[a];}//!!! 중요 !!! length는 배열의 길이
		System.out.println(+total);
		
		avg = total/(double)student;
		System.out.println(+total);
		System.out.println(+avg);
		
		//다배열
		
		int[][] x01 = new int [8][]; // 배열 내부 데이터가 int
		int[][] x02 = new int [8][]; // 배열 내부 데이터가 int[]
	    x01[0] = new int[8];  //x01 dksdp 
	    x01[2] = new int[8];	
	    
	    
	}
	
	

}

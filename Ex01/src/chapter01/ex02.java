package chapter01;

import java.util.Random;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		// 1번 문제
		for (int a=1; a<10; a++){
		for (int b=1; b<10; b++){
			if ((b%3)!=0) {continue;} 
			System.out.printf("%d X %d = %d \t" ,a, b ,(a*b) );
			}
		System.out.print("\n");
		}	
		// 2번 문제
	    int x = 0;
	    int y = 0;
	    int z = 0;
		
	    while (true) {
	    System.out.print("국어 점수를 입력하세요");
		x = scan.nextInt();
		if (0<x && x<101) 
		{break;} 
		else {System.out.println("값이 벗어났습니다.");} 
	    }
	    while (true) {
		System.out.print("영어 점수를 입력하세요");
		y = scan.nextInt();
		if (0<x && x<101) 
		{break;} 
		else {System.out.println("값이 벗어났습니다.");} 
	    }
	    while (true) {
		System.out.print("수학 점수를 입력하세요");
		z = scan.nextInt();
		if (0<x && x<101) 
		{break;} 
		else {System.out.println("값이 벗어났습니다.");} 
	    }
		System.out.println("국어 점수 : " +x);
		System.out.println("영어 점수 : " +y);
		System.out.println("수학 점수 : " +z);
		System.out.println("점수 합계 : " +(x+y+z));
		System.out.println("점수 평균 : " +(x+y+z)/3);
		
		//가위 바위 보;
		System.out.println("가위 바위 보 중에서 하나를 선택하시요.");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		int j = 0;
		j = scan.nextInt();		
		Random r = new Random();
		int i = r.nextInt(3)+1;
		switch (j) {
			case 1 : if (i == 1) {System.out.println("비겼습니다.");}
					else if (i == 2) {System.out.println("졌습니다.");}
					else if (i == 3) {System.out.println("이겼습니다.");}
			break;
			case 2 : if (i == 1) {System.out.println("이겼습니다.");}
			
					else if (i == 2) {System.out.println("비겼습니다.");}
					else if (i == 3) {System.out.println("졌습니다.");}
			break;
			case 3 :  if (i == 1) {System.out.println("졌습니다.");}
					else if (i == 2) {System.out.println("이겼습니다.");}
					else if (i == 3) {System.out.println("비겼습니다.");}
			break;
			}
		}
	}


package chapter02;

import java.util.Random;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random dice = new Random();
		int [] x = new int [3];
		while(true) {
			int a = 0;
			for (int i=0; i<x.length; i++) {
				x[i] = dice.nextInt(10);
				a = i;
			}
			System.out.println("지금부터 야구 게임을 시작합니다. 세가지 원하는 숫자 중 첫번째 숫자를 입력하세요.");
			int [] y = new int [3];
			int b = 0;
			for (int j=0; j<y.length; j++) { 
				y[j]= scan.nextInt();
				b = j;
			}
			if (a == b && x[a] == y[b]) { 
				System.out.printf("1 스트라이크");
			} else {
				if (x[a] != y[b]) {
					System.out.printf("%d 볼",+x[a] == y[b]);
				} else {
					
				} if (x[a] != y[b]) {
					System.out.println("3 스트라이크로 승리했습니다");
					System.exit(0); 
				}
			}


		}
	}

}

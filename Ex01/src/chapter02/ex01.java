package chapter02;

import java.util.Random;

public class ex01 {

	public static void main(String[] args) {
		Random dice = new Random();
		int[] x = new int [1000];
		for(int i=0;i<1000;i++) {
			x[i] = dice.nextInt(45)+1;
		}
		for(int i=0;i<1000;i++) {
			//System.out.println(x[i]);
		}
	
		int[] y = new int [] {78,54,89,57,84,95,74,91,85,67,52,94,82};
		int max = 0;
		for(int j=0;j<y.length;j++) {
			if (max <y[j]) max = y[j]; 
			//System.out.println(max);
		}
		
		
		int[] can = new int [45];
		
		for (int i=0;i<1000;i++) {
			
			int a = dice.nextInt(45)+1;
			can[a-1]++;
		}
		for (int i=0;i<can.length;i++) {
			System.out.println(can[i]);
		}
		
	}
	


}

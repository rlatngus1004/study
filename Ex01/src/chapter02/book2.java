package chapter02;

public class book2 {

	public static void main(String[] args) {
		int[] x = new int [] {1,5,3,8,2};
		int max = 0;
		for(int i=0;i<x.length;i++) {
			if (max <x[i]) max = x[i];
			System.out.println("max :" +max);
		}

	}

}

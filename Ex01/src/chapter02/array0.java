package chapter02;

public class array0 {

	public static void main(String[] args) {
		int[][] num = {
			{67,78,96},
			{77,88,86},
			{69,89,78},
			{98,79,65}
			};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for (int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				count++;
				sum += num[i][j];
			}
		}
		avg = sum/(double)count;
		
		// for(int[] n:num){
		//	for(int socre:n){
		//	count2++;
		//	sum2 += score;
		//	}
		// }
		
		
	}
}


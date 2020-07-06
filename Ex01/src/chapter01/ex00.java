package chapter01;

public class ex00 {

	public static void main(String[] args) {
		//1번 문제
		int squ;
		squ = 3*6;
		System.out.println("1." +squ);
		//2번 문제
		int tri;
		tri = 3*6/2;
		System.out.println("2." +tri);
		//3번 문제;
		double avg;
		avg =(40+30+10)/3.0;
		System.out.println("3." +avg);
		//4번 문제
		double sal;
		sal = 12*100*0.8;
		System.out.println("4." +sal);
		//5번 문제
		int min;
		min = 284/60;
		int soc;
		soc = 284%60;
		System.out.printf("5." +min+"분"+soc+"초");
        //6번 문제
		int x;
		x = 10;
		int y;
		y = 5;
		boolean result1;
		boolean result2;
		result1 = (x>7) && (y<=5);
		result2 = (x%3==0) || (y%2!=1);
		System.out.println("\n6." +result1+"\tand\t"+result2);
		//7번 문제
		int num1;
		num1 = 176840/50000;
		int num2;
		num2 = 26840/10000;
		int num3;
		num3 = 6840/5000;
		int num4;
		num4 = 1840/1000;
		int num5;
		num5 = 840/500;
		int num6;
		num6 = 340/100;
		int num7;
		num7 = 40/10;
		System.out.printf("7." +"오만원"+num1+"개 만원"+num2+"개 오천원"+num3+"개 천원"+num4+"개 오백원"+num5+"개 백원"+num6+"개 십원"+num7+"개");
		//8번 문제
	    int num;
	    num = 70;
	    char grade;
	    grade = (num>=90)? 'A':
	    	    (num>=80)? 'B':
	    	    (num>=70)? 'C':
	    	    (num>=60)? 'D':'F';
	    System.out.println("\n8."+grade+"등급");	    	
	}

}

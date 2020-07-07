package chapter01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	// 1번 문제	
		question1();
	// 2번 문제
		question2();
	// 3번 문제
		int c=0;
		int	totalc=0;	
		while(c<=100){
			c++;
			totalc = totalc+c;
			if(totalc>=1000) {
				break;
			}
		}
		System.out.println("3."+totalc);
		System.out.printf("  %d",c);
	// 4번 문제	
		int d=0; int e=0; int f=0;
		int totald=0; int totale=0; int totalf=0;	
		int total4;
		while(d<=100){
			d++0;
			if((d%2)!=0) {
				continue;
			}
			totald = totald+d;
		}	
		while(e<=100){
			e++;
			if((e%7)!=0) {
				continue;
			}
			totale = totale+e;
		}	
		while(f<=100){
			f++;
			if((f%14)!=0) {
				continue;
			}
			totalf = totalf+f;
		}
		total4 = totald+totale+-totalf;
		System.out.println("\n4.합계" +total4);
		System.out.println("   평균" +total4/((100/2)+(100/7)-(100/14)));
	// 5번 문제
		System.out.print("5.");
		int g=10;
		while(g<99){
			g++;
			if((g/10)%2==0 && (g%2)==0) {
				System.out.printf("%d\n",g);   
			}				
		}
	//6번문제
		System.out.print("6.");
		 for(int h=1;h<10;h++) {
			 if((h%2)!=0) {
					continue;
				}
			 for(int i=1;i<10;i++) {
				 if((i%2)!=0) {
						continue;
					}
				 System.out.printf("%d X %d = %d\n" ,h,i,(h*i));
			 	}
		 	}
	//7번문제	 
		 System.out.print("7.");
		 for(int l=2; l<=9; l++ ) {
			 for(int o=2; o<=9; o++) {
				System.out.printf("%d X %d = %d \t",l,o,l*o); 
		 }
		 System.out.println("\n");
		 }
	//8번문제
		 System.out.print("8.");	
		 for(int j=4;j<=100;j++) {
			 int total7 = 0;
			 for(int k=1;k<j;k++)
				 if(j%k==0) {
					 total7 += k;
				 }
			 if (total7==j) {
				 System.out.println(+j);
			 }
		 }	 
	//9번문제
		 int m=0; int n=0; double total9=0;
		 System.out.println("9.");	
		 System.out.print("첫번째 숫자를 입력하세요");
		 m=scan.nextInt();
		 System.out.print("두번째 숫자를 입력하세요");	
		 n=scan.nextInt();
		 total9=m+(m+n)/2+n;
		 System.out.print("합산 결과 :"+total9);	
	//10번문제	
		 scan.nextLine();
		 String Sid ="grean"; String Spw = "gr1234"; 
		 System.out.println("아이디를 입력하세요.");
		 System.out.print (">");
		 String id = scan.nextLine();
	     System.out.println("비밀번호를 입력하세요.");
		 System.out.print (">");
		 String pw = scan.nextLine();
		    if(Spw.equals(pw) && Sid.equals(id)) {
				System.out.println("로그인 성공");
		    }else {
		    	System.out.println("아이디나 비밀번호가 틀렸거나 존재하지 않습니다.");
		    }
		
		 
		 
		 
		
		

		
		
	}

	private static void question2() {
		int b=0;
		int totalb=0;
		while(b<=100){
			b++;
			if((b%7)!=0) {
				continue;
			}
		totalb = totalb+b;
		}
		System.out.println("2.합계"+totalb);
		System.out.println("    평균"+totalb/(100/7));
		
	}

	private static void question1() {
		int a=0;
		int	totala=0;	
		while(a<=100){
			a++;
			totala = totala+a;
		}
		System.out.println("1."+totala);
		
	}
	
	

}

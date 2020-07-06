
public class A {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		result = ((num1+=10) < 0)&&((num2+=10) > 0);
		System.out.println("result : "+result);
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2+"\n");
		
		result = ((num1+=10) > 0)||((num2+=10) < 0);
		System.out.println("result : "+result);
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2+"\n");
		
		int result2 = (num1 < num2)? num2 :num1 ;
		System.out.println("result2 : "+result2);
		
		int jumsu = 65;
		char grade;
		grade = (jumsu >= 90)? 'A': 
			    (jumsu >= 80)? 'B':
			    (jumsu >= 60)? 'C': 
			    (jumsu >= 60)? 'D':'F';
		System.out.println("등급 : "+grade+"\n");
		
		int number1 = 3;
		int number2 = 5;
		System.out.println(number1 & number2);
		System.out.println(number1 | number2);
		System.out.println(number1 ^ number2);
		System.out.println(~number1);
		System.out.println(number1 << 1);
		System.out.println(number2 << 2);
		System.out.println(100 << 3);
		
	    int k=1;
	    while (k<10); {
	    	k++;
	    	System.out.println(k);
	    	}
	    
	    int question;
	    switch(question);
	    
		
		
	}   

}

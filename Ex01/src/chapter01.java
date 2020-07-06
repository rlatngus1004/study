
public class chapter01 {
	
	public static void main(String[] args) {
    int age = 27;
    if (age>=60) { System.out.println("경로자 무료");}
    else if(age>=20) {System.out.println("성인요금");}
    else if(age>=13) {System.out.println("청소년 요금");}
    else if(age>=8) {System.out.println("어린이 요금");}
    else {System.out.println("미취학 어린이 무료");}
    
    int i=1;
    int hap=0;
    while(i<10){
    	System.out.println(i++);
    	}
    
    int j=1;
    do {
    	j++; 
    	hap=hap+j;
    }while(j<10); 
    System.out.println("합계" +hap);
    
    for(int k=1;k<10;k++) {
    	if((k%2)!=0) { 
        continue;
        }
    	System.out.println(k);
    	
    }
    
    System.out.println("--------------------------------------------------");
    
    for(int a=1;a<10;a++) {for(int b=1;b<10;b++) {
    System.out.printf("%d X %d = %d \n" ,a,b,(a*b));}
    }
    System.out.println("--------------------------------------------------");
    

    

    
    	
    	
    	
    	
    	
   }
}

 
import java.util.Random;

public class start {

	public static void main(String[] args) {
		int dice1 = (int)(Math.random()*6)+1; //무작위 코딩 1
		System.out.println(dice1);
        
		Random r = new Random(); // 무작위 코딩 2
		int dice2 = r.nextInt(6)+1;
		System.out.println(dice2); 
	}
     
}

//반복 :    ............. {break 반복;} 

package quetion02;

import java.util.Random;

public class Diet extends Animal {
	Random random = new Random();
	public Diet(String name, int age, int height, int weight) {
		super(name, age, height, weight);
		if(weight/height*height > 30) {
			int r = random.nextInt(14)+1;
			if (r<10) {
				
			} else { 
				
				System.out.println("다이어트에 실패하여 체중이 늘어납니다."+);
			}
		} else {
			System.out.println("정상 입니다.");
		}
	}

}

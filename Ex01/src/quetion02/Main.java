package quetion02;
import java.util.Scanner;

import quetion01.Account;
public class Main {
	private static Animal[] animal = new Animal[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("동물 관리 프로그램");
		System.out.println("1.동물 등록");
		System.out.println("2.동물 검색");
		System.out.println("3.동물 운동시키기");
		System.out.println("4.동물 삭제");
		System.out.println("5.프로그램 종료");
		int menu = scan.nextInt();
		scan.nextLine();
		while(true) {
			switch (menu) {
			case 1 :
				System.out.println("이름");
				String name  = scan.nextLine();
				System.out.println("나이 :");
				int age = scan.nextInt();
				System.out.println("키 :");
				int height = scan.nextInt();
				System.out.println("몸무게 :");
				int weight = scan.nextInt();
				scan.nextLine();
				Animal ani = new Animal(name, age, height, weight);
				int flag = -1;
				for(int i=0; i<animal.length; i++) {
					if(animal[i] == null) {
						animal[i] = ani;
						flag = 1;
						break;
					}
				}if (flag == -1) {
					System.out.println("등록 실패");
				} else {
					System.out.println("등록 성공");
				}
				break;
			case 2 :
				for (int i=0; i<animal.length; i++) {
					if (animal[i] == null) {
						System.out.println(animal[i].getName());
					}
				}
				int number = scan.nextInt();
				System.out.println(animal[number].getAge());
				System.out.println(animal[number].getHeight());
				System.out.println(animal[number].getWeight());
				break;
			case 3 :
				
				break;
			case 4 :
				for (int i=0; i<animal.length; i++) {
					if (animal[i] == null) {
						System.out.println(animal[i].getName());
					}
				}
				int number2 = scan.nextInt();
				
				
				break;
			case 5 :
				
				break;
			default :
			}
		}
	}
}

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
//		int keycode = System.in.read();
		
//		System.out.println(keycode);
//		System.out.write(keycode);
//		System.out.flush();
//////////////////////////////////////////////////
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("이름 :" +name);
		
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		System.out.println("나이 :" +age);
		
		//해결법 2 :Nextint를 사용 안하고 문자열로 받아 숫자로 바꿔 사용. 
		// int score = integer.parseint(scan.nextLine())
		
		scan.nextLine();//해결법 1 : 메모리에서 엔터 키코드를 제거 한 다음에 사용.
		System.out.println("주소를 입력하세요.");
		String address = scan.nextLine();
		System.out.println("주소 :" +address);
		
		
		}
	}
package chapter05;

public class Test {//학생의 항명당 기록 정보

	public static void main(String[] args) {
		String name = "뷁";//-필드
		int kor = 90;
		int eng = 80;
		int math = 85;
		int sum = kor+eng+math;
		double avg = sum/3;
		////////////////////////////////////////////////////////////
		String[] names = new String[] {"김","박","이"}; //-생성자
		int[] kors = new int[] {75,87,67};
		int[] engs = new int[] {69,82,71};
		int[] maths = new int[] {87,69,38};
		int[] sums = new int[] {
			kors[0]+engs[0]+maths[0],
			kors[1]+engs[1]+maths[1],
			kors[2]+engs[2]+maths[2]
		};
		double[] avgs = new double[] {
				sums[0]/3,
				sums[1]/3,
				sums[2]/3
		};
/////////////////////////////////////////////////////////////////////////////////////
		//다수의 학생들의 단위 학생별로 관리하고자 할때 - 클래스
		Testclass stu01 = new Testclass("홍길동",75,87,67);
		Testclass stu02 = new Testclass("김수현",69,82,71);
		Testclass stu03 = new Testclass("이철수",87,69,83);
		
		System.out.println("홍길동의 평균 : "+stu01.avg);
		System.out.println("김수현의 평균 : "+stu02.avg);
		System.out.println("박철수의 평균 : "+stu03.avg);
		
/////////////////////////////////////////////////////////////////////////////////////////
		//단위 학생별 인스턴스를 배열에 담아서 처리할 수 있다.
		Testclass[] Student = new Testclass[3];
		
		
		Student[0]  = new Testclass("홍길동",75,87,67);
		Student[1]  = new Testclass("김수현",69,82,71);
		Student[2]  = new Testclass("이철수",87,69,83);
		
		System.out.println("홍길동의 총" + Student[0]);
	}

} 



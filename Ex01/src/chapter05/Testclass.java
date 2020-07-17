package chapter05;

public class Testclass {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
public Testclass (String name,int kor,int eng,int math) {
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.sum = kor+eng+math;
	this.avg = this.sum/3;
	};
}// - 데이터가 아님

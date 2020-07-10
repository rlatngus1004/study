package Vo;

import Dto.Testmember;

public class testmain03 {

	public static void main(String[] args) {
		Vo.TestVo testvo = new Vo.TestVo();
		Dto.Testmember member1 = new Testmember();	
		System.out.println("public"+member1.field1);
		System.out.println("public"+member1.field2);
		System.out.println("public"+member1.field3);
		

	}
}

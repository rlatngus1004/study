package chapter12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		
		names.add("고");
		names.add("김");
		names.add("박");
		names.add("김");
		names.add("이");
		
		System.out.println(names.size());
		
		names.remove("김");
		
		System.out.println(names.size());
		
		//전체 조회
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			String name = itr.next();//처음은 -1번을 가르키고 다음 인덱스의 위치를 가져온다.
			System.out.println(name);
		}
		//데이터를 다시 조회하고 싶다면 iterator()메소드를 통해서 반복자를 다시 꺼내야 한다.
		
		

	}

}

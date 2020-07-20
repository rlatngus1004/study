package chapter12;

import java.util.Iterator;
import java.util.TreeSet;

public class Main4 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		names.add("고");
		names.add("박");
		names.add("김");
		names.add("최");
		names.add("이");
		names.add("송");
		
		System.out.println(names.first());
		System.out.println("--------------------------");
		System.out.println(names.last());
		System.out.println("--------------------------");
		System.out.println(names.lower("뷁"));//미만
		System.out.println("--------------------------");
		System.out.println(names.higher("뷁"));//초과
		System.out.println("--------------------------");
		System.out.println(names.ceiling("뷁"));//같거나 바로 위 - 같은거 찾음
		System.out.println("--------------------------");
		System.out.println(names.floor("이"));//같거나 바로 아래 - 같은거 찾음
		System.out.println("--------------------------");
		Iterator<String> itr = names.iterator();//Iterator = 반복자
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

package day19.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/*
	문제 5 ]
		Figure 클래스를 구현한 Circle 클래스를 제작하고
		TreeSet에 5개 입력하세요.
		그리고 Circle의 정보를 출력하세요.(Iterator, ArrayList)
		
		단, TreeSet을 만들때 Comparator를 입력해서 만드는 방법으로 처리하세요.
		
 */
public class Ex05 {

	public Ex05() {
		TreeSet Tset = new TreeSet();

		while(Tset.size() <= 5) {
			Tset.add(new Circle((int)(Math.random()*10+1)));
		}
		
		System.out.println(Tset);
		// Iterator 출력
		System.out.println();
		Iterator it = Tset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		// arraylist 출력
		System.out.println();
		ArrayList list = new ArrayList(Tset);
		System.out.println(list);

	}

	public static void main(String[] args) {
		new Ex05();
	}

}
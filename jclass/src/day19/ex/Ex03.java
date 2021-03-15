package day19.ex;

/*
	문제 3 ]
		Ex02에서 만든 ArrayList를 
		오름차순 정렬해서 출력하고
		내림차순 정렬해서 출력하세요.
		
		extra ]
			Comparator를 구현해서 처리해보세요.
 */
import java.util.*;

public class Ex03 {

	public Ex03() {

		Vector v = new Vector();

		v.add("a");
		v.add("b");
		v.add("e");
		v.add("f");
		v.add("i");
		v.add("j");
		v.add("g");
		v.add("h");
		v.add("c");
		v.add("d");

		ArrayList list = new ArrayList(v);
		
		System.out.println("정렬 전");
		System.out.println(list);
		
		System.out.println();
		System.out.println("오름차순");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println();
		System.out.println("내림차순");
		Collections.reverse(list);
		System.out.println(list);
		

	}

	public static void main(String[] args) {
		new Ex03();
	}

}
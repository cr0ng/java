package day19.ex;

import java.util.*;
import static java.lang.Math.*;

/*
	문제 4 ]
		HashSet을 만들고
		만들어진 해쉬셋에 Semo 클래스를 5개 입력하세요.
		단, 면적이 같으면 같은 클래스로 처리하세요.( equals() 함수 오버라이드..)
		
		입력된 세모클래스의 정보를 출력하세요.
			1) Iterator를 이용하는 방법
			2) ArrayList로 변환해서 처리하는 방법
 */
public class Ex04 {

	public Ex04() {
		
		HashSet set = new HashSet();
	
		while(set.size() < 5) {
//			Semo s = new Semo();
//			double area = s.getArea();
//			set.add(area);
			
			set.add(new Semo((int)(Math.random()*10+1),(int)(Math.random()*10+1)));
	
		}
		System.out.println(set);
		
		// Iterator 출력
		System.out.println();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// arraylist 출력
		System.out.println();
		ArrayList list = new ArrayList(set);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}


package day19;

import java.util.*;
public class Test09_01 {
	
	public Test09_01() {
		ArrayList crew = new ArrayList();
		
		// Test09에서 기억하고 있는 데이터를 가져와서
		// crew 에 한명씩 데이터를 채워보자.
		// 이름, 나이, 성별, 신장 순으로 채워보자.
		
		// 먼저 Test09 객체를 만들어야 그안의 멤버를 사용할 수 있다.
		Test09 data = new Test09();
		
		// 하나씩 꺼내서  crew에 채워보자.
		for(int i = 0 ; i < data.names.size(); i++ ) {
			ArrayList person = new ArrayList();
			person.add(data.names.get(i));
			person.add(data.ages.get(i));
			person.add(data.gens.get(i));
			person.add(data.kees.get(i));
			
			crew.add(person);
		}
		
		// 출력
		for(Object o : crew) {
			ArrayList tmp = (ArrayList) o;
			System.out.println(tmp);
		}
	}

	public static void main(String[] args) {
		new Test09_01();
	}

}
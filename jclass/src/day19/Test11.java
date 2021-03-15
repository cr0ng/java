package day19;

import java.util.*;
import static java.lang.Math.*;
public class Test11 {
/*
	ArrayList 에 10개의 Semo를 랜덤한 밑변과 높이로 채워보자.
	
	그리고 오름차순 정렬해서 출력해보자.
	
	그리고 내림차순으로 정렬해서 출력해보자.
 */
	public Test11() {
		// ArrayList 준비
		ArrayList list = new ArrayList();
		
		// list에 랜덤하게 10개의 Semo를 채운다.
		for(int i = 0 ; i < 10 ; i++ ) {
			list.add(new Semo(getSize(), getSize()));
		}
		// 내용 출력
		for(Object o : list) {
			/*
			Semo s = (Semo) o;
			s.toPrint();
			*/
			System.out.println(o);
		}
		System.out.println();
		
		// 오름차순 정렬
		Collections.sort(list, new MySort());
		// 내용 출력
		for(Object o : list) {
			Semo s = (Semo) o;
			s.toPrint();
		}
		System.out.println();
		
		// 내림차순 정렬
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Semo s1 = (Semo) o1;
				Semo s2 = (Semo) o2;
				
				double area1 = s1.getArea();
				double area2 = s2.getArea();
				
				int result = (area2 - area1 < 0) ? -1 : (area2 - area1 == 0)? 0 : 1;
				return result;
			}
			
		});
		// 내용 출력
		for(Object o : list) {
			Semo s = (Semo) o;
			s.toPrint();
		}
		System.out.println();
	}
	
	// 랜덤한 정수 (1 ~20) 반환해주는 함수
	public int getSize() {
		return (int)(random()*20 + 1);
	}
	public static void main(String[] args) {
		new Test11();
	}
	
	// 오름차순 정렬해주는 Comparator 구현 클래스
	public class MySort implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			// 이때 입력되는 Object o1, o2는 원래 타입이 Semo 타입이다.
			// 따라서 Semo 타입으로 강제 형변환을 해준다.
			Semo s1 = (Semo) o1;
			Semo s2 = (Semo) o2;
			
			double area1 = s1.getArea();
			double area2 = s2.getArea();
			
			// 그런데 이 경우 비교할 데이터가 실수 타입으로 반환해주는 값 타입으로 변경할 때 
			// 서로 다른 데이터라도 같은 데이터로 취급될 수 있다.
			// 따라서 이때는 강제로 1, -1 을 결과 값으로 반환해주도록 한다.
			
			int result = (area2 - area1 < 0) ? 1 : (area2 - area1 == 0)? 0 : -1;
			return result;
		}
		
	}
}
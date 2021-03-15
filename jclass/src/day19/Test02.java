package day19;

import java.util.*;
public class Test02 {

	public Test02() {
		Vector vec = new Vector();
		
		System.out.println("capacity : " +vec.capacity()); // capacity() - 저장공간의 갯수 알려주는 함수
		
		for(int i = 0 ; i < 5 ; i++ ) {
			vec.add(i);
		}
		System.out.println("capacity : " + vec.capacity()); // capacity() - 저장공간의 갯수 알려주는 함수
		// 벡터의 첫번째방의 데이터 출력
		int no = (int) vec.get(0);
		/*
			컬렉션에 데이터를 저장하면
			기본적으로 데이터가 Object 타입으로 자동 형변환이 되서 저장된다.
			따라서 꺼내서 사용할 때는 강제형변환으로 원래 타입에 맞는 형태고 변환시켜줘야 한다.
		 */
		System.out.println("no : " + no);
		
		// 벡터의 내용 모두 출력
		for(Object o : vec) {
			System.out.print(o + ", ");
		}
		System.out.println();
		// 저장된 데이터 갯수 출력
		int cnt = vec.size(); // 벡터에 기억된 데이터 갯수를 반환해주는 함수
		System.out.println("vec 데이터 갯수 : " + cnt);
		
		// 데이터 5개 추가
		for(int i = 0 ; i < 5 ; i++ ) {
			vec.add(i);
		}
		
		cnt = vec.size(); // 벡터에 기억된 데이터 갯수를 반환해주는 함수
		System.out.println("vec 데이터 갯수 : " + cnt);
		
		System.out.println("capacity : " + vec.capacity()); // capacity() - 저장공간의 갯수 알려주는 함수
		
		// 벡터에 "홍길동" 추가
		vec.add("홍길동");
		cnt = vec.size(); // 벡터에 기억된 데이터 갯수를 반환해주는 함수
		System.out.println("vec 데이터 갯수 : " + cnt);
		
		System.out.println("vec 의 저장공간 갯수 : " + vec.capacity()); // capacity() - 저장공간의 갯수 알려주는 함수
		
		for(int i = 0 ; i < 10 ; i++ ) {
			vec.add("둘리");
		}
		cnt = vec.size(); // 벡터에 기억된 데이터 갯수를 반환해주는 함수
		System.out.println("vec 데이터 갯수 : " + cnt);
		
		System.out.println("vec 의 저장공간 갯수 : " + vec.capacity()); // capacity() - 저장공간의 갯수 알려주는 함수
	}

	public static void main(String[] args) {
		new Test02();
	}

}
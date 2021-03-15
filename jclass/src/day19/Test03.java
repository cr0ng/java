package day19;

import java.util.*;
public class Test03 {

	public Test03() {
		// 벡터의 사이즈와 증가값을 정해서 벡터를 만들어보자.
		Vector vec = new Vector(5, 5);
		
		int tcnt = vec.capacity();	// 방갯수
		int cnt = vec.size();		// 데이터 갯수
		System.out.println("방갯수 : " + tcnt);
		System.out.println("데이터 갯수 : " + cnt);
		System.out.println();
		
		// 데이터 한개 추가
		vec.add("용수씨");
		
		tcnt = vec.capacity();	// 방갯수
		cnt = vec.size();		// 데이터 갯수
		System.out.println("방갯수 : " + tcnt);
		System.out.println("데이터 갯수 : " + cnt);
		System.out.println();
		
		// 데이터 5개 추가
		for(int i = 0 ; i < 5 ; i++ ) {
			vec.add("용수씨");
		}
		
		tcnt = vec.capacity();	// 방갯수
		cnt = vec.size();		// 데이터 갯수
		System.out.println("방갯수 : " + tcnt);
		System.out.println("데이터 갯수 : " + cnt);
		System.out.println();
		// 데이터 5개 추가
		for(int i = 0 ; i < 5 ; i++ ) {
			vec.add("용수씨");
		}
		
		tcnt = vec.capacity();	// 방갯수
		cnt = vec.size();		// 데이터 갯수
		System.out.println("방갯수 : " + tcnt);
		System.out.println("데이터 갯수 : " + cnt);
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
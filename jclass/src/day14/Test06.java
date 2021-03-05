package day14;

import day14.sub.*;

public class Test06 {

	public Test06() {
//		Sub01 s1 = new Sub01(); // 패키지가 다르기 때문이 안된다.\
		Sub02 s2 = new Sub02();
//		s2.no2 = 2000;	//	no2를 멤버로 가지는 클래스의 패키지가 다르기 때문
//		s2.no3 = 3000;
	}

	public static void main(String[] args) {
		new Test06();
	}

}

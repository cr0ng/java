package day19.ex;

import java.util.*;
/*
	문제 2 ]
		Ex01에서 만든 Vector를 이용해서
		ArrayList 를 만들고 
		데이터를 하나씩 꺼내서 출력하세요.
 */
public class Ex02 {

	public Ex02() {
		
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
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
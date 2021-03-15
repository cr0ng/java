package day19.ex;

import java.util.*;
/*
	문제 1 ]
		Vector 를 만들고 만들어진 Vector에 곡명 10개를 넣어서 출력하세요.
 */
public class Ex01 {

	public Ex01() {
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
		
	for(int i= 0 ; i < v.size(); i++)
		System.out.println((i+1) + "번째 곡명 : " + v.get(i));	
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
package day19.ex;

import java.util.*;
/*
	���� 1 ]
		Vector �� ����� ������� Vector�� ��� 10���� �־ ����ϼ���.
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
		System.out.println((i+1) + "��° ��� : " + v.get(i));	
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
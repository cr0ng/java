package day19.ex;

import java.util.*;
/*
	���� 2 ]
		Ex01���� ���� Vector�� �̿��ؼ�
		ArrayList �� ����� 
		�����͸� �ϳ��� ������ ����ϼ���.
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
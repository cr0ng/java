package day19.ex;

/*
	���� 3 ]
		Ex02���� ���� ArrayList�� 
		�������� �����ؼ� ����ϰ�
		�������� �����ؼ� ����ϼ���.
		
		extra ]
			Comparator�� �����ؼ� ó���غ�����.
 */
import java.util.*;

public class Ex03 {

	public Ex03() {

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
		
		System.out.println("���� ��");
		System.out.println(list);
		
		System.out.println();
		System.out.println("��������");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println();
		System.out.println("��������");
		Collections.reverse(list);
		System.out.println(list);
		

	}

	public static void main(String[] args) {
		new Ex03();
	}

}
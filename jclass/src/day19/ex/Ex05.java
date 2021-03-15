package day19.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/*
	���� 5 ]
		Figure Ŭ������ ������ Circle Ŭ������ �����ϰ�
		TreeSet�� 5�� �Է��ϼ���.
		�׸��� Circle�� ������ ����ϼ���.(Iterator, ArrayList)
		
		��, TreeSet�� ���鶧 Comparator�� �Է��ؼ� ����� ������� ó���ϼ���.
		
 */
public class Ex05 {

	public Ex05() {
		TreeSet Tset = new TreeSet();

		while(Tset.size() <= 5) {
			Tset.add(new Circle((int)(Math.random()*10+1)));
		}
		
		System.out.println(Tset);
		// Iterator ���
		System.out.println();
		Iterator it = Tset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		// arraylist ���
		System.out.println();
		ArrayList list = new ArrayList(Tset);
		System.out.println(list);

	}

	public static void main(String[] args) {
		new Ex05();
	}

}
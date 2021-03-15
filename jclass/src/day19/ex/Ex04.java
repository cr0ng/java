package day19.ex;

import java.util.*;
import static java.lang.Math.*;

/*
	���� 4 ]
		HashSet�� �����
		������� �ؽ��¿� Semo Ŭ������ 5�� �Է��ϼ���.
		��, ������ ������ ���� Ŭ������ ó���ϼ���.( equals() �Լ� �������̵�..)
		
		�Էµ� ����Ŭ������ ������ ����ϼ���.
			1) Iterator�� �̿��ϴ� ���
			2) ArrayList�� ��ȯ�ؼ� ó���ϴ� ���
 */
public class Ex04 {

	public Ex04() {
		
		HashSet set = new HashSet();
	
		while(set.size() < 5) {
//			Semo s = new Semo();
//			double area = s.getArea();
//			set.add(area);
			
			set.add(new Semo((int)(Math.random()*10+1),(int)(Math.random()*10+1)));
	
		}
		System.out.println(set);
		
		// Iterator ���
		System.out.println();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// arraylist ���
		System.out.println();
		ArrayList list = new ArrayList(set);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}


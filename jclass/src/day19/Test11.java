package day19;

import java.util.*;
import static java.lang.Math.*;
public class Test11 {
/*
	ArrayList �� 10���� Semo�� ������ �غ��� ���̷� ä������.
	
	�׸��� �������� �����ؼ� ����غ���.
	
	�׸��� ������������ �����ؼ� ����غ���.
 */
	public Test11() {
		// ArrayList �غ�
		ArrayList list = new ArrayList();
		
		// list�� �����ϰ� 10���� Semo�� ä���.
		for(int i = 0 ; i < 10 ; i++ ) {
			list.add(new Semo(getSize(), getSize()));
		}
		// ���� ���
		for(Object o : list) {
			/*
			Semo s = (Semo) o;
			s.toPrint();
			*/
			System.out.println(o);
		}
		System.out.println();
		
		// �������� ����
		Collections.sort(list, new MySort());
		// ���� ���
		for(Object o : list) {
			Semo s = (Semo) o;
			s.toPrint();
		}
		System.out.println();
		
		// �������� ����
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Semo s1 = (Semo) o1;
				Semo s2 = (Semo) o2;
				
				double area1 = s1.getArea();
				double area2 = s2.getArea();
				
				int result = (area2 - area1 < 0) ? -1 : (area2 - area1 == 0)? 0 : 1;
				return result;
			}
			
		});
		// ���� ���
		for(Object o : list) {
			Semo s = (Semo) o;
			s.toPrint();
		}
		System.out.println();
	}
	
	// ������ ���� (1 ~20) ��ȯ���ִ� �Լ�
	public int getSize() {
		return (int)(random()*20 + 1);
	}
	public static void main(String[] args) {
		new Test11();
	}
	
	// �������� �������ִ� Comparator ���� Ŭ����
	public class MySort implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			// �̶� �ԷµǴ� Object o1, o2�� ���� Ÿ���� Semo Ÿ���̴�.
			// ���� Semo Ÿ������ ���� ����ȯ�� ���ش�.
			Semo s1 = (Semo) o1;
			Semo s2 = (Semo) o2;
			
			double area1 = s1.getArea();
			double area2 = s2.getArea();
			
			// �׷��� �� ��� ���� �����Ͱ� �Ǽ� Ÿ������ ��ȯ���ִ� �� Ÿ������ ������ �� 
			// ���� �ٸ� �����Ͷ� ���� �����ͷ� ��޵� �� �ִ�.
			// ���� �̶��� ������ 1, -1 �� ��� ������ ��ȯ���ֵ��� �Ѵ�.
			
			int result = (area2 - area1 < 0) ? 1 : (area2 - area1 == 0)? 0 : -1;
			return result;
		}
		
	}
}
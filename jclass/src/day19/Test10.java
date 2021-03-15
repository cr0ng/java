package day19;

import static java.lang.Math.*;
import java.util.*;
public class Test10 {

	public Test10() {
		/*
			ArrayList�� �����ϰ� ���ڸ� �Է��� ��
			�̰��� �����ؼ� �������.
		 */
		ArrayList list = new ArrayList();
		// ������ ä���
		for(int i = 0 ; i < 10; i++) {
			int tmp = (int)(random()*20 + 1);
			
			list.add(tmp);
		}
		// list ���� Ȯ��
		System.out.println(list);
		
		// ������ �ؾ� �ϴµ� ���⼭�� Collections.sort(List list, Comparator c) �Լ��� ȣ���ؼ� ó���غ���.
		Collections.sort(list, new MySort()); // �̶� new MySort(); �� ����� Comparator Ÿ������ �ڵ� ����ȯ�� �ȴ�.
		// list ���� Ȯ��
		System.out.println(list);
		
		Collections.sort(list, new Comparator() { // ���� ���� Ŭ����
			@Override
			public int compare(Object o1, Object o2) {
				int no1 = (int) o1;
				int no2 = (int) o2;
				return no2 - no1;
			}
		});
		
		// list ���� Ȯ��
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		new Test10();
	}

	// �� Ŭ������ ��������Ŭ����(Global Inner Class)
	public class MySort implements Comparator {
		/*
			���� ����� �����ϱ� ���ؼ��� Comparator �������̽��� �����ϴ� Ŭ������ ������ �Ѵ�.
		 */
		/*
			�� Ŭ������ Ŭ�����̱� ������ �翬�ϰ� Object Ŭ������ ��ӹ޾Ƽ� ������� Ŭ�����̴�.
			���� Object Ŭ������ ����� ��� �� Ŭ�������� �����ϰ� �ȴ�.
			
			���� equals() �Լ��� ������ �Ǵµ�
			������ �� ���� equals()�� ����ؼ� ó���ϴ� ���� �ƴϴ�.
			
			������ �� ���� Ư�� ���ؿ� ���� �ΰ��� �Ӽ��� ũ�� �۳ķ� ������ �Ѵ�.
		 */
		@Override
		public int compare(Object o1, Object o2) {
			/*
				�� �Լ��� ������ �� �� ���� ����� o1, o2 �� ���޵Ǿ���´�.
				( ���� JVM�� �ڵ����� ȣ���ؼ� �־��ش�.)
				�츮�� �� ���� �� �ΰ��� �����͸� ���ؼ�
				��ġ�� �ٲ��� ������ �����ϸ� �ȴ�.
				
				�̶� ��ȯ���� 	�����̸� �ΰ��� ��ġ�� �ٲ��� �ʰ�
								����̸� �ٲ۴�.
								0�̸� �� �����Ͱ� ���ٶ�� �ǹ̰� �ȴ�.
			 */
			int no1 = (int) o1;
			int no2 = (int) o2;
			
			return -(no2 - no1);
		}
		
	}
}
package day19;

import java.util.*;
import static java.lang.Math.*;

public class Test12 {

	public Test12() {
		HashSet set = new HashSet();
		
		for(int i = 0 ; i < 5 ; i++ ) {
			set.add("ȫ�浿");
		}
		
		// ������ ���� ���
		System.out.println(set);
		
		HashSet set2 = new HashSet();
		// set2�� �����ϰ� �����͸� 10�� ��������. ��, �ߺ��� ������ �Ѵ�.
		while(set2.size() < 10) {
			int no = (int)(random()*30 + 1);
			set2.add(no);
		}
		System.out.println(set2);
		
		// �����͸� �ϳ��� ������ ����غ���.
		// 1. Iterator �� ��ȯ���Ѽ� ó���ϴ� ���
		Iterator itor = set2.iterator();
		while(itor.hasNext()) {
			// hasNext() - ���̻� ���� �����Ͱ� �ִ��� ����� �Լ�
			Object o = itor.next(); // ���� ������ ������ �Լ�
			int no = (int) o;
			System.out.print(no + " | ");
		}
		System.out.println();
		
		// 2. ArrayList�� ��ȯ�ؼ� ó���ϴ� ���
		System.out.println("##### ArrayList �� ��ȯ�ؼ� ó���ϴ� ��� #####");
		ArrayList list = new ArrayList(set2);
		// �����Ѵ�.
		Collections.sort(list); // ���� ���� ����
		// ���� ���
		System.out.println(list);
		
		// �������� ����
		Collections.reverse(list);
		// ���� ���
		System.out.println(list);
	}

	public static void main(String[] args) {
		new Test12();
	}

}
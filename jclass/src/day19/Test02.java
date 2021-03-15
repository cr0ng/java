package day19;

import java.util.*;
public class Test02 {

	public Test02() {
		Vector vec = new Vector();
		
		System.out.println("capacity : " +vec.capacity()); // capacity() - ��������� ���� �˷��ִ� �Լ�
		
		for(int i = 0 ; i < 5 ; i++ ) {
			vec.add(i);
		}
		System.out.println("capacity : " + vec.capacity()); // capacity() - ��������� ���� �˷��ִ� �Լ�
		// ������ ù��°���� ������ ���
		int no = (int) vec.get(0);
		/*
			�÷��ǿ� �����͸� �����ϸ�
			�⺻������ �����Ͱ� Object Ÿ������ �ڵ� ����ȯ�� �Ǽ� ����ȴ�.
			���� ������ ����� ���� ��������ȯ���� ���� Ÿ�Կ� �´� ���°� ��ȯ������� �Ѵ�.
		 */
		System.out.println("no : " + no);
		
		// ������ ���� ��� ���
		for(Object o : vec) {
			System.out.print(o + ", ");
		}
		System.out.println();
		// ����� ������ ���� ���
		int cnt = vec.size(); // ���Ϳ� ���� ������ ������ ��ȯ���ִ� �Լ�
		System.out.println("vec ������ ���� : " + cnt);
		
		// ������ 5�� �߰�
		for(int i = 0 ; i < 5 ; i++ ) {
			vec.add(i);
		}
		
		cnt = vec.size(); // ���Ϳ� ���� ������ ������ ��ȯ���ִ� �Լ�
		System.out.println("vec ������ ���� : " + cnt);
		
		System.out.println("capacity : " + vec.capacity()); // capacity() - ��������� ���� �˷��ִ� �Լ�
		
		// ���Ϳ� "ȫ�浿" �߰�
		vec.add("ȫ�浿");
		cnt = vec.size(); // ���Ϳ� ���� ������ ������ ��ȯ���ִ� �Լ�
		System.out.println("vec ������ ���� : " + cnt);
		
		System.out.println("vec �� ������� ���� : " + vec.capacity()); // capacity() - ��������� ���� �˷��ִ� �Լ�
		
		for(int i = 0 ; i < 10 ; i++ ) {
			vec.add("�Ѹ�");
		}
		cnt = vec.size(); // ���Ϳ� ���� ������ ������ ��ȯ���ִ� �Լ�
		System.out.println("vec ������ ���� : " + cnt);
		
		System.out.println("vec �� ������� ���� : " + vec.capacity()); // capacity() - ��������� ���� �˷��ִ� �Լ�
	}

	public static void main(String[] args) {
		new Test02();
	}

}
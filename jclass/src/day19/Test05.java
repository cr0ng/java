package day19;

import java.util.*;
public class Test05 {

	public Test05() {
		Vector vec = new Vector();
		vec.add("�Ѹ�");
		vec.add("ȫ�浿");
		vec.add("��浿");
		vec.add("����");
		vec.add("�����");
		
		ArrayList list = new ArrayList(vec);
		
		// ������ ���� ���
		int cnt = list.size();
		
		// ���� ���
		System.out.println(list); // toString()�� �ڵ�ȣ��....
		
		// ������ �߰�
		list.add("����");
		
		// ���� ���
		System.out.println(list); // toString()�� �ڵ�ȣ��....
		
		// ������ ������ ������ ���
		System.out.println("list ������ ������ : " + list.get(list.size() - 1));
	}

	public static void main(String[] args) {
		new Test05();
	}

}
package day19;

import java.util.*;
public class Test04 {

	public Test04() {
		Vector vec1 = new Vector();
		vec1.add("�Ѹ�");
		vec1.add("ȫ�浿");
		vec1.add("��浿");
		vec1.add("����");
		vec1.add("�����");
		
		Vector vec2 = new Vector(vec1);
		for(int i = 0 ; i < vec2.size(); i++ ) {
			System.out.print(vec2.get(i) + " | ");
		}
		System.out.println();
		
		// �ٽ� vec1������ �߰� 5��°����
		vec2.addAll(4, vec1); // 5��°���� ������ �߰�. 5��°�� �ִ� �����ʹ� �������� �̵�...
		for(int i = 0 ; i < vec2.size(); i++ ) {
			System.out.print(vec2.get(i) + " | ");
		}
		System.out.println();
		
		System.out.println(vec2);
	}

	public static void main(String[] args) {
		new Test04();
	}

}
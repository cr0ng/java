package day19;

import java.util.*;
public class Test03 {

	public Test03() {
		// ������ ������� �������� ���ؼ� ���͸� ������.
		Vector vec = new Vector(5, 5);
		
		int tcnt = vec.capacity();	// �氹��
		int cnt = vec.size();		// ������ ����
		System.out.println("�氹�� : " + tcnt);
		System.out.println("������ ���� : " + cnt);
		System.out.println();
		
		// ������ �Ѱ� �߰�
		vec.add("�����");
		
		tcnt = vec.capacity();	// �氹��
		cnt = vec.size();		// ������ ����
		System.out.println("�氹�� : " + tcnt);
		System.out.println("������ ���� : " + cnt);
		System.out.println();
		
		// ������ 5�� �߰�
		for(int i = 0 ; i < 5 ; i++ ) {
			vec.add("�����");
		}
		
		tcnt = vec.capacity();	// �氹��
		cnt = vec.size();		// ������ ����
		System.out.println("�氹�� : " + tcnt);
		System.out.println("������ ���� : " + cnt);
		System.out.println();
		// ������ 5�� �߰�
		for(int i = 0 ; i < 5 ; i++ ) {
			vec.add("�����");
		}
		
		tcnt = vec.capacity();	// �氹��
		cnt = vec.size();		// ������ ����
		System.out.println("�氹�� : " + tcnt);
		System.out.println("������ ���� : " + cnt);
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
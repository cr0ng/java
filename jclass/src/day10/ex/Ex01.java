package day10.ex;
/*
 	������ �Է��ϸ� �Է��� ������ ���������� �ϴ� ����
 	�ѷ�, ���̸� �Ѳ����� ��ȯ���ִ� �Լ��� ����� �����ؼ� ����� ����ϼ���.
 	�������� 15 ~ 45 ���̷� �����ϰ� �Էµǰ� �ϼ���.
 */

import java.util.Arrays;

public class Ex01 {
	
	public Ex01() {
		//String str = new String();
		
		int r = (int)(Math.random()*(45 - 15 + 1)+15);
		double[] circle = setcircle(r);
		
		System.out.println("������ : " + circle[0]);
		System.out.println("�ѷ� : " + circle[1]);
		System.out.println("���� : " + circle[2]);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

	double[] setcircle(int a) {
		double[] result = new double[3];
		
		result[0] = a;
		result[1] = 2 * Math.PI * a;
		result[2] = Math.PI* a * a;
		
		return result;
	}
}

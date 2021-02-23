package day07;

import java.util.*;

/*
 	1 ~ 50 ������ ���� 10���� ����� �迭�� �����
 	�����ϰ� ������ �Է��� ��
 	�Էµ� �� �� ���� ū ���� ������ִ� ���α׷��� �ۼ��ϼ���...
 	�迭�� ��� ���뵵 ���� ����ϼ���.
 */
public class Test03 {

	public static void main(String[] args) {
		// ����
		// 1. ���� 10���� ����� �迭�� �����.
		int[] num = new int[10];
		
		// 2. �迭�� �����ϰ� ������ ä���
		for(int i = 0 ; i < 10 ; i++) {
			int no = (int)(Math.random()*50+1);
			num[i] = no;
		}
		
		//int tmp = num[10]; ==> ArrayIndexOutOfBoundsException �߻�
		
		// 3. ���� ū ���� ã��
		// ���� ù��° �濡 ä�� �����͸� ������ ����Ų��.
		int max = num[0];
		
		// �� ��° ����� �����͸� ������ ���ϰ�
		for(int i = 1 ; i < num.length ; i++) {
			// �ι�° ����� �����͸� ������
			int tmp = num[i];
			// ���Ѵ�
			// tmp�� max���� ũ�� tmp�� max�� ��ü�ϰ�...
			max = (max < tmp) ? tmp : max;
		}
		
		// 4. ������ش�.
		
		// �迭 ���� ����ϰ�
		System.out.println(Arrays.toString(num));
		
		// ���� ū �� ����ϰ�
		System.out.println("���� ū �� : " + max);
		
	}

}

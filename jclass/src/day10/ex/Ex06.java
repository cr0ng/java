package day10.ex;

import java.util.Arrays;

/*
���� 6 ]
		5���� ���ڸ� �����ϴ� �迭�� �Է¹޾Ƽ� �迭�� ���� ��� ���ڸ� ���ϴ� ����� 
		�Լ��� �����ϰ� ����� ����ϼ���.
		
		1. �迭�� �Է����ָ� �հ踦 ��ȯ���ִ� �Լ�
		
		�߰��۾� ]
			�� �濡 ���ڸ� �������ִ� �Լ�
			������ �Է��ϸ� ������ŭ�� ������ ����ϴ� �迭�� ���� ��ȯ���ִ� �Լ�
			
			�迭�� ���ڸ� �Է��ϸ� �迭�� ����� ���ڸ� ������ִ� �Լ�
 */
public class Ex06 {

	public Ex06() {
		int[] num = setData();
		System.out.println(Arrays.toString(num));
		System.out.println("�հ� : " + getSum(num));
	}
	public static void main(String[] args) {
		new Ex06();
	}

	// �迭�� �Է����ָ� ���� ��ȯ���ִ� �Լ�
	public int getSum(int[] num) {
		// ��ȯ�� ���� �����
		int sum = 0;
		// �հ� ����ϰ�
		for(int i = 0 ; i < num.length ; i++) {
			//�� ���� ������ �̾Ƽ� ���� ����ϰ�
			sum += num[i];
		}
		//�հ� ��ȯ���ְ�
		return sum;
	}
	
	// �迭 �����Լ�
	public int[] setData() {
		// ��ȯ���� �迭 �����
		int[] num = new int[5];
		// �����ͼ����ϰ�
		for(int i = 0 ; i < 5 ; i++) {
			num[i] = (int)(Math.random());
		}
		//�迭 ��ȯ���ְ�
		return num;
	}
}

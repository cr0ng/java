package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �� �� 
		
		//1. �Է¹��� ������ �غ�
		Scanner sc = new Scanner(System.in);
		
		// �Է¹��� �޽����� �����ش�.
		System.out.print("���ڸ� �Է��ϼ���! : ");
		
		//2. �Է��� �޾Ƽ�(���ڿ�) ������ ����Ŵ
		String snum = sc.nextLine();
		/*
		  	sc�� ������ ������ �ȿ� ����ִ� ������ �������� �ȴ�.
		  	���� �� ���� ������ �� �ִ�.
		 
		  	�׸��� �� �� ������ �� �ִ�.
		  	�̶��� �ι� �Է������ �Ѵ�.
		 */
		System.out.print("2.���ڸ� �Է��ϼ���! : ");
		String snum1 = sc.nextLine();
		//3. �Է¹��� ���ڿ��� ������ ��ȯ
		//	==> snum ������ �Է��� ���ڿ� �����Ͱ� ���Ǿ�������
		// 		snum�� ������ ��ȯ������
		int num = Integer.parseInt(snum);
		
		/*
		  Integer.parseInt(������); �Լ��� ���
		  �ԷµǴ� �����Ͱ� ���� ������ ���ڿ��� �ƴ� ���� 
		  ó���� �� �� �����Ƿ� ������ �߻�
		
		  �� ]
		 	Integer.parseInt("������")
		 		==> ������ ��ȯ �Ұ��� ���� �߻�
		 */

		//4. 100�� ���� ����� �ؼ� ������ ���
		int result = num - 100;
		
		//5. ����� ����Ѵ�.
		System.out.println("�Է¹��� ���ڿ� : " + snum);
		// <== �� �� ���Ǵ� ������ + �� ���տ�����
		System.out.println("���ڿ��� ��ȯ�� ���� : " + num);
		System.out.println("100�� �� ��� : " + result);
	}

}

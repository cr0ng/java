package day03;
/*
 	���� ]
 		������ �Է¹޾Ƽ�
 		¦���̸� "¦���Դϴ�"
 		Ȧ���̸� "Ȧ���Դϴ�"
 		(�ɼ�)0�̸� "0�Դϴ�"
 		
 		�� ��µǰ� ���α׷��� �ۼ��ϼ���.
 */

import java.util.*;
public class Test03 { 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int n = in.nextInt();
		
		String result = (n == 0) ? "0�Դϴ�":((n % 2 == 0) ? "¦���Դϴ�.":"Ȧ���Դϴ�.");
		String result1 = ((n % 2 == 0) ? ((n == 0)? "0":"¦���Դϴ�."):"Ȧ���Դϴ�.");
		System.out.println("�Է¹��� ���� " + result);
		System.out.println("�Է¹��� ���� " + result1);		
	}

}

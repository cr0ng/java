package day05.ex;
/*
���� 5 ]
	�ΰ��� ������ �Է¹޾Ƽ�
	�μ��� �ִ� ������� ������ִ� ���α׷��� �����ϼ���.
	
	���� ]
		�ִ� ����� ]
			�μ��� ���� �� �ִ� ���� ���� ū ��..
			
			�� ]
				6 �� 8�� �ִ� ������� 2�̴�.
				6 �� 9�� �ִ������� 3�̴�.
*/

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int gong = 1;
		System.out.print("����1�� �Է��ϼ��� : ");
		int n1 = in.nextInt();
		
		System.out.print("����2�� �Է��ϼ��� : ");
		int n2 = in.nextInt();
		
		for(int i = 1 ; (i <= n1 && i <= n2);i++ ) {
			if(n1 % i == 0 && n2 % i == 0) {
				gong = i;
			}
			
		}
		System.out.println(n1+"�� "+n2 +"�� �ִ������� "+ gong+"�̴�.");
		
	}

}

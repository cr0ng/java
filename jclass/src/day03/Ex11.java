package day03;
/*
 ���� 11 ]
	3�ڸ� ���ڸ� �Է¹޾Ƽ�
	�� ���ڿ��� ���� ����� 100�� ����� ����� ���ؼ���
	�󸶰� �ʿ������� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	�� ] 
		241 - 200�� �����Ƿ� 41�� �����Ѵ�.
 */

import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("3�ڸ� ���ڸ� �Է��ϼ��� : ");
		int num = in.nextInt();
		
		if(num % 100 != 0) {
			if(num % 100 >= 50) {
				int baek = ((num/100)+1)*100;
				System.out.println(num + "�� ���� ����� 100�� ����� "+ baek +" �̰� " + (baek-num) + "��ŭ �ʿ��ϴ�");
			}else {
				int baek = (num/100)*100;
				System.out.println(num + "�� ���� ����� 100�� ����� "+ baek +" �̰� " + (num-baek) + "��ŭ �����Ѵ�");
			}
		}else {
			System.out.println(num + "�� ���� ����� 100�� ����� " + num + " �̰� 0�� �ʿ��ϴ�");
		}
	}

}

package day04.ex;
/*
 ���� 4]
 	�������� ����ϴ� ���α׷��� �ۼ��ϼ���.
 	
 	�������� �뵵����
 				�ڵ�		�⺻���		�����
 		������	1		3800		245
 		�����	2		2400		157
 		������	3		2900		169
 		�����	4		3200		174
 		
 		������ ���� : �⺻��� + ��뷮 * �����

 		
 	�뵵 �ڵ�� ��뷮�� �Է¹޾Ƽ� �������� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �뵵�� �ڵ带 �Է��ϼ��� (1 ~ 4) : ");
		int code = in.nextInt();
		
		System.out.print("��뷮�� �Է��ϼ���.");
		int use = in.nextInt();
		
		if(code == 1) {
			System.out.println("������ ������ : " + (3800 + 245 * use));
		}else if(code == 2) {
			System.out.println("����� ������ : " + (2400 + 157 * use));
		}else if(code == 3) {
			System.out.println("������ ������ : " + (2900 + 169 * use));
		}else if(code == 4) {
			System.out.println("����� ������ : " + (3200 + 174 * use));
		}else {
			System.out.println("��Ȯ�� �ڵ尡 �Էµ��� ����");
		}
			
	}

}

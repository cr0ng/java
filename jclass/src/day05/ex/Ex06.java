package day05.ex;
/*
���� 6 ]
	�� ������ �Է¹޾Ƽ�
	�� ������ �ּ� ������� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	���� ]
		�ּҰ������ �� ���� ������ �������� �ּ� ���ڸ� �̾߱��Ѵ�.
		
		2�� 3�� �ּ� ������� 6 �̴�.
		2�� 7�� �ּ� ������� 14�̴�.
		3�� 7�� �ּ� ������� 21�̴�.
*/
import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int bae = 1,gong = 1;
		System.out.print("����1�� �Է��ϼ��� : ");
		int n1 = in.nextInt();
		
		System.out.print("����2�� �Է��ϼ��� : ");
		int n2 = in.nextInt();
		
		in.close();
		
		for(int i = 1 ; (i <= n1 && i <= n2);i++ ) {
			if(n1 % i == 0 && n2 % i == 0) {
				gong = i;
			}
		}
		bae = n1 * n2 / gong;
		System.out.println(n1+"�� "+n2 +"�� �ּҰ������ "+ bae +"�̴�.");
		
		//������ �ڵ�
		int max = (n1 > n2)? n1 : n2;
		int result = 0;
		for(int i = max; true ; i++) {
			if(i % n1 == 0 && i % n2 == 0) {
				result = i;
				break;
			}
		}
		
		System.out.println("�Է��� �μ� "+ n1 + " �� " + n2 + 
								" �� �ּ� ������� " + result + "�Դϴ�.");
	}

}

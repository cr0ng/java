package day04.ex;
/*
 ���� 7 ]
	�����ϰ� ���ڸ� ���ڸ� �����
	����ڰ� ������ ���ڸ� �Է��ؼ�
	�Է��� ���� �߻��� ������ ū�� ������ �ƴϸ� �������� 
	������ִ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = (int)(Math.random()*(99-10+1)+1);
		System.out.print("2�ڸ� ���� �����ϼ��� : ");
		int ex = in.nextInt();
		
		if(ex > num) {
			System.out.println("�Է��� ��(" + ex +")�� �߻��� ��(" +num+ ")���� ũ��.");
		}else if(ex < num) {
			System.out.println("�Է��� ��(" + ex +")�� �߻��� ��(" +num+ ")���� �۴�.");
		}else {
			System.out.println("�Է��� ��("+ex+")�� �߻��� ��("+num+")�� ����.");
		}

	}

}

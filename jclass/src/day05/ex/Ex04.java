package day05.ex;
/*
���� 4 ]
	�ټ��ڸ� ���ڸ� �Է¹޾Ƽ�
	�Է¹��� ���ڰ� ȸ�������� �ƴ�����
	�Ǻ����ִ� ���α׷��� �����ϼ���.
	
	���� ]
		
		ȸ���� : �տ��� ������ �ڿ��� ������ ���� ����.
			�� ]
				12321
				45654
				
			�ƴѿ� ]
				12345
				12312
*/
import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ټ��ڸ� ���� �Է� ");
		String sno = in.nextLine();
		
		String result = "ȸ�����Դϴ�.";
		for(int i = 0 ; i < 2; i++) {
			char ch = sno.charAt(i);
			char ch1 = sno.charAt(4-i);
			
			if(ch != ch1) {
				result = "ȸ�������ƴմϴ�.";
				break;
			}
		}
			
		
			System.out.println(sno + "�� " + result);
		
		
		
		
	}

}

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

		int no = in.nextInt();
		
		int tmp = no;
		int no1 = 0;
		
		for(int i = 0 ; i <5 ; i++) {
			no1 = no1 * 10 + (tmp % 10);
			tmp = tmp / 10;
			
			/*
			 	i : 0	, no : 12345
			 		==> no1 : 5
			 			tmp : 1234
			 			
			 	i : 1	
			 	 	==> no1 : 54
			 	 		tmp : 123
			 	 		
			 	 ...
			 		
			 */
		}
		String result = (no == no1) ? "ȸ�����Դϴ�." : "ȸ������ �ƴմϴ�.";
		
		System.out.println(no + "�� " + result);
		
		/*
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
			
		*/
		
	}

}

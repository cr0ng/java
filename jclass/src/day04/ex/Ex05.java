package day04.ex;
/*
 	���� 5]
 		��ǻ�Ϳ� ���������� ������ �� ���α׷��� �����ϼ���.
 		
 		��ǻ�ʹ� �����ϰ� 1 ~ 3 ������ ���ڸ� �߻��ؼ�
 			1 - ����
 			2 - ����
 			3 - ��
 		�� �����ϰ�
 		����� ����  1 ~ 3 ������ ���ڸ� �Է��ϵ��� �Ѵ�.
 		
 		���� �̰���� Ȯ���ϴ� ���α׷��� �ۼ��ϼ���.
 		��ǻ�Ͱ� �̱�� -1�� ��ȯ�ϵ����ϰ�
		����ڰ� �̱�� 1�� ��ȯ�ϵ��� �ϰ�
		���� 0�� ��ȯ�ϵ����Ѵ�.
	
		��Ʈ ]
				��ǻ��		����		����		��
			�����	����		0		-1		1
					����		1		0		-1
					��		-1		1		0
 */

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int result = 0 ;
		int com = 0;
		com = (int)(Math.random()*3)+1;
		
		System.out.print("���������� (���� : 1, ���� : 2 , �� : 3) : ");
		int user = in.nextInt();
		
		System.out.println("����� : " + user);
		System.out.println("��ǻ�� : " + com);
		
		if((user-com) == 0 ) {
			result = 0;
		}else if(((user-com) == 1) || ((user-com) == -2)) {
			result = 1;
		}else if(((user-com) == -1) || ((user-com) == 2)) {
			result = -1;
		}else {	
		}
		
		switch(result) {
		case -1:
			System.out.println("��ǻ�Ͱ� �̱�");
			break;
		case 0:
			System.out.println("���");
			break;
		case 1:
			System.out.println("����ڰ� �̱�");
			break;
		default :
			System.out.println("����");
		}
	}

}

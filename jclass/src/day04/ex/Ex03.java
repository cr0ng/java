package day04.ex;
/*
	10 ~ 49 ������ �� �� ���� �ϳ��� �Է¹޾Ƽ�
		10 ~ 19 : �ѹ���
		20 ~ 29 : ������
		30 ~ 39 : ȸ���
		40 ~ 49 : ���ߺ�
		
	�� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	if ~ else if ����
	
	switch ~ case ����
	
	�ΰ��� ��� ó���ϼ���.
 */
import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("10 ~ 49 ������ �Է��ϼ��� : ");
		int num = in.nextInt();
		
		int dept = num / 10;
		
		//if ~ else if��
		/*
		if(dept == 1) {
			System.out.println("�ѹ���");
		}else if(dept == 2) {
			System.out.println("������");
		}else if(dept == 3) {
			System.out.println("ȸ���");
		}else if(dept == 4) {
			System.out.println("���ߺ�");
		}else
			System.out.println("10 ~ 49 ������ ������ �ƴմϴ�.");
		*/
		
		//switch��
		switch(dept){
			case 1:
				System.out.println("�ѹ���");
				break;
			case 2:
				System.out.println("������");
				break;
			case 3:
				System.out.println("ȸ���");
				break;
			case 4:
				System.out.println("���ߺ�");
				break;
			default :
				System.out.println("10 ~ 49 ������ ������ �ƴմϴ�.");
		}
		
	}

}

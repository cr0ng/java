package day02;
/*
 ���� 3 ]
	�ﰢ���� �غ��� ���̸� ������ �Է¹޾Ƽ�
	���̸� ������ִ� ���α׷��� �ۼ��ϼ���.	
*/
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�غ� ���� : ");
		int under = in.nextInt();
		
		System.out.print("���� ���� : ");
		int height = in.nextInt();
		
		double area = under * height / 2.0 ;
		
		/*
		 	double area = under * height / 2 ;
		 	������� �̷��� ����ϸ�
		 	�������� ������ ������� ���̰�
		 	�Ҽ��� ���ϴ� ������ �����Ͱ� ���������.
		 */
		System.out.println("�غ��� "+under+" ���̰� "+height+"�� �ﰢ���� ���̴� "+area);
	
	}

}

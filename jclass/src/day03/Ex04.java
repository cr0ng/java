package day03;
/*
 	���� 4]
 		�Ҽ����� �ִ� ���ڸ� �Է¹��� ��
 		�Ҽ����� ��°�ڸ����� �ݿø��� ����� ����ϼ���.
 		
 		��Ʈ ]
 			�Ҽ� ��°�ڸ����� �ݿø��� �ϸ�
 			+ 0.005
 			�� �����ְ� �� ���ϴ� ������ �ȴ�. <= * 100 �� ����� ������ ���� ����ȯ�ϸ� ���ϴ� ������ ���ڰ� ���������. 

 */
import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�Ҽ����� �ִ� ���� �Է� : ");
		double num = in.nextDouble();
		
		/*
		num += 0.005;
		int num1 = (int)(num * 100);
		System.out.println(num1);
		num = (double)num1/100;
		System.out.print("�Ҽ� ��°�ڸ����� �ݿø� : "+num);
		*/
		
		//������ �ڵ�
		double result = ((int)((num + 0.005)*100))/100.0;
		System.out.print(result);
	}

}

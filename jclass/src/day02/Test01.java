package day02;

/*
 	�������� �Է�(����)�޾Ƽ�
 	���� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
 */

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		// �� ��
		//1. �Էµ��� �غ�
		Scanner in = new Scanner(System.in);
		
		//2. �Է¸޼��� ���
		System.out.print("������ �Է� : ");
		
		//3. �Է¹ް�
		int r = in.nextInt();
		// ==> �� ��쵵 ���ڰ� �ƴ�  �ٸ� ���� �Ǵ� �Ǽ����¸� �Է��ϸ� ����
		
		//4. ���� ���
		double area = r * r * 3.14;
		
		//5. ���� ���
		System.out.println("�������� "+ r +"�� ���� ����  : "+area);
		

	}

}

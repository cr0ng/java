package day02;
/*
 ���� 2]
	�簢���� ���ο� ������ ���̸� ������ �Է¹޾Ƽ� 
	���̸� ������ִ� ���α׷��� �ۼ��ϼ���.
	
*/

import java.util.Scanner;

public class Ex02 {
	/*
	  ���� ����� ��Ģ ]
	  	���� ��� ���� ����� ������
	  	���� �̸��� ������ ���� �� ����.
	  	(���� ������ �̹� ������� �̸����δ� ���� �� �� ����)
	  	
	  	�� ] 
	  		int no = 10;
	  		...
	  		int no = 100;	==> ����� �ȵ�
	  		
	  		==>
	  			int no = 10;
	  			...
	  			no = 100
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		int garo = in.nextInt();
		System.out.print("���� ���� �Է� : ");
		int sero = in.nextInt();
		
		int area = garo * sero;
		
		System.out.println("���ΰ� "+garo+" ���ΰ� "+sero+"�� �簢���� ���� : "+ area);
		System.out.printf("%3s : %5d \n%3s : %5d\n%3s : %5d",
						 "����",garo,"����",sero,"����",area);	

	}

}

package day05;
/*
 	���� �Է¹޾Ƽ�
 	�ش� ���� �������� ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	-------------------------------------
 	
 	���� ����ϸ� �ٽ� ���� �Է¹޵��� �ϰ�
 	0�� �Է��ϸ� ���α׷� ����ǵ���
 	���α׷��� �ۼ��ϼ���.
 */

import java.util.*;
public class Test09 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("���? ");
	int dan = in.nextInt();
	
	System.out.println("***** " + dan + "�� *****");
	for(int i = 0 ; i < 9; i ++) {
		System.out.println(dan + " X "+ (i+1) + " = " +(dan*(i+1)));
	}

	}

}

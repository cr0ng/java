package day07.ex;

import java.util.Arrays;

/*
 	�ݺ��� ����
 		�Ǻ���ġ ������ ��������.
 		
 		�Ǻ���ġ �����̶�?
 		
 		1 1 2 3 5 8 13 21 ...
 		���
 		1 1
 		+	2
 		  1+2
 		  	 3
 		  	 
 		��, 20���� ���� ����ϼ���.
 */
public class Ex03 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		
		System.out.print(num1+"	");
		System.out.print(num2+"	");
		
		for(int i = 0 ; i < 18 ; i++) {
			int result = num1+ num2;
			System.out.print(result + "	");
			num1 = num2;
			num2 = result;
		}
		System.out.println();
			
		// ������ �ڵ�
			int[] num = new int[20];
			num[0] = 1;
			num[1] = 1;
			for(int j = 2 ; j < 20 ; j++) {
				int no1 = num[j-2];
				int no2 = num[j-1];
				num[j] = no1+ no2;
			}
			System.out.println(Arrays.toString(num));
		
	}

}

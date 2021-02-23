package day07.ex;

import java.util.Arrays;

/*
 	���� 2]
 		���� 10���� ����� �迭�� �����
 		�� �迭�� 
 		0 ~ 9 ������ ���� 100���� �߻����Ѽ� �߻��� ������ Ƚ���� ����Ű��
 		����� ����ϼ���.
 		
 		[2, 10, 3, 0, 0, 0, 0, 0, 0, 0]
 		 0  1   2  3  4
 		 
 		 1. ���ڷ� ���
 		 
 		 2. *�� ���
 		 0 : **
 		 1 : **********
 		 2 : ***
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0 ; i < 100 ; i++) {
			int no = (int)(Math.random()*10);
			arr[no]++;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		for(int j = 0 ; j < arr.length ; j++) {
			System.out.print(j + " : ");
			for(int k = 0 ; k < arr[j]; k++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}

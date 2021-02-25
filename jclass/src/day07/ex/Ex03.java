package day07.ex;

import java.util.Arrays;

/*
 	반복문 문제
 		피보나치 수열을 만들어보세요.
 		
 		피보나치 수열이란?
 		
 		1 1 2 3 5 8 13 21 ...
 		방법
 		1 1
 		+	2
 		  1+2
 		  	 3
 		  	 
 		단, 20개를 만들어서 출력하세요.
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
			
		// 선생님 코드
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

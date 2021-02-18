package day03;
/*
 	문제 ]
 		정수를 입력받아서
 		짝수이면 "짝수입니다"
 		홀수이면 "홀수입니다"
 		(옵션)0이면 "0입니다"
 		
 		가 출력되게 프로그램을 작성하세요.
 */

import java.util.*;
public class Test03 { 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = in.nextInt();
		
		String result = (n == 0) ? "0입니다":((n % 2 == 0) ? "짝수입니다.":"홀수입니다.");
		String result1 = ((n % 2 == 0) ? ((n == 0)? "0":"짝수입니다."):"홀수입니다.");
		System.out.println("입력받은 수는 " + result);
		System.out.println("입력받은 수는 " + result1);		
	}

}

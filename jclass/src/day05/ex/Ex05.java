package day05.ex;
/*
문제 5 ]
	두개의 정수를 입력받아서
	두수의 최대 공약수를 출력해주는 프로그램을 제작하세요.
	
	참고 ]
		최대 공약수 ]
			두수를 나눌 수 있는 수중 제일 큰 수..
			
			예 ]
				6 과 8의 최대 공약수는 2이다.
				6 과 9의 최대공약수는 3이다.
*/

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int gong = 1;
		System.out.print("정수1을 입력하세요 : ");
		int n1 = in.nextInt();
		
		System.out.print("정수2를 입력하세요 : ");
		int n2 = in.nextInt();
		
		for(int i = 1 ; (i <= n1 && i <= n2);i++ ) {
			if(n1 % i == 0 && n2 % i == 0) {
				gong = i;
			}
			
		}
		System.out.println(n1+"과 "+n2 +"의 최대공약수는 "+ gong+"이다.");
		
	}

}

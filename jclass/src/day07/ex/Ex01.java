package day07.ex;

import java.util.Arrays;

/*
 	문제 1]
 		정수 10개를 기억할 배열을 만들고
 		랜덤하게 1 ~ 50 사이의 정수를 발생시켜서 입력하고
 		발생된 수 중 제일 작은 값을 출력하는 프로그램을 작성하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		int num[] = new int[10];
		
		for(int i = 0 ; i < num.length ; i++) {
			int no = (int)(Math.random()*50 +1);
			num[i] = no;
		}
		
		int min = num[0];
		
		for(int i = 1 ;i < num.length ; i++) {
			int tmp = num[i];
			min = (min < tmp) ? min : tmp;
		}
		
		System.out.println(Arrays.toString(num));
		
		System.out.println("가장 작은 값 : " + min );
	}
	
}

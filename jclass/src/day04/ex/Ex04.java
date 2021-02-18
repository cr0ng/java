package day04.ex;
/*
 문제 4]
 	전기요금을 계산하는 프로그램을 작성하세요.
 	
 	전기요금은 용도별로
 				코드		기본요금		사용요금
 		가정용	1		3800		245
 		산업용	2		2400		157
 		교육용	3		2900		169
 		상업용	4		3200		174
 		
 		전기요금 계산식 : 기본요금 + 사용량 * 사용요금

 		
 	용도 코드와 사용량을 입력받아서 전기요금을 계산해주는 프로그램을 작성하세요.
 */
import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("전기 용도의 코드를 입력하세요 (1 ~ 4) : ");
		int code = in.nextInt();
		
		System.out.print("사용량을 입력하세요.");
		int use = in.nextInt();
		
		if(code == 1) {
			System.out.println("가정용 전기요금 : " + (3800 + 245 * use));
		}else if(code == 2) {
			System.out.println("산업용 전기요금 : " + (2400 + 157 * use));
		}else if(code == 3) {
			System.out.println("교육용 전기요금 : " + (2900 + 169 * use));
		}else if(code == 4) {
			System.out.println("상업용 전기요금 : " + (3200 + 174 * use));
		}else {
			System.out.println("정확한 코드가 입력되지 않음");
		}
			
	}

}

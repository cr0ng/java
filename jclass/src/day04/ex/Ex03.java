package day04.ex;
/*
	10 ~ 49 까지의 수 중 정수 하나를 입력받아서
		10 ~ 19 : 총무부
		20 ~ 29 : 영업부
		30 ~ 39 : 회계부
		40 ~ 49 : 개발부
		
	로 출력해주는 프로그램을 작성하세요.
	
	if ~ else if 구문
	
	switch ~ case 구문
	
	두가지 모두 처리하세요.
 */
import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("10 ~ 49 정수를 입력하세요 : ");
		int num = in.nextInt();
		
		int dept = num / 10;
		
		//if ~ else if문
		/*
		if(dept == 1) {
			System.out.println("총무부");
		}else if(dept == 2) {
			System.out.println("영업부");
		}else if(dept == 3) {
			System.out.println("회계부");
		}else if(dept == 4) {
			System.out.println("개발부");
		}else
			System.out.println("10 ~ 49 사이의 정수가 아닙니다.");
		*/
		
		//switch문
		switch(dept){
			case 1:
				System.out.println("총무부");
				break;
			case 2:
				System.out.println("영업부");
				break;
			case 3:
				System.out.println("회계부");
				break;
			case 4:
				System.out.println("개발부");
				break;
			default :
				System.out.println("10 ~ 49 사이의 정수가 아닙니다.");
		}
		
	}

}

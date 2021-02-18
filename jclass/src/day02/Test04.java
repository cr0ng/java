package day02;

/*
 	반지름이 5인 원의 둘레를 출력하는 프로그램 작성
 */
// 연산의 결과를 기억하려면 대입연산자가 필요
import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름  : ");
		System.out.println("반지름이 5인 원의 둘레는 " + ( 2*(sc.nextInt())*3.14));
		
		/*
		 	위에 출력내용중
		 	연산 결과만 다시 사용하려고 한다면
		 	다시 연산해줘야 한다.
		 */
		
		
	}

}

package day02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 할 일 
		
		//1. 입력받을 도구를 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력받을 메시지를 보여준다.
		System.out.print("숫자를 입력하세요! : ");
		
		//2. 입력을 받아서(문자열) 변수에 기억시킴
		String snum = sc.nextLine();
		/*
		  	sc는 내용을 꺼내면 안에 담겨있는 내용은 지워지게 된다.
		  	따라서 한 번만 꺼내올 수 있다.
		 
		  	그리고 두 번 실행할 수 있다.
		  	이때는 두번 입력해줘야 한다.
		 */
		System.out.print("2.숫자를 입력하세요! : ");
		String snum1 = sc.nextLine();
		//3. 입력받은 문자열을 정수로 변환
		//	==> snum 변수에 입력한 문자열 데이터가 기억되어있으니
		// 		snum을 정수로 변환해주자
		int num = Integer.parseInt(snum);
		
		/*
		  Integer.parseInt(데이터); 함수의 경우
		  입력되는 데이터가 정수 형태의 문자열이 아닌 경우는 
		  처리를 할 수 없으므로 에러가 발생
		
		  예 ]
		 	Integer.parseInt("가나다")
		 		==> 정수로 변환 불가능 에러 발생
		 */

		//4. 100을 빼는 계산을 해서 변수에 기억
		int result = num - 100;
		
		//5. 결과를 출력한다.
		System.out.println("입력받은 문자열 : " + snum);
		// <== 이 때 사용되는 연산자 + 는 결합연산자
		System.out.println("문자열을 변환한 정수 : " + num);
		System.out.println("100을 뺀 결과 : " + result);
	}

}

package day01;

/**
 * 
 * @author 김유진
 * @since 2021.02.15
 * @version v.1.0
 * 
 * 			이 클래스는 변수 생성 실습용 클래스이다.
 *
 */
public class Test05 {

	public static void main(String[] args) {
		/*
		  { } : 영역, 블럭이라고 부른다.
		  
		  ;	  : 하나의 명령이 끝났음을 알려주는 기호
		  		토큰이라고 이야기한다.
		*/
		// 함수 내부에 변수를 만들어도 된다.
		String str1;	// 스택에 str1이라는 별칭으로 문자열을 기억할 변수를 할당받겠습니다.
		str1 = "hong gil dong";
		// 준비된 str1 변수에 데이터 "hong gil dong"의 주소를 기억하겠습니다.
		
		// 정수형 변수
		int num;
		num = 256;
		
		// 문자 변수
		char ch01 = '@';
		
		System.out.println("str1 : " + str1);
		System.out.println("num : " + num);
		System.out.println("ch01 : " + ch01);
		
		/*
		  	참고 ]
		  		문자열 + 다른타입데이터 ==> 문자열
		  		
		  		정수 + (*,/,-,%) 실수	==> 실수 
		  		
		  		<== 실수의 크기가 더 크기 때문에..
		  		
		  		모든  연산의 결과는 타입이 큰 타입으로 만들어진다.
		 */
		
		int rad = 10;
		double area = rad * rad * 3.14;
		
		System.out.println("반지름이 " + rad + " 인 원의 넓이는 " + area + " 입니다.");
	}
	

}

package day02;
/*
 	상수
 		데이터를 변경할 수 없는 변수

 		형식 ]
 			
 			final 데이터타입 상수이름(대문자) = 데이터;
 */
public class Test06 {
//	final double pi;
	
	public static void main(String[] args) {
		final double PI;
		PI = 3.14;
		// 상수의 경우는 선언과 초기화를 같이 해줘야 한다.
		System.out.println(PI);
	}
}

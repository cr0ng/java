package day03;
/*
 	문제 6 ]
 		소문자를 랜덤하게 발생시켜서
 		그 문자를 대문자로 변환시켜서 출력하세요.
 */
public class Ex06 {

	public static void main(String[] args) {

		char low = (char)(Math.random()*('z'-'a'+1)+'a');
		
		System.out.println("소문자 랜덤 출력 : "+low);
		
		char up = (char)(low - ('a'-'A'));
		
		System.out.println("대문자로 변환 : "+up);
	}

}

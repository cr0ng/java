package day03;
/*
 	'a' ~ 'z' 를 랜덤하게 발생시켜서 출력하세요.
 	
 	참고 ]
 		알파벳은 아스키 코드값을 이용해서 기억한다.
 */
public class Test08 {

	public static void main(String[] args) {
		int lo = 'a';
		int hi = 'z';
		
		char ch = (char)(Math.random() * (hi - lo + 1) + lo);
		
		System.out.println("'a' ~ 'z' 사이의 랜덤한 문자 : " + ch);
	}

}

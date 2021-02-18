package day03;
/*
 	0 ~ 255 사이의 아스키 코드값을 가지는 랜덤한 문자를 발생시켜서
 	이 문자가 영문자인지 아닌지 판별해서 출력하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		int hi = 255;
		int lo = 0;
		
		char ch = (char)(Math.random()*(hi-lo+1)+lo);
		String str = ((ch >= 'A' & ch <='Z') || (ch >= 'a' & ch <='z')) ? "영문자이다" : "영문자가 아니다";

		System.out.println(ch + "는 "+ str);
	}

}

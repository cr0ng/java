package day03;
/*
	1 ~ 10 사이의 숫자를 랜덤하게 발생시켜서
	짝수인지 홀수인지 판별해서 출력하는 프로그램을 제작하세요.
	
	if else 명령으로 처리하세요.
*/
public class Test11 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10+1);
		
		String result = " ";
		
		if(num % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		
		System.out.println("랜덤하게 발생한 숫자 "+num+" 은 " + result + "입니다."); 
	}

}

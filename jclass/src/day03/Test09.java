package day03;
/*
	1 ~ 5 사이의 정수를 랜덤하게 발생시켜서
		 1인 경우 "하나"
		 2인 경우 "둘"
		 3인 경우 "셋"
		 ...
		 5인 경우 "다섯"
	으로 출력되게 프로그램을 작성하세요.
 */
public class Test09 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6);
		
		String result = " ";
		
		switch(num){
		case 1:
			result = "하나";
			break;
		case 2:
			result = "둘";
			break;
		case 3:
			result = "셋";
			break;
		case 4:
			result = "넷";
			break;
		case 5:
			result = "다섯";
			break;
		default:
			result = "잘못된 숫자";
		}
			System.out.println("랜덤하게 발생한 숫자 : "+num);
			System.out.println("한글 숫자 : " + result);
		
	}

}

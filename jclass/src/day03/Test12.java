package day03;
/*
	두 자리 숫자를 랜덤하게 발생시켜서
	십의 자리 단위를 출력해주는 프로그램을 작성하세요.
	단, if else if 구문을 사용해서 처리하세요.
	예 ]
		34 ==> 십의 자리가 3인 숫자입니다.
 */
public class Test12 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*(99-10+1)+10);
		
		String result = " ";
		if(num >= 90) {
			result = "9";
		} else if(num >= 80) {
			result = "8";
		} else if(num >= 70) {
			result = "7";
		} else if(num >= 60) {
			result = "6";
		} else if(num >= 50) {
			result = "5";
		} else if(num >= 40) {
			result = "4";
		} else if(num >= 30) {
			result = "3";
		} else if(num >= 20) {
			result = "2";
		} else  {
			result = "1";
		}
			
		System.out.println("랜덤하게 발생한 숫자 " + num + " 의 십의 자리는 "+ result + "입니다");
		
	}

}

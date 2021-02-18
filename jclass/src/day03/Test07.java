package day03;

/*
 	100 ~ 200 사이의 숫자를 랜덤하게 만들어서 출력하세요.
 	공식 ]
 		(int)(Math.random() * (큰수 - 작은수 + 1) + 작은수);
 */
public class Test07 {

	public static void main(String[] args) {
		int lo = 100;
		int hi = 200;
		int result = 0;
		
		result = (int)(Math.random() * (hi-lo+1)+lo);
		System.out.println("100 ~ 200 사이의 랜덤한 정수 : " + result);
	}

}

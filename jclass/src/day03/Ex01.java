package day03;
/*
	문제 1]
	   3자리 숫자를 랜덤하게 발생시켜서 
	   백자리 미만은 버린 숫자를 만들어서 출력하세요.
*/
public class Ex01 {

	public static void main(String[] args) {
		int hi = 999;
		int lo = 100;
		int num = 0;
		
		num = (int)(Math.random()*(hi-lo+1)+lo);
		System.out.println("처음 랜덤수 : " + num);
		
		num /= 100;
		num *= 100;
		
		System.out.println("백자리 미만 버린수 : " + num);
	}

}

package day06.ex;
/*
 	1 + 1 + 2 + 1 + 2 + 3 +  ... + 19 + 20
 	의 더한 결과를 출력하는 프로그램을 작성하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		for(int i = 0 ; i < 20 ; i++) {
			num = (i+1) * (20-i);
			sum += num;
		}
		System.out.println("결과값 : "+sum);
	}

}

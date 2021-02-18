package day03;

public class Test04 {

	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 20;
		
		System.out.println("no1 > no2 : "+(no1 > no2));
		// 비교연산자는 결합연산자보다 우선순위가 낮다.
		// 따라서 결합연산자 또는 산술연산자와 혼합해서 사용할 경우는 () 이요해서
		// 영역을 구분해서 연산처리를 해줘야한다.
		
		System.out.println("(no1 >= 10) & (no2 == 20) : " + ((no1 >= 10) & (no2 == 20)));
		
		System.out.println("(no1 == 10) & (no2 > 20) : " + ((no1 == 10) & (no2 > 20)));

		System.out.println("(no1 == 10) | (no2 > 20) : " + ((no1 == 10) | (no2 > 20)));
	}

}

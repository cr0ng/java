package day10.ex;
/*
 	정수를 입력하면 입력한 정수를 반지름으로 하는 원의
 	둘레, 넓이를 한꺼번에 반환해주는 함수를 만들고 실행해서 결과를 출력하세요.
 	반지름은 15 ~ 45 사이로 랜덤하게 입력되게 하세요.
 */

import java.util.Arrays;

public class Ex01 {
	
	public Ex01() {
		//String str = new String();
		
		int r = (int)(Math.random()*(45 - 15 + 1)+15);
		double[] circle = setcircle(r);
		
		System.out.println("반지름 : " + circle[0]);
		System.out.println("둘레 : " + circle[1]);
		System.out.println("넓이 : " + circle[2]);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

	double[] setcircle(int a) {
		double[] result = new double[3];
		
		result[0] = a;
		result[1] = 2 * Math.PI * a;
		result[2] = Math.PI* a * a;
		
		return result;
	}
}

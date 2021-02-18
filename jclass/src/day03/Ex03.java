package day03;
/*
 	문제 3 ]
 		화씨 온도 100도는
 		섭씨 온도 몇도인지를 알아보는 프로그램을 작성하세요.
 		
 		공식 ]
 			섭씨온도 = 5 / 9 * (화씨온도 - 32)
 */
public class Ex03 {

	public static void main(String[] args) {

		int f = 100;
		
		double c = 5/ 9.0 * (f - 32);
		
		System.out.println("화씨 온도 " +f +"도는 섭씨 "+c+"도이다.");
	}

}

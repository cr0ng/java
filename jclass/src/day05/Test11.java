package day05;

public class Test11 {

	public static void main(String[] args) {
		// 5단 구구단을 출력하는데 곱이 5인 경우는 건너뛰고 출력하세요.
		
		int dan = 5;
		for(int i = 0 ; i < 9 ; i++) {
			int gop = i + 1;
			
			if(gop == 5) {
				//break;
				continue;
			}
			System.out.println(dan + " X " + gop + " = " + (dan * gop));
		}

	}

}

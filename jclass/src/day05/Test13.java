package day05;

public class Test13 {

	public static void main(String[] args) {
		// 구구단을 출력하는데 5단은 곱이 5까지만 출력하고 이후 단을 출력하세요.
		
		for(int dan = 2 ; dan < 10; dan++) {
			System.out.println("*** "+dan+" 단***");
				for(int gop = 1 ; gop < 10 ; gop++) {
					System.out.println(dan + " X " + gop + " = " + (dan * gop));
					
				}
				System.out.println();
		}
	}

}

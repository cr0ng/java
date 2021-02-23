package day06.ex;
/*
 	 주사위 두개를 던져서 합이 6이 나오는 경우를 모두 출력하세요.
 */
public class Ex04 {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 6 ; i++) {
			for(int j = 1 ; j <=6 ; j++) {
				if(i+j==6) {
					System.out.println("합이 6인 경우 : " + i+" , "+j);
				}
			}
		}
	}

}

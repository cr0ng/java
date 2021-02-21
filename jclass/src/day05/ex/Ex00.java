package day05.ex;
/*
1 ~ 100 까지 합을 구해주는 프로그램을 작성하세요..
*/
public class Ex00 {

	public static void main(String[] args) {
		// 합계를 기억할 변수. 0으로 초기화 해둔다.
				int sum = 0;
				
				for(int i = 0; i < 100; i++) {
					sum = sum + (i + 1);
				}
				
				System.out.println("1 ~ 100 까지의 합은 " + sum + "입니다.");
	}

}

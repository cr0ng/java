package day06.ex;
/*
 	두자리의 랜덤한 숫자 10개를 발생시켜서 합을 구하는 프로그램을 작성하세요.
 */
public class Ex06 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random()*(99-10+1)+10);
			System.out.print(n + " ");
			sum += n;
		}
		System.out.println();
		System.out.println("10개 숫자의 합 : " + sum);
	}

}

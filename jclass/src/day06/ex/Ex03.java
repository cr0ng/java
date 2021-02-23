package day06.ex;
/*
 	5자리 숫자를 (10000 ~ 99999) 랜덤하게 발생한 후
 	각 자리 숫자의 합을 구하는 프로그램을 작성하세요.
 */
public class Ex03 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*(99999-10000+1)+10000);
		System.out.println("5자리 숫자 랜덤 출력 : "+num);
		
		int no ;
		int tmp = num;
		int sum =0;
		
		for(int i = 0 ; i < 5; i++) {
			no = tmp % 10;
			tmp = tmp /10;
			sum += no;
		
		}
		System.out.println("각 자리수의 합 : "+sum);
	}

}

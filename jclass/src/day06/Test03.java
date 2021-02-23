package day06;

/*
 	1 ~ 10 까지 곱한 결과를 출력하세요.
 	
 	3! = 1 * 2 * 3
 	7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
 */
public class Test03 {

		public static void main(String[] args) {
			
			int result =1;
			
			for(int i = 1 ; i <= 10 ; i++) {
				result*=i;
			}
			System.out.println("10!은 "+result);
		}
}

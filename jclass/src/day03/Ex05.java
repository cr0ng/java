package day03;
/*
 	문제 5 ]
 		25 ~ 95 사이의 숫자하나를 랜덤하게 발생시킨후
 		그 숫자와 가장 가까운 10의 배수를 출력해주는 프로그램을 작성하세요.
 		발생한 숫자와 가까운 10의 배수를 모두 출력하세요.
 		
 		예 ]
 			27 ==> 30
 			32 ==> 30
 */
public class Ex05 {

	public static void main(String[] args) {
		int hi = 95;
		int lo = 25;
				
		int num = (int)(Math.random()*(hi-lo+1)+lo);
		/*
		int sip = ((num-((num/10)*10))>=5) ? ((num/10)*10)+10 : (num/10)*10;
		
		System.out.println(num + "가 가장 가까운 10의 배수는 "+ sip);
		*/
		//선생님 코드
		int rest = num % 10;
		
		int result = (rest <5) ? (num / 10 * 10) : ((num / 10 + 1)*10);
		
		System.out.println(num + "과 가까운 10의 배수 :" + result);
		
	}

}

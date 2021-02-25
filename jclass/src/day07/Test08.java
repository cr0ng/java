package day07;

import java.util.Arrays;

/*
 	1 ~ 45 사이의 정수를 랜덤하게 6개를 발생해서
 	배열에 담고
 	정열해서 출력하세요.
 */
public class Test08 {

	public static void main(String[] args) {
		
		// 배열을 만든다.
		int[] lotto = new int[6];
		
		// 숫자를 랜덤하게 만들어서 
		loop:
		for(int i = 0 ; i < 6 ; i++) {
			int no = (int)(Math.random()*45 +1);
			
			//숫자가 이미 만들어졌는지 중복 체크
			for(int j = 0 ; j < i ; j++) {
				int tmp = lotto[j];
				if(no == tmp) {
					// 중복된 번호가 만들어진 경우 
					--i;
					continue loop;
				}
			}
			// 이 라인을 실행하는 경우는 중복체크를 통과한 경우...
			// 따라서 해당 인덱스에 숫자를 기억시킨다.
			lotto[i] = no;
		}
		
		//출력
		System.out.println(Arrays.toString(lotto));
		
		// 정렬
		/*
		 	방법 ]
		 		첫번째와 두번째 비교 --> 첫번째가 더 크면 두번째와 자리를 바꾸고
		 								 첫번째가 작으면 그냥 진행하고
		 				 세번째를 비교 --> 첫번째가 더 크면 세번째와 자리를 바꾸고
		 								 첫번째가 작으면 그냥 진행하고
		 */
		for(int i = 0;i<lotto.length-1 ; i++) {
			
			/*
			int lo = lotto[i];
			for(int j = i + 1 ; j < lotto.length ; j++) {
				int hi = lotto[j];
				if(lo > hi) {
					lotto[i] = hi;
					lotto[j] = lo;
				}
			}
			*/
			
			for(int j = i + 1 ; j < lotto.length ; j++) {
				if(lotto[i] > lotto[j]) {
					//먼저 바꿀 위치의 데이터를 기억시켜놓고
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		
		// 결과 출력
		System.out.println("이번주 로또 번호 : "+ Arrays.toString(lotto));
	
	}

}

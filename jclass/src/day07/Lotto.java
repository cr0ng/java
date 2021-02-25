package day07;

import java.util.Arrays;

/*
 	랜덤하게 1 ~ 45 사이의 숫자를 6개 발생시켜서 기억시키는 배열을 만들고
 	
 	이 배열을 관리할 배열 5개를 만들어서
 	총 5게임의 로또번호를 만드세요.
 */
public class Lotto {

	public static void main(String[] args) {
		// 먼저 5게임을 기억할 배열을 만든다.
		// 다차원 배열이 된다.
		/*
		 	다차원배열이란?
		 		배열안에 다시 배열이 기억되는 형태를 의미한다.
		 		
		 		형식 ]
		 			
		 			2차원 배열
		 			
		 				int[][] 변수이름 = new int[5][6];
		 				
		 				no[0] ==> 정수배열이 된다. 첫번째 배열 의미..
		 				no[0][0] ==> 배열의 첫번째 방의 배열의 첫번째 데이터..
		 
		 */
		
		// 배열 주소를 만든다.
		int[][] lotto = new int[5][6];
		/*
		 	int[] num = {1, 2, 3};
		 	
		 	num.length ==> 3
		 	
		 	lotto[1].length ==> lotto배열의 두번째 방의 배열의 크기
		 */
		for(int l = 0 ; l < lotto.length ; l++) {
			
			int[] l1 = lotto[l];
			
			loop:
				for(int i = 0;i<l1.length ; i++) {
					//랜덤하게 숫자 만들고
					int no = (int)(Math.random()*45+1);
					//중복검사
					for(int j = 0 ; j < i ; j++) {
						if(l1[j] == no) {
							--i;
							continue loop;
						}
					}
					l1[i]=no;
				}
		
		}
		// 배열의 내용을 출력해본다.
		for(int[] t : lotto) {
			System.out.println(Arrays.toString(t));
			
		}
		System.out.println("---------------------");
		
		//정렬해준다
		for(int l = 0; l < lotto.length ; l++) {
			int[] lt = lotto[l];
			
			for(int i = 0 ; i < lt.length - 1 ; i++) {
				for(int j = i + 1 ; j < lt.length ; j++) {
					if(lt[i] > lt[j]) {
						int tmp = lt[i];
						lt[i] = lt[j];
						lt[j] = tmp;
					}
				}
			}
			
			System.out.println(Arrays.toString(lt));
		}
	}

}

package day05;
/*
 
 *
 **
 ***
 ****
 *****
 
 */
public class Test15 {

	public static void main(String[] args) {
		/*
		 	참고 ]
		 		블럭의 내용은
		 		실행을 다 마치면 모두 지워진다.
		 		
		 	참고 ]
		 		for 반복문에서 사용하는 카운터 변수는 
		 		반복문이 종료되면 사라지는 변수
		 		==> 반복문 안에서만 사용되는 변수이다.
		 */
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ;j < (i+1) ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 	i : 0
		 		j : 1
		 		
		 	i : 1
		 		j : 2
		 		
		 	i : 2
		 		j : 3
		 		
		 	i : 1
		 		j : 2
		 */
		
		
		
		//system.out.println(i); <== 이 때 i는 반복문이 종료되었으므로 사용할 수 없음.
	}

}

package day05.ex;

/*
 * 	로또 한 게임을 만들어보세요.
 * 
 * 	로또 게임은
 * 		1 ~ 45 까지의 숫자를 6개가 중복이 되지 않게 구성해서 만들어진다.
 */
public class Lotto01 {

	public static void main(String[] args) {
		
		for(int j = 0; j <5;j++) {
			//출력에 사용할 변수 만들고
			String lotto = "";
			
			// 6번 반복하고
			for(int i = 0; i < 6 ; i++) {
				// 1 ~ 45 까지의 숫자중 랜덤하게 하나 발생시키고 ..
				int no = (int)(Math.random()*45+1);
				
				// 출력변수에 덧붙이고
				lotto = lotto + no + " | "; 
			}
			//출력해주고
			System.out.println(lotto);
		}
	}

}

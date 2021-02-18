package day03;

// 반지름을 입력받아서 원의 둘레와 넓이를 출력해주는 프로그램을 작성하세요.
public class Test06 {

	public static void main(String[] args) {
		/*
		 	Math.random()
		 	==> 0보다 크거나 같고 1보다 작은 double 타입의 실수를 반환해주는 함수
		 */
		System.out.println(Math.random());
		
		// 0 ~ 44 까지의 랜덤한 정수를 발생시켜보자.
		int no = (int)(Math.random() * ( 44-0+1)+0);
		
		System.out.println("0~44 사이의 랜덤한 정수 : " + no);
		
	}

}

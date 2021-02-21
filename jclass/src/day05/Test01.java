package day05;

public class Test01 {

	public static void main(String[] args) {
		
		int no = 0;
		for(;;) {
			// 조건식을 기술하지 않으면 항상 true로 처리가 되고
			// 무한 반복하게 된다.
			// 따라서 종료할 조건을 줘야한다.
			System.out.println(++no);
			if(no==10) {
				break;
				/*
				 	break 명령문
				 		반복문과 switch~case에서만 사용하는 명령
				 		의미는 즉시 해당 명령을 종료하세요. 라는 의미이다
				 */
			}
		}
	}

}

package day13;

public class Test03 {
	int num = 10;
	
	public Test03(int no) {
		num = no;
	}
	
	public static void main(String[] args) {
		// Test03 t1 = new Test03(); 
		/* 
		 	생성자 함수를 한개라도 만들면
		 	자바가상머신은 기본 생성자를 만들어주지 않는다.
		 	따라서 에러가 발생한다.
		 */
		Test03 t1 = new Test03(500);
		System.out.println("Test03.num : " + t1.num );
	}

}

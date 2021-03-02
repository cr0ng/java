package day10;

public class Test01 {

	// 두 수를 입력받아서  + , - , * , /, % 연산의 결과를 알려주는 함수를 제작하고 실행하세요.
	/*
	 	참고]
	 		static(정적속성) 
	 			==> 변수 그리고 함수에 붙을 수 있는 속성이다.
	 			
	 				특정 ]
	 					static 함수에서는 static 멤버만 호출될 수 있다.
	 */
	
	int num1 = 100;
	// System.out.println(num1);	// 클래스 블럭 바로 아래에서는 일반명령을 실행하면 안된다.
	
	public Test01() {	// 기본 생성자 함수
		num1 = 200;
		//System.out.println(num1);
		
		int[] result = calc(2,5);
		
		calc(10,5);	// 함수의 실행결과를 사용하지 않을 경우는 변수로 기억시키지 않는 경우도 있다.
		
		System.out.println("2와 5의 + 연산 : " + result[0]);
		System.out.println("2와 5의 - 연산 : " + result[1]);
		System.out.println("2와 5의 * 연산 : " + result[2]);
		System.out.println("2와 5의 / 연산 : " + result[3]);
		System.out.println("2와 5의 % 연산 : " + result[4]);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
	// 두 수를 입력받아서  + , - , * , /, % 연산의 결과(정수)를 알려주는 함수를 제작하고 실행하세요.
	
	// 두 수 계산해주는 함수
	int[] calc(int a, int b) {
		// 반환값 변수 선언
		int[] no = new int[5];
		
		// + , - , * , /, % 순서대로 결과값을 배열에 넣는다.
		no[0] = a + b;
		no[1] = a - b;
		no[2] = a * b;
		no[3] = (b==0) ? 0 : a / b;
		no[4] = a % b;
		
		return no;
		/*
		 	return 
		 	==> 함수에서 사용하는 명령어로 
		 		의미는 현재 실행중인 함수를 즉시 종료하세요.
		 		만약 반환값이 있으면 반환값을 반환하고 즉시 종료하세요.
		 		의 의미이다.
		 */
	}
}

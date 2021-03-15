package day15;

public class Test02 extends Test01 {

	public Test02() {
		
	}

	public final void abc() {
		/*
		 *  이렇게 함수는 final 속성이 부여되면
		 *  이 함수는 더이상 오버라이드를 할 수 없는 함수가 된다.
		 *  
		 *  역시 중요한 함수이므로 고쳐서 사용하지 말라는 의미가 된다.
		 */
		System.out.println("Test02 abc()");
	}
}

package day16;

public class Test01 implements MyInterface01{
	
	public Test01() {
		MyInterface01 i1 = this;
		MyInterface01 i2 = new Test01();
		i1.toPrint();
	}
	
	/*
	 * 인터페이스를 상속받는 경우는 특별히 "구현한다" 라고 표현하고
	 * 반드시 인터페이스 소속의 함수를 오버라이드 해야한다.
	 */
	
	public void toPrint() {
		// 인터페이스 소속의 함수는 자동적으로 public abstract 가 붙기 때문에
		// 오버라이드 규칙 2번을 반드시 지켜주세요.
		System.out.println("여기는 인터페이스 구현 클래스");
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}

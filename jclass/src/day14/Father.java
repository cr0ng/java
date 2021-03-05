package day14;

public class Father extends Grand{

	public Father() {
		System.out.println("** 여기는 Father class **");
	}
	
	// Grand 클래스의 abc() 함수를 오버라이딩(Overriding, 함수의 재정의)
	
	public void abc() {
		System.out.println("*** 여기는 Father.abc() ***");
	}

}

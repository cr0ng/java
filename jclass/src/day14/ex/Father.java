package day14.ex;

// Grand 클래스를 상속받아서 만든 클래스
public class Father extends Grand {
	public void toPrint() {
		// Grand 클래스의 함수를 재정의(오버라이딩)
		System.out.println("### 여기는 아버지 클래스 ###");
	}
}

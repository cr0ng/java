package day13;

public class Test02 {
	
	int[] num;
	
	public Test02() {
		// 기본 생성자;
		num = new int[10];
	}
	
	public Test02(int cnt) {
		num = new int[cnt];
	}
	
	public Test02(int ... no) {
		num = no;
	}
	
	/*
	public Test02(int[] no) {
		// 위에서 정의한 가변수로 오버로딩한 생성자와
		// 매개변수리스트의 형태가 같으므로 오버로딩이 안된다.
	}
	*/
	
	public void Test02() {
		// 이 경우는 이 함수는 생성자 함수가 아니고 일반함수를 정의한 것이다.
		// 생성자 함수는 절대로 반환값을 가지면 안된다.
	}
	
	public static void main(String[] args) {
		
	}

}

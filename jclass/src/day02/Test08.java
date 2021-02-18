package day02;

public class Test08 {
	public static void main(String[] args) {
		System.out.println("a < A : " + ('a'<'A'));
		
		char ch = 65;
		
		int no = 97;
		char ch2 = (char)no;	// 문자타입으로 강제 형변환
		
		int no2 = ch2;	// 자동 형변환
	}
}

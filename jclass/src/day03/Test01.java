package day03;

//논리 연산자
public class Test01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println((a++ > 10)&&(++b > 10));
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}

package day05;

//문자를 문자열로 바꾸는 방법...
public class Test03 {

	public static void main(String[] args) {
		char ch = (char)(Math.random()*256);
		// 아스키코드 문자는 코드값이 0 ~ 255 까지 1바이트의 용량의 데이터를 가진다.
		
		// ch를 문자로 만들어보자.
		String str = ch + "";
		System.out.println(str);
	}

}

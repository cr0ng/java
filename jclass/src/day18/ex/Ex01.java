package day18.ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 	문제 1]
 		아이디 정규식 검사를 하는 프로그램을 작성해서 실행하세요.
 		
 		아이디 형식은
 			첫글자는 소문자로 시작하고
 			마지막 글자는 숫자로 끝난다.
 			8로 구성된 아이디를 사용해야 한다.
 			영문자와 숫자만 사용하는 것으로 한다.
 			
 */
public class Ex01 {

	public Ex01() {
		
		String id = "abcdery7";
		String pat = "[a-z][a-zA-Z0-9]{6}[0-9]";
		Pattern p = Pattern.compile(pat);
		
		Matcher mat = p.matcher(id);
		
		
		if(mat.matches()) {
			System.out.println("올바른 아이디");
		}else {
			System.out.println("안 올바른 아이디");
		}
	}

	public static void main(String[] args) {
		new Ex01();

	}

}

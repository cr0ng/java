package day03;
/*
 참고 ]
 	charAt(index)
 	==> 문자열의 특정위치의 문자를 반환해주는 함수
 	
 	예 ]
 	 String str = "abcd";
 	 
 	 char ch = str.charAt(2);  ==> c 
 */
import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("알파벳 한 글자를 입력하세요 : ");
		char al = in.next().charAt(0);
		
		if(al >= 'A' && al < 'Z') {
			char lo = (char)(al + ('a'-'A'));
			System.out.println("대문자를 소문자로 : " + lo);
		}else if(al >= 'a' && al <= 'z'){
			char hi = (char)(al - ('a'-'A'));
			System.out.println("소문자를 대문자로 : " + hi);
		}else
			System.out.println("알파벳이 아님");

	}
}

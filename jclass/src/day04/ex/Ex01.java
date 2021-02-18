package day04.ex;

/*
  	String 클래스의 equals() 함수를 사용해서 처리하세요.
  	
  	문자열을 입력받아서
  		"M"		-	남자입니다.
  		"남"		-	남자입니다.
  		"남자"	-	남자입니다.
  		"남성"	-	남자입니다.
  		"F"		-	여자입니다.
  		"여"		-	여자입니다.
  		"여자"	-	여자입니다.
  		"여성"	-	여자입니다.
  		이외의 경우는 -	잘못입력했습니다.
  	가 출력되는 프로그램을 작성하세요.
  	
  	if ~ else if 구문
  	switch ~ case 구문으로 처리하세요.
 */
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("성별을 입력하세요 : ");
		String gen = in.nextLine();
		
		//if ~ else if
		/*
		if(gen.equals("M")) {
			System.out.println("남자입니다.");
		}else if(gen.equals("남")) {
			System.out.println("남자입니다.");
		}else if(gen.equals("남성")) {
			System.out.println("남자입니다.");
		}else if(gen.equals("남자")) {
			System.out.println("남자입니다.");
		}else if(gen.equals("F")) {
			System.out.println("여자입니다.");
		}else if(gen.equals("여")) {
			System.out.println("여자입니다.");
		}else if(gen.equals("여성")) {
			System.out.println("여자입니다.");
		}else if(gen.equals("여자")) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못입력했습니다.");
		}
		*/
		
		/*
		if((gen.equals("M"))||(gen.equals("남"))||(gen.equals("남성"))||(gen.equals("남자"))) {
			System.out.println("남자입니다.");
		}else if((gen.equals("F"))||(gen.equals("여"))||(gen.equals("여성"))||(gen.equals("여자"))) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못입력했습니다.");
		}
		*/
		
		//switch문
		switch(gen) {
			case "M" :
				System.out.println("남자입니다.");
				break;
			case "남" :
				System.out.println("남자입니다.");
				break;
			case "남성" :
				System.out.println("남자입니다.");
				break;
			case "남자" :
				System.out.println("남자입니다.");
				break;
			case "F" :
				System.out.println("여자입니다.");
				break;
			case "여" :
				System.out.println("여자입니다.");
				break;
			case "여성" :
				System.out.println("여자입니다.");
				break;
			case "여자" :
				System.out.println("여자입니다.");
				break;
			default :
				System.out.println("잘못입력했습니다.");				
		}
		
	}

}

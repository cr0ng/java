package day16;

import java.util.*;

public class Test05 {

	public Test05() {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력
		System.out.print("정수 입력 : ");
		String str = sc.nextLine();
		
		int no = 0;
		
		//no = Integer.parseInt(str);
		
		
		try {
			no = Integer.parseInt(str);
		}catch(NumberFormatException e) {
			// 예외 정보 출력하는 방법
			// 1. 변수를 출력하는 방법
			// System.out.println(e);
			 
			// 2. 예외의 정보와 위치까지 출력하는 방법
			e.printStackTrace();
			no = -999;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("no : " + no);
	}

	public static void main(String[] args) {
		new Test05();

	}

}

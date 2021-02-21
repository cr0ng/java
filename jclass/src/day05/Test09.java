package day05;
/*
 	단을 입력받아서
 	해당 단의 구구단을 출력해주는 프로그램을 작성하세요.
 	
 	-------------------------------------
 	
 	단을 출력하면 다시 단을 입력받도록 하고
 	0을 입력하면 프로그램 종료되도록
 	프로그램을 작성하세요.
 */

import java.util.*;
public class Test09 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("몇단? ");
	int dan = in.nextInt();
	
	System.out.println("***** " + dan + "단 *****");
	for(int i = 0 ; i < 9; i ++) {
		System.out.println(dan + " X "+ (i+1) + " = " +(dan*(i+1)));
	}

	}

}

package day18;
/*
 * 	Scanner를 이용해서 파일에 저장된 내용을 읽어서 출력해보자.
 *  	day18.ex.Ex01.java
 */


import java.io.*;
import java.util.*;

public class Test03 {

	public Test03() {
		// 파일객체를 만든다.
		File file = new File("C:\\Users\\yujin\\git\\java\\jclass\\src\\day18\\ex\\Ex01.java ");
		
		// Scanner 준비
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			String str = sc.nextLine();
			System.out.println("Ex01 내용 : " + str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}

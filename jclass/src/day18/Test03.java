package day18;
/*
 * 	Scanner�� �̿��ؼ� ���Ͽ� ����� ������ �о ����غ���.
 *  	day18.ex.Ex01.java
 */


import java.io.*;
import java.util.*;

public class Test03 {

	public Test03() {
		// ���ϰ�ü�� �����.
		File file = new File("C:\\Users\\yujin\\git\\java\\jclass\\src\\day18\\ex\\Ex01.java ");
		
		// Scanner �غ�
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			String str = sc.nextLine();
			System.out.println("Ex01 ���� : " + str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}

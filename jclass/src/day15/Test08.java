package day15;

import java.util.*;

public class Test08 {

	public Test08() {
		// 현재 시간을 출력해보자.
		
		Date date = new Date();
		System.out.println(date.getDate());
		System.out.println(date.getDay());
	}
	
	public static void main(String[] args) {
		new Test08();
	}

}

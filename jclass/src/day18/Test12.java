package day18;

import java.text.*;

public class Test12 {

	public Test12() {
		/*
		 * 다음 문자열
		 * 		"Name : 홍길동, Tel : 010-1234-1234, Age : 18 ";
		 * 		"Name : 고길동, Tel : 010-1234-4321, Age : 35 ";
		 * 		
		 */
		
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Age : {2}");
		
		/*
		 *  동일한 내용은 그대로 쓰고
		 *  변경되는 부분은 {0} , {1}, {2} 로 기술
		 *  번호는 입력되는 데이터의 순서를 의미
		 */
		
		// 한사람분 데이터를 배열로 준비한다.
		Object[] obj = {"홍길동"," 010-1234-1234",18};
		
		String str = form.format(obj);
		System.out.println(str);
		
		obj = new Object[]{"고길동"," 010-1234-4321",35};
		str = form.format(obj);
		System.out.println(str);
		
		
	}

	public static void main(String[] args) {
		new Test12();
	}

}

package day18;

import java.text.DecimalFormat;
import java.util.*;

public class Test08 {

	public Test08() {
		float no = 32456.45678f;
		/*
		 *  이 숫자를 3자리마다 , 를 붙이고
		 *  소수점 이하는 3자리까지만 출력하도록
		 */
		
		// 먼저 형식 정하고
		DecimalFormat form1 = new DecimalFormat("00,000,000.000");
		DecimalFormat form2 = new DecimalFormat("##,###,###.###");
		// 형식에 맞는 문자열을 만들어 준다
		String str1 = form1.format(no);
		String str2 = form2.format(no);
		// format(double number) ==> 숫자를 형식이 있는 문자열로 변환시켜주는 함수
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void main(String[] args) {
		new Test08();

	}

}

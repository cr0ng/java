package day18;

import java.util.*;
import java.text.*;

public class Test09 {

	public Test09() {
		Calendar cal = Calendar.getInstance(); 
		
		Date date = cal.getTime(); // Date Ÿ������ ��ȯ
		
		SimpleDateFormat form = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH:mm:ss");
		String sdate =form.format(date);
		System.out.println(sdate);
	}

	public static void main(String[] args) {
		new Test09();
	}

}

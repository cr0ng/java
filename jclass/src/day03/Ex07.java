package day03;

public class Ex07 {

	public static void main(String[] args) {
		
		int m1 = (int)(Math.random()*101);
		int m2 = (int)(Math.random()*101);
		int m3 = (int)(Math.random()*101);
		
		//3항연산자
		//int result = (m1>m2) ? ((m3>m1) ? m3 : m1 ) : ((m3>m2)? m3:m2);
		
		//조건문
		int result;
		
		if(m1>m2) {
			if(m1>m3) {
				result = m1;
			}else {
				result = m3;
			}
		} else{
			if(m2>m3) {
				result = m2;
			}else {
				result = m3;
			}
		} 
			
		System.out.println("첫 번째 숫자 : " + m1);
		System.out.println("두 번째 숫자 : " + m2);
		System.out.println("세 번째 숫자 : " + m3);
		System.out.println("셋 중 가잔 큰 숫자 : " + result);
		
		
	}

}

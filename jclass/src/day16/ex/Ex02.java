package day16.ex;
/*
 *  String[] str = {"123","456", "789" ....};
 *  가 있는 경우
 *  각 문자열을 정수로 변환한 수의 합과 평균을 구하는 프로램을 작성하세요.
 *  
 *  단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
 *  
 *  	1. 배열의 인덱스를 벗어난 경우
 *  
 *  	2. 숫자로 변환이 불가능한 경우
 *  
 *  	3. 평균을 계산하는데 0으로 나눠지는 경우...
 *  
 */
public class Ex02 {

	public Ex02() {
		
		System.out.println(plus());
	}
	
	
	public int plus() throws Exception  {
		int result = 0;
		int no = 0; 
		
		String[] str = {"123","456", "789"};
		
		try {
			for(int i = 0 ; i < str.length; i++) {
				no = Integer.parseInt(str[i]);
				
				result += no;
			}
		}catch() {
			
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		new Ex02();

	}

}

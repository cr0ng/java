package day11;

/*
	문제 5 ]
		"1234-56" 의 형식과 같이 
		숫자부호숫자로 구성된 문자열을 입력받아서
		계산해주는 계산기 프로그램을 작성하세요.
		
		사용함수 ]
			
			charAt()
			length()
			substring90
			
			Integer.parseInt
			
			
	==> 
		1. 입력받는 함수 ==> 
		
		2. 연산기호를 반환해주는 함수
		2-0. 연산기호 인덱스 반환해주는 함수
		2-1. 연산기호를 반환해주는 함수
		
		3. 수식을 입력하면 숫자를 배열로 반환해주는 함수
		
		4. 계산 처리해주는 함수
		
 */

import java.util.*;
public class Test01 {
	public int num = 999;
	/*
	// 반환값이 있는 함수중 클래스이름과 동일한 함수는 생성자함수가 아니라 일반함수이다.
	public void Test01() {
		System.out.println("###########################");
	}
	*/
	public Test01() {
//		System.out.println("### 여기는 기본 생성자 ###");
		// 수식 입력받고
//		String str = inStr();
		// 수식 연산결과 도출하고
//		double result = calc(str);
		
		//  출력해주고
//		System.out.println("입력한 수식 [ " + str + " ] 의 결과 ==> " + result);
	}
	
	// 문자열 입력 전담처리함수
	public String inStr() {
		String str = "";
		// 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하고
		System.out.print("수식 입력 : ");
		// 입력받은 데이터 변수에 기억하고
		str = sc.nextLine();
		// 문자열 반환해주고...
		return str;
	}
	
	// 문자열에서 연산기호의 인덱스 반환해주는 함수
	public int getIdx(String str) {
		// 반환값 변수 만들고
		int idx = 0 ;
		
		for(int i = 0 ; i < str.length() ; i++ ) {
			if(str.charAt(i) == '+' ) {
				// 이 경우는 연산기호가 + 인 경우
				idx = i;
				break;
			} else if(str.charAt(i) == '-') {
				idx = i;
				break;
			} else if(str.charAt(i) == '*') {
				idx = i;
				break;
			} else if(str.charAt(i) == '/') {
				idx = i;
				break;
			} else if(str.charAt(i) == '%') {
				idx = i;
				break;
			}
		}
		
		return idx;
	}
	
	// 연산기호 문자열로 반환해주는 함수
	public String getBuho(String str, int idx) {
		String result = "";
		result = str.substring(idx, idx + 1);
		return result;
	}
	/*
		문자열 처리 함수
			
			charAt()
				==> 반환값 : 문자(char)
			indexOf()
				==> 반환값 : 정수(int)
			substring()
				==> 반환값 : 문자열(String)
				
			length()
				==> 반환값 : 정수(int) - 문자열의 길이를 반환해준다.
									   - 마지막인덱스보다 1이 크다.
	 */
	// 
	
	// 수식을 입력하면 숫자만 배열로 반환해주는 함수
	public int[] getNums(String str, int idx) {
		int[] num = new int[2];
		// 문자열을 잘라서
		String sno1 = str.substring(0, idx);
		// 정수로 변환
		int no1 = Integer.parseInt(sno1);
		
		String sno2 = str.substring(idx + 1); // "123-45" 에서 45 추출
		// 정수로 변환
		int no2 = Integer.parseInt(sno2);
		
		// 배열에 채우고
		num[0] = no1;
		num[1] = no2;
		
		// 완성된 배열 반환해주고
		return num;
	}
	
	// 계산 처리해주는 함수
	public double calc(String str) {
		double result = 0;
		
		// 연산기호 인덱스 추출
		int idx = getIdx(str);
		
		// 연산기호 추출
		String buho = getBuho(str, idx);
		
		// 숫자만 배열로 추출
		int[] nums = getNums(str, idx);
		
		
		// 부호에 따라서 계산하고
		
		switch(buho) {
		case "+":
			result = nums[0] + nums[1];
			break;
		case "-":
			result = nums[0] - nums[1];
			break;
		case "*":
			result = nums[0] * nums[1];
			break;
		case "/":
			result = ((double)nums[0]) / nums[1];
			break;
		case "%":
			result = nums[0] % nums[1];
			break;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
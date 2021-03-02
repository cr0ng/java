package day10;

import java.util.Arrays;

/*
 	정수 다섯개를 기억할 배열을 만들고
 	이 배열에 랜덤한 정수를 발생시켜서 채워주는 기능의 함수를 작성해서 실행하세요.
 	배열의 내용을 출력하세요.
 */
public class Test04 {
	
	int no;
	int[] num = new int[5];
	
	public Test04(){
		System.out.println(Arrays.toString(num));
		System.out.println(no);
		
		abc(); // 여기는 배열 셋팅이 아직 안되어있는 상태
		
		// 배열 채워주는 함수 실행
		setNum();
		// 출력
		System.out.println(Arrays.toString(num));
	}
	
	public static void main(String[] args) {
		new Test04();
	}

	// num배열에 정수를 랜덤하게 채워주는 함수
	void setNum() {
		for(int i = 0 ; i < 5 ; i++) {
			int tmp = (int)(Math.random()*50+1);
			num[i] = tmp;
		}
		// 이 함수 역시 전역변수인 배열에 데이터를 채워주기만 하면 되기때문에 반환값 필요 X
	}
	
	void abc() {
		System.out.println("abc() : "+ Arrays.toString(num));
	}
}

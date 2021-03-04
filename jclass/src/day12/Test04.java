package day12;

public class Test04 {
	public Test04() {
		System.out.println(" 1 ~ 10 까지 합 : " + getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(" 1 ~ 10 까지 합 : " + getSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
	}
	
	// 입력되는 정수들의 합을 반환해주는 함수
	public int getSum(int ... no) {
		// 합계를 기억할 변수
		int sum = 0;
		
		// 누적 계산 한다.
		// 이때 no 는 자동 배열 변수이기 때문에 배열처럼 다루면 된다.
		for(int i = 0 ; i < no.length ; i++ ) {
			sum = sum + no[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}

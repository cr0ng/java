package day07.ex;
/*
 	반복문 문제]
 		
 		2g 추가 5개
 		3g 추가 4개
 		5g 추가 3개 있을 경우
 		
 		15g ~ 25g 의 무게를 다는 방법은 무엇이 있으며
 		그 경우의 수는 모두 몇가지 인지 출력해주는 프로그램을 작성하세요.
 		
 */
public class Ex00_01 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 0;i <= 5;i++) {
			for(int j = 0 ; j <= 4 ; j++) {
				for(int k = 0 ; k <=3 ; k++) {
					int result = 2*i+3*j+5*k;
					if(result >=15 && result <=25){
						count++;
					}
				}
			}
		}
		System.out.println("15g ~ 25g의 무게를 다는 방법은 모두 " + count + "가지");
	}

}

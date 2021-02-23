package day06.ex;
/*
    첫날은 1원을 저축하고 다음날은 전날의 2배를 저축한다면
    몇일째 1억원을 저축할 수 있는지 출력해주는 프로그램을 작성하세요.
 */

public class Ex08 {

	public static void main(String[] args) {
		
		int sum = 0;	// 총 금액
		int day = 1;	// 일 수
		int save = 1;	// 저축액
		
		while(true) {
			
			sum = sum + save;
				
			if(sum >=1000000000) {
				break;
			}
			save = save * 2;
			day++;
		}
			System.out.println("1억원을 모으려면 "+day+"일이 필요합니다.");
	}

}

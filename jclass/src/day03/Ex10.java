package day03;
/*
 문제 10 ]
	1000 ~ 3000 년 사이의 년도를 랜덤하게 발생시켜서
	해당 년도가 윤년인지 평년인지를 구분해서 출력해주는 프로그램을 작성하세요.
	
	참고 ]
		윤년은 4,100,400 으로 나눠 떨어지는 해는 윤년이라 한다.
		100으로 나누어 떨어지면 평년
 */
public class Ex10 {

	public static void main(String[] args) {
		int year = (int)(Math.random()*(3000-1000+1)+1000);
		
		if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0 ) {
			System.out.println(year + "년은 윤년이다");
			}else {
				System.out.println(year +"년은 평년이다");
		}
	}

}

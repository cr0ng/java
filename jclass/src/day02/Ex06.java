package day02;
/*
 	문제 6 ]
 		1년은 365.2426일이다.
 		이것은 몇일 몇시간 몇분 몇 초인지 계산해서 출력하세요.
 		
 		참고 ]
 			1일 : 24시간
 			1시간 : 60분
 			1분 : 60초
 			
 			따라서 0.5일은 24 * 0.5 시간이므로 12시간이 된다.
 */
public class Ex06 {

	public static void main(String[] args) {
	/*
		double year = 365.2426;
		
		double hour, min, sec;

		int day = (int)year;
		double x = year - (double)day;
		System.out.println(day + "일");
		
		hour = x*24;
		x = x - hour;
		System.out.println((int)hour + "시간");
	*/
		
	double tday = 365.2426;
	int day, hour, min, sec, tmp;
	
	// 일수를 계산
	day = (int) tday;
	
	// 일수를 뺀 결과를 초단위로 변환한다.(tmp)
	tmp = (int)((tday - day)*24*60*60);
	
	// 시간 계산하고
	hour = tmp / 3600;
	tmp %= 3600;
	
	// 분 계산
	min = tmp / 60;
	
	// 초 계산
	sec = tmp % 60;
	
	System.out.println("일년은 " + tday + "이고 이것을 초단위까지 환산하면");
	System.out.println(day + "일 " + hour + "시간 " + min + "분 " + sec + "초 ");
		
	}

}

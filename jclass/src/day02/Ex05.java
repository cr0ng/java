package day02;
/*
 	문제 5 ]
 		54232원으로 원두를 샀다.
 		현금으로 지불하려고 한다.
 		
 		이 때 지불하려는 우리나라 화폐 단위별로 각 단위가 몇개가 필요한지 계산해서 출력
 		단, 큰 화폐가 먼저 지불되고 남은 금액으로 작은 화폐 로 지불
 		
 		화폐단위
 			10000
 			1000
 			100
 			10
 			1
 		를 사용해서 처리하세요.
 */
public class Ex05 {

	public static void main(String[] args) {
	/*
		int money = 54232;
		
		int m1 = money / 10000;
		int change = money - m1* 10000;
		
		System.out.println("10000원  : " + m1 + "장");
		
		int m2 = change / 1000;
		change = change - m2*1000;
		System.out.println("1000원 : " + m2 + "장");
		
		int m3 = change / 100;
		change = change - m3*100;
		System.out.println("100원 : " + m3 + "장");
		
		int m4 = change / 10;
		change = change - m4*10;
		System.out.println("10원 : " + m4 + "장");
		
		int m5 = change / 1;
		change = change - m5*1;
		System.out.println("1원 : " + m5 + "장");
	*/
		
	//선생님 코드
		int man, chun, baek, ten, il, money, tmoney;
		money = 54232;
		tmoney = money;
		
		man = tmoney / 10000;
		tmoney %= 10000;
		
		chun = tmoney / 1000;
		tmoney %= 1000;
		
		baek = tmoney / 100;
		tmoney %= 100;
		
		ten = tmoney / 10;
		tmoney %= 10;
		
		il = tmoney / 1;
		tmoney %= 1;
		
		System.out.println("총 지불 금액 : " + money);
		System.out.println("만원짜리 : " + man);
		System.out.println("천원짜리 : " + chun);
		System.out.println("백원짜리 : " + baek);
		System.out.println("십원짜리 : " + ten);
		System.out.println("일원짜리 : " + il);
	}

}

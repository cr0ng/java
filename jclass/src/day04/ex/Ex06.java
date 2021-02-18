package day04.ex;
/*
 문제 6 ]
	5자리 숫자를 랜덤하게 발생한 후
	각 자리 숫자의 합을 구하는 프로그램을 작성하세요.
	
	예 ]
		발생한 숫자 : 12345
		==>
			결과 : 1 + 2 + 3 + 4 + 5
 */
public class Ex06 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*(99999-10000+1)+10000);
		int man,chun,baek,ten,il;
		int na = num;
		System.out.println("5자리 랜덤 숫자 : " + num);
		
		man = na / 10000;
		na %= 10000;
		
		chun = na / 1000;
		na %= 1000;
		
		baek = na / 100;
		na %= 100;
		
		ten = na / 10;
		na %= 10;
		
		il = na / 1;
		na %= 1;
		
		int result =man+chun+baek+ten+il;
		System.out.println("결과 : "+man+"+"+chun+"+"+baek+"+"+ten+"+"+il+"="+result);
		
		
	}

}

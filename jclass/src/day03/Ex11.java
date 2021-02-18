package day03;
/*
 문제 11 ]
	3자리 숫자를 입력받아서
	이 숫자에서 가장 가까운 100의 배수를 만들기 위해서는
	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
	
	예 ] 
		241 - 200이 가까우므로 41을 빼야한다.
 */

import java.util.*;

public class Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("3자리 숫자를 입력하세요 : ");
		int num = in.nextInt();
		
		if(num % 100 != 0) {
			if(num % 100 >= 50) {
				int baek = ((num/100)+1)*100;
				System.out.println(num + "이 가장 가까운 100의 배수는 "+ baek +" 이고 " + (baek-num) + "만큼 필요하다");
			}else {
				int baek = (num/100)*100;
				System.out.println(num + "이 가장 가까운 100의 배수는 "+ baek +" 이고 " + (num-baek) + "만큼 빼야한다");
			}
		}else {
			System.out.println(num + "에 가장 가까운 100의 배수는 " + num + " 이고 0이 필요하다");
		}
	}

}

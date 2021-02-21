package day05;
/*
  10 ~ 49 까지의 수 중 정수 하나를 입력받아서
 
	10 ~ 19 : 총무부
	20 ~ 29 : 영업부
	30 ~ 39 : 회계부
	40 ~ 49 : 개발부
	
	로 계속 반복해서 출력해주는 프로그램을 작성하세요.
	99를 입력하면 종료되도록 하세요.
*/
import java.util.*;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("부서 번호 : ");
			int num = in.nextInt();
			
			if(num == 99) {
				System.out.println("*** 반복문을 종료합니다 ***");
				break;
			}
			
			String dname = "";
			
			switch(num/10) {
			case 1:
				dname ="총무부";
				break;
			case 2:
				dname ="영업부";
				break;
			case 3:
				dname ="회계부";
				break;
			case 4:
				dname ="개발부";
				break;
			default:
				dname ="없는 부서";
				break;
			}
		
		System.out.println("입력한 "+ num + " 부서는 "+ dname + "이다");	
		}
	}

}

package day05.ex;
/*
문제 6 ]
	두 정수를 입력받아서
	두 정수의 최소 공배수를 출력해주는 프로그램을 작성하세요.
	
	참고 ]
		최소공배수란 두 수로 나누어 떨어지는 최소 숫자를 이야기한다.
		
		2와 3의 최소 공배수는 6 이다.
		2와 7의 최소 공배수는 14이다.
		3과 7의 최소 공배수는 21이다.
*/
import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int bae = 1,gong = 1;
		System.out.print("정수1을 입력하세요 : ");
		int n1 = in.nextInt();
		
		System.out.print("정수2를 입력하세요 : ");
		int n2 = in.nextInt();
		
		in.close();
		
		for(int i = 1 ; (i <= n1 && i <= n2);i++ ) {
			if(n1 % i == 0 && n2 % i == 0) {
				gong = i;
			}
		}
		bae = n1 * n2 / gong;
		System.out.println(n1+"과 "+n2 +"의 최소공배수는 "+ bae +"이다.");
		
		//선생님 코드
		int max = (n1 > n2)? n1 : n2;
		int result = 0;
		for(int i = max; true ; i++) {
			if(i % n1 == 0 && i % n2 == 0) {
				result = i;
				break;
			}
		}
		
		System.out.println("입력한 두수 "+ n1 + " 과 " + n2 + 
								" 의 최소 공배수는 " + result + "입니다.");
	}

}

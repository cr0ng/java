package day04.ex;
/*
 문제 7 ]
	랜덤하게 두자리 숫자를 만들고
	사용자가 예측한 숫자를 입력해서
	입력한 수가 발생된 수보다 큰지 작은지 아니면 같은지를 
	출력해주는 프로그램을 작성하세요.
 */
import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = (int)(Math.random()*(99-10+1)+1);
		System.out.print("2자리 수를 예측하세요 : ");
		int ex = in.nextInt();
		
		if(ex > num) {
			System.out.println("입력한 수(" + ex +")가 발생된 수(" +num+ ")보다 크다.");
		}else if(ex < num) {
			System.out.println("입력한 수(" + ex +")가 발생된 수(" +num+ ")보다 작다.");
		}else {
			System.out.println("입력한 수("+ex+")가 발생된 수("+num+")와 같다.");
		}

	}

}

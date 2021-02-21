package day05.ex;
/*
	랜덤하게 두자리 숫자를 하나 발생시켜서
	사용자가 그 숫자를 알아맞추는 게임을 제작하세요.
	만들어진 숫자보다 큰 수를 입력한 경우는 - "큰수입니다."
				작은수를 입력한 경우는 - "작은수입니다."
	가 출력되도록하고
	정답을 맞출때까지 반복하도록 하세요.
 */
import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		int dap = (int)(Math.random()*(99-10+1)+10);
		
		Scanner in = new Scanner(System.in);

		do {
			
			System.out.print("숫자를 맞추세요 : ");
			int num = in.nextInt();
			
			
			if(num>dap) {
				System.out.println("큰수입니다.");
			}else if(num<dap){
				System.out.println("작은수입니다.");
			}else if(num == dap){
				System.out.println("*** 숫자를 맞췄습니다! ***");
				System.out.println("정답은 " + dap);
				break;
			}else {
				System.out.println("잘못입력했습니다.");
			}
			
		}while(true);
	}

}

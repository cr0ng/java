package day05.ex;
/*
문제 4 ]
	다섯자리 숫자를 입력받아서
	입력받은 숫자가 회문수인지 아닌지를
	판별해주는 프로그램을 제작하세요.
	
	참고 ]
		
		회문수 : 앞에서 읽으나 뒤에서 읽으나 같은 숫자.
			예 ]
				12321
				45654
				
			아닌예 ]
				12345
				12312
*/
import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("다섯자리 숫자 입력 ");
		String sno = in.nextLine();
		
		String result = "회문수입니다.";
		for(int i = 0 ; i < 2; i++) {
			char ch = sno.charAt(i);
			char ch1 = sno.charAt(4-i);
			
			if(ch != ch1) {
				result = "회문수가아닙니다.";
				break;
			}
		}
			
		
			System.out.println(sno + "는 " + result);
		
		
		
		
	}

}

package day03;
/*
 	문제 4]
 		소수점이 있는 숫자를 입력받은 후
 		소수이하 셋째자리에서 반올림한 결과를 출력하세요.
 		
 		힌트 ]
 			소수 셋째자리에서 반올림을 하면
 			+ 0.005
 			를 더해주고 그 이하는 버리면 된다. <= * 100 이 결과를 정수로 강제 형변환하면 이하는 버리는 숫자가 만들어진다. 

 */
import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("소수점이 있는 숫자 입력 : ");
		double num = in.nextDouble();
		
		/*
		num += 0.005;
		int num1 = (int)(num * 100);
		System.out.println(num1);
		num = (double)num1/100;
		System.out.print("소수 셋째자리에서 반올림 : "+num);
		*/
		
		//선생님 코드
		double result = ((int)((num + 0.005)*100))/100.0;
		System.out.print(result);
	}

}

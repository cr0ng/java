package day02;
/*
 문제 3 ]
	삼각형의 밑변과 높이를 정수로 입력받아서
	넓이를 출력해주는 프로그램을 작성하세요.	
*/
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("밑변 길이 : ");
		int under = in.nextInt();
		
		System.out.print("높이 길이 : ");
		int height = in.nextInt();
		
		double area = under * height / 2.0 ;
		
		/*
		 	double area = under * height / 2 ;
		 	연산식을 이렇게 기술하면
		 	연산결과는 정수로 만들어질 것이고
		 	소수점 이하는 버리는 데이터가 만들어진다.
		 */
		System.out.println("밑변이 "+under+" 높이가 "+height+"인 삼각형의 넓이는 "+area);
	
	}

}

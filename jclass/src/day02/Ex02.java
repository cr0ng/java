package day02;
/*
 문제 2]
	사각형의 가로와 세로의 길이를 정수로 입력받아서 
	넓이를 출력해주는 프로그램을 작성하세요.
	
*/

import java.util.Scanner;

public class Ex02 {
	/*
	  변수 만드는 규칙 ]
	  	변수 몇개를 만들어도 상관이 없으나
	  	같은 이름의 변수는 만들 수 없다.
	  	(변수 선언은 이미 만들어진 이름으로는 절대 할 수 없다)
	  	
	  	예 ] 
	  		int no = 10;
	  		...
	  		int no = 100;	==> 절대로 안됨
	  		
	  		==>
	  			int no = 10;
	  			...
	  			no = 100
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("가로 길이 입력 : ");
		int garo = in.nextInt();
		System.out.print("세로 길이 입력 : ");
		int sero = in.nextInt();
		
		int area = garo * sero;
		
		System.out.println("가로가 "+garo+" 세로가 "+sero+"인 사각형의 넓이 : "+ area);
		System.out.printf("%3s : %5d \n%3s : %5d\n%3s : %5d",
						 "가로",garo,"세로",sero,"넓이",area);	

	}

}

package day02;
/*
 	문제 4 ]
 		친구의 이름, 나이  , 신장, 전화번호를 입력받아서
 		출력해주는 프로그램을 작성하세요.
 */
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name, tel;
		
		int age;
		double height;
		
		System.out.print("이름 : ");
		name = in.nextLine();
		
		System.out.print("나이 : ");
		age = in.nextInt();
		
		System.out.print("신장 : ");
		height = in.nextDouble();
		
		in.nextLine();
		
		System.out.print("전화번호 : ");
		tel = in.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("전화번호 : " + tel);
	}

}

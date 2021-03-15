package day16;

import java.util.*;

public class Test08 {

	int num;
	
	public Test08() {
		int no = 0;
		/*
		try{
			no = addNum();
		}catch(NumberFormatException e) {
			System.out.println("숫자형식 아님");
			
		}catch(Exception e) {
			System.out.println("알수없는예외");
		}
		*/
		System.out.println(addNum1());
	}

	public static void main(String[] args) {
		new Test08();
	}

	// 숫자를 입력받아서 정수로 변환후 10을 더해서 반환해주는 함수
	public int addNum() throws NumberFormatException, Exception{
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		
		String sno = sc.nextLine();
		
		if(sno.equals("5")) {
			throw new Exception();
		}
		
		int no = Integer.parseInt(sno);
		
		result = no + 10;
			
		return result;
	}
		
	public int addNum1() {
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		
		String sno = sc.nextLine();
		
		int no = 0;
		try {
			if(sno.equals("5")) {
				throw new Exception();
			}
		
			no = Integer.parseInt(sno);
		} catch(NumberFormatException e) {
			return no + 1;
		}catch(Exception e) {
			return no + 5;
		}finally {
			no = 90;
		}
		result = no + 10;
			
		return result;
	}
}

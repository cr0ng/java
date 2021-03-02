package day08.ex;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		String[] f1 = {"홍길동","hong","hong@increpas.com","010-1111-1111","M"};
		String[] f2 = {"고길동","Gho","ghoincrepas.com","010-2222-2222","M"};
		String[] f3 = {"둘리","dooly","dooly@increpas.com","010-3333-3333","M"};
		String[] f4 = {"희동이","hee","hee@increpas.com","010-4444-4444","M"};
		String[] f5 = {"마이콜","mikol","kol@increpas.com","010-5555-5555","M"};
		
		String[][] friend = new String[5][5];
		/*
		 	f1 ~ f5 데이터를 이용해서
		 	friend 배열의 데이터를 채우세요.
		 	
		 					친구1		친구2		친구3		친구4		친구5
		 	이름	 :
		 	아이디	 :
		 	메일	 :
		 	전화번호 :
		 	성별	 :
		 	
		 */
		
		
		for(int i = 0 ; i < friend[0].length ; i++) {
			friend[i][0] =f1[i];
			friend[i][1] =f2[i];
			friend[i][2] =f3[i];
			friend[i][3] =f4[i];
			friend[i][4] =f5[i];
		}
		
		
		for(String[] f : friend) {
			System.out.println(Arrays.toString(f));
		}
	}

}

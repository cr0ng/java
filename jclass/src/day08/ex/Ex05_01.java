package day08.ex;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		String[] f1 = {"ȫ�浿","hong","hong@increpas.com","010-1111-1111","M"};
		String[] f2 = {"��浿","Gho","ghoincrepas.com","010-2222-2222","M"};
		String[] f3 = {"�Ѹ�","dooly","dooly@increpas.com","010-3333-3333","M"};
		String[] f4 = {"����","hee","hee@increpas.com","010-4444-4444","M"};
		String[] f5 = {"������","mikol","kol@increpas.com","010-5555-5555","M"};
		
		String[][] friend = new String[5][5];
		/*
		 	f1 ~ f5 �����͸� �̿��ؼ�
		 	friend �迭�� �����͸� ä�켼��.
		 	
		 					ģ��1		ģ��2		ģ��3		ģ��4		ģ��5
		 	�̸�	 :
		 	���̵�	 :
		 	����	 :
		 	��ȭ��ȣ :
		 	����	 :
		 	
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

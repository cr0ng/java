package day08.ex;

import java.util.Arrays;

public class Ex05_02 {

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
		 	
		 	==>
		 	String[][] friend1 = new String[5][5];
		 	
		 				�̸�		���̵�		����		��ȭ��ȣ		����
		 	ģ��1	 :
		 	ģ��2	 :
		 	ģ��3	 :
		 	ģ��4	 :
		 	ģ��5	 :
		 */
	
		
		for(int i = 0 ; i < friend.length ; i++) {
			friend[i][0] =f1[i];
			friend[i][1] =f2[i];
			friend[i][2] =f3[i];
			friend[i][3] =f4[i];
			friend[i][4] =f5[i];
		}
		
		for(String[] f : friend) {
			System.out.println(Arrays.toString(f));
		}
		
		String[][] friend1 = new String[5][5];
		/*
		for(int i = 0 ; i < friend.length ; i++) {
			friend1[0][i] =friend[i][0];
			friend1[1][i] =friend[i][1];
			friend1[2][i] =friend[i][2];
			friend1[3][i] =friend[i][3];
			friend1[4][i] =friend[i][4];
		}
		*/
		//������ �ڵ�
		for(int i = 0 ; i < friend.length ; i++) {
			for(int j = 0 ; j < friend[i].length ; j++) {
				friend1[i][j] = friend[j][i];
			}
		}
		for(String[] f : friend1) {
			System.out.println(Arrays.toString(f));
		}
		/*
		System.arraycopy(f1,0,friend[0],0,f1.length);
		System.arraycopy(f2,0,friend[1],0,f2.length);
		System.arraycopy(f3,0,friend[2],0,f3.length);
		System.arraycopy(f4,0,friend[3],0,f4.length);
		System.arraycopy(f5,0,friend[4],0,f5.length);
			
		for(String[] f : friend) {
			System.out.println(Arrays.toString(f));
		}
		
		String[][] friend1 = new String[5][5];
		
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
			friend1[i][j] = friend[j][i];
			}
		}
		
		for(String[] f : friend1) {
			System.out.println(Arrays.toString(f));
		}
		*/
	}

}

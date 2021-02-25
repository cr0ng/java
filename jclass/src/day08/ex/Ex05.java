package day08.ex;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		String[] f1 = {"ȫ�浿","hong","hong@increpas.com","010-1111-1111","M"};
		String[] f2 = {"��浿","Gho","gho@increpas.com","010-2222-2222","M"};
		String[] f3 = {"�Ѹ�","dooly","dooly@increpas.com","010-3333-3333","M"};
		String[] f4 = {"����","hee","hee@increpas.com","010-4444-4444","M"};
		String[] f5 = {"������","mikol","kol@increpas.com","010-5555-5555","M"};
		
		String[][] friend = new String[5][5];
		/*
		 	f1 ~ f5 �����͸� �̿��ؼ�
		 	friend �迭�� �����͸� ä�켼��.
		 	
		 				�̸�		���̵�		����		��ȭ��ȣ		����
		 	ģ��1	 :
		 	ģ��2	 :
		 	ģ��3	 :
		 	ģ��4	 :
		 	ģ��5	 :
		 */
		
		
			for(int j = 0 ; j <friend[0].length;j++) {
				friend[0][j] = f1[j];
			}
			for(int j = 0 ; j <friend[1].length;j++) {
				friend[1][j] = f2[j];
			}
			for(int j = 0 ; j <friend[2].length;j++) {
				friend[2][j] = f3[j];
			}
			for(int j = 0 ; j <friend[3].length;j++) {
				friend[3][j] = f4[j];
			}
			for(int j = 0 ; j <friend[4].length;j++) {
				friend[4][j] = f5[j];
			}
			
			System.out.printf("	%7s %8s %12s %17s %7s","�̸�","���̵�","����","��ȭ��ȣ","����");
			System.out.println();
			
			for(int i = 0 ; i < friend.length ; i++) {
				System.out.print("ģ��"+(i+1)+"	: ");
				for(int j = 0 ; j < friend[i].length;j++) {
					
					System.out.printf("%5s",friend[i][j]+"	");
				}
				System.out.println();
			}
		
			
			//�������ڵ�
			for(int i = 0 ; i < friend[0].length ; i++) {
				friend[0][i] =f1[i];
				friend[1][i] =f2[i];
				friend[2][i] =f3[i];
				friend[3][i] =f4[i];
				friend[4][i] =f5[i];
			}
			
			for(String[] f : friend) {
				System.out.println(Arrays.toString(f));
			}
	}

}

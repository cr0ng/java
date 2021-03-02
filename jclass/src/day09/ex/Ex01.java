package day09.ex;
/*
	���� 1]
		5�л��� 3���� ������ ����ϴ� �迭�� ���弼��.
		��, ������ 70 ~ 99 �� ���̷� �����ϰ� �����
		�ϳ��� �迭�� ó���ϼ���
		
			==> int[][] stud = new int[5][3];
		
		3������ 5�л��� ������ ����� �迭�� �����
		�� �迭���� �����͸� �����ؼ� ä����������.
		
			==> int[][] score = new int[3][5];
			
		----------------------------------------------
		
		stud�� score �迭�� �����ϴµ�
		������ ���� ����ϵ��� �迭�� ���� �����ϼ���.
		
			1. �л����� ���� ���
				==> int[][] stud1 = new int[5][4];
				
			2. ���� ����...
				int[][] score1 = new int[3][6];
				
		----------------------------------------------
		
		�л��� ������ ���� ������ ���� ����� �迭�� ���� �����ؼ� ó���ϼ���.
		
		----------------------------------------------
		
		�̸�	����	����	����	����	���	����
		ȫ�浿	95		75		100
		��浿	80		60		50
		...
		����		
		
		�̸�
		����
		����
		����
		����
		���
*/

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		int[][] stud = new int[5][3];
		
		for(int i = 0 ; i < stud.length;i++) {
			for(int j = 0 ; j < stud[i].length;j++) {
				int num = (int)(Math.random()*(99-70+1)+70);
				stud[i][j] = num;
			}
		}
		for(int[] s : stud) {
			System.out.println(Arrays.toString(s));
		}
		
		System.out.println();
		int[][] score = new int[3][5];
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length ; j++) {
				score[i][j]=stud[j][i];
			}
		}
		for(int[] sc : score) {
			System.out.println(Arrays.toString(sc));
		}
		
		System.out.println();
		int[][] stud1 = new int[5][4];
		
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0; j < stud[i].length ; j++) {
				
				stud1[i][j]=stud[i][j];
				int tmp = stud[i][j];
				stud1[i][stud1[i].length-1] += tmp;
			}
		}
		for(int[] s1 : stud1) {
			System.out.println(Arrays.toString(s1));
		}
		
		System.out.println();
		int[][] score1 = new int[3][6];
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length ; j++) {
				score1[i][j]=score[i][j];
				int tmp = score[i][j];
				score1[i][score1[i].length-1] += tmp;
			}
		}
		for(int[] sc1 : score1) {
			System.out.println(Arrays.toString(sc1));
		}
		
		System.out.println();
		int[][] total = new int[4][6];
		for(int i = 0 ; i < stud.length;i++) {
			for(int j = 0 ; j < stud[i].length ; i++) {
				total[i][j]=stud[i][j];
				int tmp = stud[i][j];
				total[i][total[i].length-1] += tmp;
				//total[total.length-1][j] += tmp;
				
			}
		}
		for(int[] t : total) {
			System.out.println(Arrays.toString(t));
		}
		*/
String[] name = {"ȫ�浿", "��浿", "�Ѹ�", "����", "������"};
		
		Object[][] stud = new Object[5][4];
		
		// �̸� ä���
		for(int i = 0 ; i < stud.length ; i++ ) {
			stud[i][0] = name[i];
			for(int j = 1 ; j < stud[i].length ; j++ ) {
				stud[i][j] = (int)(Math.random()*30 + 70);
			}
		}
		
		for(Object[] o : stud) {
			System.out.println(Arrays.toString(o));
		}
		
		Object[][] studTotal = new Object[5][5];
		
		for(int i = 0 ; i < stud.length ; i++ ) {
			System.arraycopy(stud[i], 0, studTotal[i], 0, stud[i].length);
		}
		
		System.out.println();
		for(Object[] o : studTotal) {
			System.out.println(Arrays.toString(o));
		}
		System.out.println();
		// ���� ���
		for(int i = 0 ; i < studTotal.length ; i++ ) {
			
			int total = 0 ;
			for(int j = 1; j <studTotal[i].length - 1 ; j++) {
				total += (int) studTotal[i][j]; 
			}
			studTotal[i][studTotal[i].length - 1] = total;
		}
		
		// Object[] �� ���Ŀ� ����...
		for(Object[] o : studTotal) {
			System.out.println(Arrays.toString(o));
		}

		System.out.println();
		
		String[] ttl = {"�̸�", "����", "����", "����", "����"};
		Object[][] test = new Object[6][5];
		System.arraycopy(ttl, 0, test[0], 0, ttl.length);
		
		for(int i = 1 ; i < test.length; i++ ) {
			System.arraycopy(studTotal[i-1], 0, test[i], 0, studTotal[i-1].length);
		}
		
		for(Object[] o : test) {
			System.out.println(Arrays.toString(o));
		}
	}

}

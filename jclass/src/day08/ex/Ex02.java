package day08.ex;

import java.util.Arrays;

/*
	���� 2]
		5�л��� 3���� ������ ������ ����ϴ� �迭�� ���弼��.
		��, ������ 70 ~ 99 �� ���̷� �����ϰ� �����
		�ϳ��� �迭�� ó���ϼ���
*/
public class Ex02 {

	public static void main(String[] args) {
		
		int[][] score = new int[5][4];
		
		for(int i = 0 ; i < score.length;i++) {
			for(int j = 0 ; j < score[i].length-1;j++) {
				int sc = (int)(Math.random()*(99-70+1)+70);
				score[i][j] = sc;
			}
			
			for(int j = 0 ; j < score[i].length-1;j++) {
				int total = score[i][j];
				score[i][score[i].length-1] += total;
			}
			
			System.out.println(Arrays.toString(score[i]));
		}
	}

}

package day08.ex;

import java.util.Arrays;

/*
 	���� 1]
 		5�л��� 3���� ������ ����ϴ� �迭�� ���弼��.
 		��, ������ 70 ~ 99 �� ���̷� �����ϰ� �����
 		�ϳ��� �迭�� ó���ϼ���
 */
public class Ex01 {

	public static void main(String[] args) {
		int[][] score = new int[5][3];
		
		for(int i = 0 ; i < score.length;i++) {
			for(int j = 0 ; j < score[i].length;j++) {
				int sc = (int)(Math.random()*(99-70+1)+70);
				score[i][j] = sc;
			}
			System.out.println(Arrays.toString(score[i]));
		}
		
	}

}

package day09.ex;

import java.util.Arrays;

/*
���� 3 ]
	10 �л��� 5���� ������ �Է��ϰ� ������ ���ϼ���.(�������� �����ϴ� �迭)
	
	�̰��� ������ ���� �л����� ���ʷ� ����ϼ���.
	����� �����͸� �ϳ��� ������ ó���ϵ��� �ϼ���.
*/
public class Ex03 {

	public static void main(String[] args) {
		
		int[][] score = new int[10][6];
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length-1 ; j++) {
				
				int sc = (int)(Math.random()*101);
				score[i][j] = sc; 
				
				int tmp = score[i][j];
				score[i][score[i].length-1] += tmp;
			}
			
		}
		for(int[] s : score) {
			System.out.println(Arrays.toString(s));
		}
		
		System.out.println();
		
		for(int i = 0 ; i < score.length - 1; i++) {
			for(int j = i+1; j < score.length ; j++) {
				int t1 = score[i][5];
				int t2 = score[j][5];
				
				if(t2 > t1) {
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		
		}
		
		for(int[] s1 : score) {
			System.out.println(Arrays.toString(s1));
		}
		
	}

}

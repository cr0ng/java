package day08.ex;

import java.util.Arrays;

/*
 ���� 3]
 	2�� �������� ���� �迭�� 
 	������ �������� �������� �����ϼ���.
 	
 	�ɼ� ]
 		ù��° ��������� ����,
 		�ι�° ���� ������ ����,
 		����° ���� ������ ����
 */
public class Ex03 {

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
		
		
		System.out.println("##���� �������� ����##");
		for(int i = 0 ; i < score.length - 1; i++) {
			for(int j = i+1; j < score.length ; j++) {
				int t1 = score[i][3];
				int t2 = score[j][3];
				
				if(t2 > t1) {
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		for(int[] t : score) {
			System.out.println(Arrays.toString(t));
		}
		
		
		System.out.println("##ù��° �������� ����##");
		for(int i = 0 ; i < score.length - 1; i++) {
			for(int j = i+1; j < score.length ; j++) {
				int t1 = score[i][0];
				int t2 = score[j][0];
				
				if(t2>t1) {
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
			
		}
		for(int[] t : score) {
			System.out.println(Arrays.toString(t));
		}
		
		System.out.println("##�ι�° �������� ����##");
		for(int i = 0 ; i < score.length - 1; i++) {
			for(int j = i+1; j < score.length ; j++) {
				int t1 = score[i][1];
				int t2 = score[j][1];
				
				if(t2>t1) {
					int[] tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		for(int[] t : score) {
			System.out.println(Arrays.toString(t));
		}
		
			System.out.println("##����° �������� ����##");
			for(int i = 0 ; i < score.length - 1; i++) {
				for(int j = i+1; j < score.length ; j++) {
					int t1 = score[i][2];
					int t2 = score[j][2];
					
					if(t2>t1) {
						int[] tmp = score[i];
						score[i]= score[j];
						score[j] = tmp;
					}
				}
		}
			for(int[] t : score) {
				System.out.println(Arrays.toString(t));
			}
		
	}

}

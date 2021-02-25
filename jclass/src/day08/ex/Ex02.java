package day08.ex;

import java.util.Arrays;

/*
	문제 2]
		5학생의 3과목 점수와 총점을 기억하는 배열을 만드세요.
		단, 점수는 70 ~ 99 점 사이로 랜덤하게 만들고
		하나의 배열로 처리하세요
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

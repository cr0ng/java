package day09.ex;

import java.util.Arrays;

/*
문제 3 ]
	10 학생의 5과목 점수를 입력하고 총점을 구하세요.(총점까지 관리하는 배열)
	
	이것을 성적이 좋은 학생부터 차례로 출력하세요.
	출력은 데이터를 하나씩 꺼내서 처리하도록 하세요.
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

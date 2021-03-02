package day10.ex;

import java.util.Arrays;

/*
 	2차원 정수배열의 멤버변수 score를 만들고(10학생 5과목)
 	
 	1. score에 점수를 랜덤하게 입력하는 함수
 	2. score에 입력된 점수를 더해서 총점을 계산해주는 함수          
 	3. score의 학생들을 총점을 기준으로 내림차순 정렬해주는 함수
 	
 	를 계산해서 실행하고 결과를 출력하세요.
 */
public class Ex02 {
	
	int[][] sc1 = new int[10][5];
	int[][] score = new int[10][6];
	
	public Ex02(){
		print_score();
		add_total();
		desc_score();
	}
	
	public static void main(String[] args) {
		new Ex02();

	}
	
	public void print_score(){
		
		System.out.println("10 학생의 5과목 점수");
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				sc1[i][j] = (int)(Math.random()*101);
			}
			System.out.print((i+1)+"번 학생 ");
		System.out.println(Arrays.toString(sc1[i]));
		}
		System.out.println();
	}
	
	void add_total () {
		System.out.println("10 학생의 5과목 점수와 총점");
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				score[i][j] =sc1[i][j];
				int tmp = score[i][j];
				score[i][5] +=tmp;
			}
			System.out.print((i+1)+"번 학생 ");
			System.out.println(Arrays.toString(score[i]));
		}	
		System.out.println();
	}
	
	void desc_score() {
		System.out.println("10 학생 총점으로 내림차순");
		for(int i = 0 ; i < 9 ; i++) {
			for(int j = i+1 ; j < 10 ; j++) {
				int t1 = score[i][5];
				int t2 = score[j][5];
				
				if(t2 > t1) {
					int[] tmp = score[i];
					score[i] =score[j];
					score[j] = tmp;
				}
			}
			System.out.print((i+1)+"순위 ");
			System.out.println(Arrays.toString(score[i]));
		}
	}

}

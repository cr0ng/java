package day07;
/*
 	5명의 학생의 점수를 기억할 배열을 만드는데 
 	그 배열에서 총점도 같이 관리하도록 하고
 	랜덤하게 학생들의 점수를 입력하고
 	총점을 구하고 평균을 산출해서 
 	출력해주는 프로그램을 작성하세요.
 */
public class Test01 {

	public static void main(String[] args) {
		//배열을 기억할 변수 만들고
		int[] score;
		score = new int[6];
		
		// 5명의 점수를 만들어서 입력하고
		for(int i = 0 ; i < score.length - 1; i++){
		
			int num = (int)(Math.random()*41+60);
			score[i] = num;
		}
		
		// 총점을 계산한다.
		for(int i = 0 ; i < score.length - 1 ; i++) {
			/*
			int tmp = score[i];
			int sum = score[score.length-1];
			score[score.length-1] = sum + tmp;
			*/
			score[score.length-1]=score[score.length-1]+score[i];
		}
		
		// 평균계산하기
		double avg = score[score.length-1] / (score.length-1.0);
		
		// 출력
		System.out.print("학생들 과목 점수 : ");
		for(int i = 0; i < score.length-1;i++) {
			System.out.print(score[i]+" | ");
		}
		System.out.println();
		
		int total = score[score.length-1];
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}

}
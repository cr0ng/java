package day10.ex;

import java.util.Arrays;

/*
 	5과목의 점수를 랜덤하게 발생시켜서 배열로 반환해주는 함수를 작성하고
 	실행해서 결과를 출력하세요.
 	
 	전역변수로 배열변수를 만들어서 실행하는 것이 아닙니다.
 */
public class Ex02_00 {

	public Ex02_00() {
		//1. 내용만 바로 살펴보는 방법
		System.out.println(Arrays.toString(getscore()));
		
		//2. 변수에 반환값을 기억시켜서 출력하는 방법
		int[] score = getscore();
		// 내용 출력
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print(score[i] + ", ");
		}
	}
	
	public static void main(String[] args) {
		new Ex02_00();
	}
	
	public int[] getscore() {
		int[] score = new int[5];
		
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = (int)(Math.random()*101);
		}
		
		return score;
	
	}
	

}

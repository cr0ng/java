package day10.ex;

import java.util.Arrays;

/*
 	5������ ������ �����ϰ� �߻����Ѽ� �迭�� ��ȯ���ִ� �Լ��� �ۼ��ϰ�
 	�����ؼ� ����� ����ϼ���.
 	
 	���������� �迭������ ���� �����ϴ� ���� �ƴմϴ�.
 */
public class Ex02_00 {

	public Ex02_00() {
		//1. ���븸 �ٷ� ���캸�� ���
		System.out.println(Arrays.toString(getscore()));
		
		//2. ������ ��ȯ���� �����Ѽ� ����ϴ� ���
		int[] score = getscore();
		// ���� ���
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

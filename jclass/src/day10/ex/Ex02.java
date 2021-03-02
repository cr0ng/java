package day10.ex;

import java.util.Arrays;

/*
 	2���� �����迭�� ������� score�� �����(10�л� 5����)
 	
 	1. score�� ������ �����ϰ� �Է��ϴ� �Լ�
 	2. score�� �Էµ� ������ ���ؼ� ������ ������ִ� �Լ�          
 	3. score�� �л����� ������ �������� �������� �������ִ� �Լ�
 	
 	�� ����ؼ� �����ϰ� ����� ����ϼ���.
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
		
		System.out.println("10 �л��� 5���� ����");
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				sc1[i][j] = (int)(Math.random()*101);
			}
			System.out.print((i+1)+"�� �л� ");
		System.out.println(Arrays.toString(sc1[i]));
		}
		System.out.println();
	}
	
	void add_total () {
		System.out.println("10 �л��� 5���� ������ ����");
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				score[i][j] =sc1[i][j];
				int tmp = score[i][j];
				score[i][5] +=tmp;
			}
			System.out.print((i+1)+"�� �л� ");
			System.out.println(Arrays.toString(score[i]));
		}	
		System.out.println();
	}
	
	void desc_score() {
		System.out.println("10 �л� �������� ��������");
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
			System.out.print((i+1)+"���� ");
			System.out.println(Arrays.toString(score[i]));
		}
	}

}

package day09.ex;

import java.util.Arrays;

/*
���� 2 ]
	1.
	�ټ����� ���� ������ ����� �迭(circle)�� ���弼��.
	���� ������ ������, �ѷ�, ���̸� ����ϵ��� �ϼ���.
	�������� �����ϰ� ���� �Է��ϼ���.
	
	------------------------------------------
	2. �� �迭�� 90�� ȸ����Ų �迭�� ���弼��.
*/
public class Ex02 {

	public static void main(String[] args) {
		
		double[][] circle = new double[5][3];
		

		for(int i = 0 ; i < circle.length ; i++) {
			
			int r = (int)(Math.random()*100+1);
			
			for(int j = 0; j < circle[i].length ; j++) {
				
				switch(j) {
				case 0 :
					circle[i][0] = r;
					break;
				case 1 : 
					circle[i][1] = 2*3.14*r;
					break;
				case 2 :
					circle[i][2] = 3.14*r*r;
					break;
				default :
					break;
				}
			}
		}
		for(double[] c : circle)
		System.out.println(Arrays.toString(c));
		
		System.out.println();
		
		double[][] circle90 = new double[3][5];
		
		for(int i = 0 ; i < circle90.length ; i++) {
			for(int j = 0 ; j < circle90[i].length ; j++) {
				circle90[i][j] = circle[j][i];
			}
		}
		for(double[] c90 : circle90)
			System.out.println(Arrays.toString(c90));
	}
}

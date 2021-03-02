package day09.ex;

import java.util.Arrays;

/*
문제 2 ]
	1.
	다섯개의 원의 정보를 기억할 배열(circle)을 만드세요.
	원의 정보는 반지름, 둘레, 넓이를 기억하도록 하세요.
	반지름은 랜덤하게 만들어서 입력하세요.
	
	------------------------------------------
	2. 위 배열을 90도 회전시킨 배열을 만드세요.
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

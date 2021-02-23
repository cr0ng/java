package day07.ex;

import java.util.Arrays;

/*
 반지름 5개를 랜덤하게 기억한 후
	각각의 반지름을 가진 원의 넓이를 계산하는 프로그램을
	작성하세요.
	원의 넓이 역시 배열로 기억하고 있다가 한번에 출력하도록 하세요.
	==>		float[]	area;
 */
public class Ans02 {

	public static void main(String[] args) {
		float[] area = new float[10];
		
		for(int i = 0 ; i < 5 ; i++) {
			int r = (int)(Math.random()*10+1); 
			area[i]=r;
			
			area[i+5] = (float) (area[i] * area[i] * 3.14);
		}
		System.out.println(Arrays.toString(area));
		
		
	}

}

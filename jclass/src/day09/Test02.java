package day09;

import java.util.Arrays;

//깊은복사
public class Test02 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
			num[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(num));
		
		int[] no = new int[5];
		
		// 3 ~ 7까지 복사해보자.
		for(int i = 0 ; i < no.length ; i++) {
			no[i] = num[i+2];
		}
		System.out.println(Arrays.toString(no));
		
		//no[1] = 10;
		no[1] = 10;
		
		//출력
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(no));
		
		System.out.println();
		
		/*
		 	System.arraycopy(데이터가있는배열,추출할시작위치, 데이터를채울배열,채우기시작할위치,채울갯수);
		 */
		
		int[] no2 = new int[5];
		System.arraycopy(num, 2,no2, 0,no2.length);
		System.out.println(Arrays.toString(no2));
		System.out.println();
		
		no2[1] =1000;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(no2));
	}

}

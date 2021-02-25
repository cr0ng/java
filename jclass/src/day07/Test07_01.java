package day07;

import java.util.*;
public class Test07_01 {

	public static void main(String[] args) {
		int[] no1 = {1,2,3,4,5};
		//no2
		int[] no2 = new int[3];
		for(int i = 0 ; i < no2.length; i++) {
			no2[i] = no1[i+1];
		}
		System.out.println(Arrays.toString(no1));
		System.out.println(Arrays.toString(no2));
		
		//no1의 세번째 방의 데이터를 8로 변경한다.
		no1[2] = 8;
		System.out.println("##### no1[2]=8로 변경 후 #####");
		System.out.println(Arrays.toString(no1));
		System.out.println(Arrays.toString(no2));
		
		
	}

}

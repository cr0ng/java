package day10;

import java.util.Arrays;

/*
 	int[][] no = {
 	{1,2,3,4,5},
 	{2,3,4,5,6},
 	{3,4,5,6,7},
 	{4,5,6,7,8},
 	{5,6,7,8,9},
 	{4,5,6,7,8},
 	{3,4,5,6,7}
 	
 	�� �迭���� ���� �迭�� 2��° �����͵�� ���� �迭
 	5��° �����͵�� ���� �迭�� ���弼��.
 	
 	�� �ϳ��� �ݺ������� ���μ� ó���ϼ���.
 */
public class Test00 {

	public static void main(String[] args) {
		
		int[][] no = {
			 	{1,2,3,4,5},
			 	{2,3,4,5,6},
			 	{3,4,5,6,7},
			 	{4,5,6,7,8},
			 	{5,6,7,8,9},
			 	{4,5,6,7,8},
			 	{3,4,5,6,7}
		};
		
		
		int[] no1 = new int[7]; 
		int[] no2 = new int[7];
		
		/*
		for(int i = 0 ; i < no.length ; i++) {
			for(int j = 0 ; j < no1.length; j++) {
				no1[j] = no[i][1];
				no2[j] = no[i][4];
			}
			
		}
		
		for(int i = 0 ; i < no1.length ; i++) {
			System.out.println(Arrays.toString(no1[i]));
		}
	
		for(int i = 0 ; i < no2.length ; i++) {
			System.out.println(Arrays.toString(no2));
		}
		*/
		
		for(int i = 0 ; i < no.length ; i++) {
			for(int j = 0 ; j < no[i].length; j++) {
				if(j==1) {
					no1[i] = no[i][j];
				}else if (j ==4) {
					no2[i] = no[i][j];
				}
			}
		}
			System.out.println(Arrays.toString(no1));
	
			System.out.println(Arrays.toString(no2));
		
	}

}

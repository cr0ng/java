package day09;

import java.util.Arrays;

//��������
public class Test02 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
			num[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(num));
		
		int[] no = new int[5];
		
		// 3 ~ 7���� �����غ���.
		for(int i = 0 ; i < no.length ; i++) {
			no[i] = num[i+2];
		}
		System.out.println(Arrays.toString(no));
		
		//no[1] = 10;
		no[1] = 10;
		
		//���
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(no));
		
		System.out.println();
		
		/*
		 	System.arraycopy(�����Ͱ��ִ¹迭,�����ҽ�����ġ, �����͸�ä��迭,ä����������ġ,ä�ﰹ��);
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

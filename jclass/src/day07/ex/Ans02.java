package day07.ex;

import java.util.Arrays;

/*
 ������ 5���� �����ϰ� ����� ��
	������ �������� ���� ���� ���̸� ����ϴ� ���α׷���
	�ۼ��ϼ���.
	���� ���� ���� �迭�� ����ϰ� �ִٰ� �ѹ��� ����ϵ��� �ϼ���.
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

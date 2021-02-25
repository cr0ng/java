package day07.ex;

import java.util.Arrays;

/*
 	int[][] stud = new int[5][6];

 	int[] score = new int[6];
 	
 	5�л��� 5������ ������ ����� �迭�� �����
 	�����ϰ� ������ �Է��ؼ�
 	
 	�� ������ �濡�� ������ ����ؼ� �ְ�
 	
 	stud[i] = score;
 	
 	������ ���� ���� ������� ������ �ؼ� 
 	����ϼ���.
 	
 	���� ]
 		�迭�ȿ� �ٽ� �迭�� ���� �� �ִ�.
 		�̶� ���ǻ����� �迭���� �ϳ��� �������� �迭�̶�� ���� ����ؾ� �Ѵ�.
 	
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int[][] stud = new int[5][6];

		/*
		 int[] num = new int[6];
		 stud[2] = num;
		 stud[1];
		 */
		
		for(int i = 0 ; i < stud.length ; i++) {
			//stud[i] ==> �迭�� ������ �ȴ�.
			for(int j = 0 ; j < stud[i].length - 1 ; j++) {
				// stud[i] ==> �迭
				// stud[i].length ==> i��°�� �迭�� ����
				int score = (int)(Math.random()*41 + 60);
				stud[i][j] = score;
				
				//1.
				stud[i][stud[i].length-1] += score;
			}
			
			//System.out.println(Arrays.toString(stud[i]));
			
			// ���� ���
			// ������ i��° �濡 ����ִ� �迭�� ���� �����̴�.
			
			/*
			2.
			for(int j = 0 ; j < stud[i].length -1 ; j ++) {
				int no = stud[i][j];
				stud[i][stud[i].length -1]+= no;
			}
			*/
			System.out.println(Arrays.toString(stud[i]));
			
		}
		
		// �����Ѵ�
		// ����� ������ ���� ���� ����� �� �տ� ������ �ϸ� �ȴ�.
		// �� �� ������ ������ �ּҸ� �� ���ڸ��� �Ű��ش�.
		for(int i = 0 ; i < stud.length -1 ; i++) {
			for(int j = i + 1 ; j < stud.length ; j++) {
				int t1 = stud[i][5];
				int t2 = stud[j][5];
				if(t2 > t1) {
					int[] tmp = stud[i];	// �迭�ּҸ� ����� �ӽú���
					stud[i] = stud[j];	// j��° �ּҸ� i��°�� ���. i��°�� j��°���� ���� �ּҰ� ���ȴ�.
					stud[j] = tmp;	// �ӽú����� ���� �ּҸ� j��°�� �ٲ��ְ�
				}
			}
			
		}
		
		System.out.println("#######�������� ����#######");
		for(int[] t : stud) {
			System.out.println(Arrays.toString(t));
		}
		
		// ����1 ] �� ����� ù��° ������ �������� �����ؼ� ����ϼ���.
		for(int i = 0 ; i < stud.length-1;i++) {
			for(int j = i+1; j < stud.length; j++) {
				int s1 = stud[i][0];
				int s2 = stud[j][0];
				if(s2 > s1) {
					int[] tmp = stud[i];
					stud[i] = stud[j];	
					stud[j] = tmp;
				}
			}
		}
		
		System.out.println("###ù��° �������� ����###");
		for(int[] s : stud) {
			System.out.println(Arrays.toString(s));
		}
		
	}

}

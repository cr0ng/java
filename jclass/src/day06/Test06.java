package day06;

/*
	5 �л��� ����(����)�� �����ϰ� �Է��� ��
	������ ����� ���ؼ� ����ϼ���.
	
	��, �л��� ������ �迭�� ó���ϼ���.
 */
public class Test06 {

	public static void main(String[] args) {
		// �迭���� �����
		int[] score = new int[5];
		
		// ��պ���
		int total = 0;
		double avg = 0.0;
		
		// �ټ��� �����Է��ϰ�
		for(int i = 0 ; i < score.length ; i++ ) {
			score[i] = (int)(Math.random() * 41 + 60);
		}
		
		// ������ ���Ѵ�.
		for(int i = 0 ; i < score.length ; i++ ) {
			total = total + score[i];
		}
		
		// ����� ���Ѵ�.
		avg = total / (double) score.length;
		/*
		 	�迭�� ũ�⿡ ����Ǵ� ������
		 	�� �� ������ 
		 		�迭�ּ�.length
		 	�� �̿��ؼ� ó���ϵ��� �Ѵ�.
		 */
		
		 // ����Ѵ�.
		for(int no : score) {
			System.out.print(no + ", ");
		}
		System.out.println();
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}

/*
	��ȭ�н� ]
		�� ������ ���� �������� �����ϴ� �迭�� �����
		�� ������ �濡�� ������ �����ϵ��� �ؼ�
		�� ������ ó���� ������.
 */

}
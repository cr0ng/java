package day06.ex;
/*
 	5�ڸ� ���ڸ� (10000 ~ 99999) �����ϰ� �߻��� ��
 	�� �ڸ� ������ ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex03 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*(99999-10000+1)+10000);
		System.out.println("5�ڸ� ���� ���� ��� : "+num);
		
		int no ;
		int tmp = num;
		int sum =0;
		
		for(int i = 0 ; i < 5; i++) {
			no = tmp % 10;
			tmp = tmp /10;
			sum += no;
		
		}
		System.out.println("�� �ڸ����� �� : "+sum);
	}

}

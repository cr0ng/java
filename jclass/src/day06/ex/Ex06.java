package day06.ex;
/*
 	���ڸ��� ������ ���� 10���� �߻����Ѽ� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex06 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0;i<10;i++) {
			int n = (int)(Math.random()*(99-10+1)+10);
			System.out.print(n + " ");
			sum += n;
		}
		System.out.println();
		System.out.println("10�� ������ �� : " + sum);
	}

}

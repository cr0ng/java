package day03;
/*
	���� 1]
	   3�ڸ� ���ڸ� �����ϰ� �߻����Ѽ� 
	   ���ڸ� �̸��� ���� ���ڸ� ���� ����ϼ���.
*/
public class Ex01 {

	public static void main(String[] args) {
		int hi = 999;
		int lo = 100;
		int num = 0;
		
		num = (int)(Math.random()*(hi-lo+1)+lo);
		System.out.println("ó�� ������ : " + num);
		
		num /= 100;
		num *= 100;
		
		System.out.println("���ڸ� �̸� ������ : " + num);
	}

}

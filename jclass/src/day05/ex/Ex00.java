package day05.ex;
/*
1 ~ 100 ���� ���� �����ִ� ���α׷��� �ۼ��ϼ���..
*/
public class Ex00 {

	public static void main(String[] args) {
		// �հ踦 ����� ����. 0���� �ʱ�ȭ �صд�.
				int sum = 0;
				
				for(int i = 0; i < 100; i++) {
					sum = sum + (i + 1);
				}
				
				System.out.println("1 ~ 100 ������ ���� " + sum + "�Դϴ�.");
	}

}

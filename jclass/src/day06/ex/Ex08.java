package day06.ex;
/*
    ù���� 1���� �����ϰ� �������� ������ 2�踦 �����Ѵٸ�
    ����° 1����� ������ �� �ִ��� ������ִ� ���α׷��� �ۼ��ϼ���.
 */

public class Ex08 {

	public static void main(String[] args) {
		
		int sum = 0;	// �� �ݾ�
		int day = 1;	// �� ��
		int save = 1;	// �����
		
		while(true) {
			
			sum = sum + save;
				
			if(sum >=1000000000) {
				break;
			}
			save = save * 2;
			day++;
		}
			System.out.println("1����� �������� "+day+"���� �ʿ��մϴ�.");
	}

}

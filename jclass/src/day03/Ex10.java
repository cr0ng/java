package day03;
/*
 ���� 10 ]
	1000 ~ 3000 �� ������ �⵵�� �����ϰ� �߻����Ѽ�
	�ش� �⵵�� �������� ��������� �����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	���� ]
		������ 4,100,400 ���� ���� �������� �ش� �����̶� �Ѵ�.
		100���� ������ �������� ���
 */
public class Ex10 {

	public static void main(String[] args) {
		int year = (int)(Math.random()*(3000-1000+1)+1000);
		
		if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0 ) {
			System.out.println(year + "���� �����̴�");
			}else {
				System.out.println(year +"���� ����̴�");
		}
	}

}

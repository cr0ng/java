package day02;
/*
 	���� 6 ]
 		1���� 365.2426���̴�.
 		�̰��� ���� ��ð� ��� �� ������ ����ؼ� ����ϼ���.
 		
 		���� ]
 			1�� : 24�ð�
 			1�ð� : 60��
 			1�� : 60��
 			
 			���� 0.5���� 24 * 0.5 �ð��̹Ƿ� 12�ð��� �ȴ�.
 */
public class Ex06 {

	public static void main(String[] args) {
	/*
		double year = 365.2426;
		
		double hour, min, sec;

		int day = (int)year;
		double x = year - (double)day;
		System.out.println(day + "��");
		
		hour = x*24;
		x = x - hour;
		System.out.println((int)hour + "�ð�");
	*/
		
	double tday = 365.2426;
	int day, hour, min, sec, tmp;
	
	// �ϼ��� ���
	day = (int) tday;
	
	// �ϼ��� �� ����� �ʴ����� ��ȯ�Ѵ�.(tmp)
	tmp = (int)((tday - day)*24*60*60);
	
	// �ð� ����ϰ�
	hour = tmp / 3600;
	tmp %= 3600;
	
	// �� ���
	min = tmp / 60;
	
	// �� ���
	sec = tmp % 60;
	
	System.out.println("�ϳ��� " + tday + "�̰� �̰��� �ʴ������� ȯ���ϸ�");
	System.out.println(day + "�� " + hour + "�ð� " + min + "�� " + sec + "�� ");
		
	}

}

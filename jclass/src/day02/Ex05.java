package day02;
/*
 	���� 5 ]
 		54232������ ���θ� ���.
 		�������� �����Ϸ��� �Ѵ�.
 		
 		�� �� �����Ϸ��� �츮���� ȭ�� �������� �� ������ ��� �ʿ����� ����ؼ� ���
 		��, ū ȭ�� ���� ���ҵǰ� ���� �ݾ����� ���� ȭ�� �� ����
 		
 		ȭ�����
 			10000
 			1000
 			100
 			10
 			1
 		�� ����ؼ� ó���ϼ���.
 */
public class Ex05 {

	public static void main(String[] args) {
	/*
		int money = 54232;
		
		int m1 = money / 10000;
		int change = money - m1* 10000;
		
		System.out.println("10000��  : " + m1 + "��");
		
		int m2 = change / 1000;
		change = change - m2*1000;
		System.out.println("1000�� : " + m2 + "��");
		
		int m3 = change / 100;
		change = change - m3*100;
		System.out.println("100�� : " + m3 + "��");
		
		int m4 = change / 10;
		change = change - m4*10;
		System.out.println("10�� : " + m4 + "��");
		
		int m5 = change / 1;
		change = change - m5*1;
		System.out.println("1�� : " + m5 + "��");
	*/
		
	//������ �ڵ�
		int man, chun, baek, ten, il, money, tmoney;
		money = 54232;
		tmoney = money;
		
		man = tmoney / 10000;
		tmoney %= 10000;
		
		chun = tmoney / 1000;
		tmoney %= 1000;
		
		baek = tmoney / 100;
		tmoney %= 100;
		
		ten = tmoney / 10;
		tmoney %= 10;
		
		il = tmoney / 1;
		tmoney %= 1;
		
		System.out.println("�� ���� �ݾ� : " + money);
		System.out.println("����¥�� : " + man);
		System.out.println("õ��¥�� : " + chun);
		System.out.println("���¥�� : " + baek);
		System.out.println("�ʿ�¥�� : " + ten);
		System.out.println("�Ͽ�¥�� : " + il);
	}

}
